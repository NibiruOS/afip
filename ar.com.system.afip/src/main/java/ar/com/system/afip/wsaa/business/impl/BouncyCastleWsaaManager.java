package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.XmlConverter;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import com.google.common.base.Throwables;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.security.auth.x500.X500Principal;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.base.Strings;

public class BouncyCastleWsaaManager implements WsaaManager {
    static final String SIGNING_ALGORITHM = "SHA512withRSA";
    private final WsaaDao wsaaDao;
    private final SetupDao setupDao;
    private final LoginCMS loginCms;
    private final XmlConverter xmlConverter;

    @Inject
    public BouncyCastleWsaaManager(WsaaDao wsaaDao,
                                   SetupDao setupDao,
                                   LoginCMS loginCms,
                                   XmlConverter xmlConverter) {
        this.wsaaDao = checkNotNull(wsaaDao);
        this.setupDao = checkNotNull(setupDao);
        this.loginCms = checkNotNull(loginCms);
        this.xmlConverter = checkNotNull(xmlConverter);
    }

    @Override
    public void initializeKeys() {
        try {
            CompanyInfo info = wsaaDao.loadActiveCompanyInfo();
            KeyPair keyPair = buildKeys();
            wsaaDao.saveCompanyInfo(new CompanyInfo(info.getId(),
                    info.getName(),
                    info.isActive(),
                    info.getUnit(),
                    info.getCuit(),
                    toPem(keyPair.getPublic()),
                    toPem(keyPair.getPrivate()),
                    null,
                    info.getGrossIncome(),
                    info.getActivityStartDate(),
                    info.getTaxCategory(),
                    info.getAddress(),
                    info.getLocation(),
                    info.getAlias()));
        } catch (IOException e) {
            Throwables.propagate(e);
        }
    }

    @Override
    public String buildCertificateRequest() {
        try {
            CompanyInfo companyInfo = wsaaDao.loadActiveCompanyInfo();

            JcaPEMKeyConverter converter = new JcaPEMKeyConverter();

            PrivateKeyInfo privateKeyInfo = privateKeyFromPem(companyInfo.getPrivateKey());
            PrivateKey privateKey = converter.getPrivateKey(privateKeyInfo);
            SubjectPublicKeyInfo subjectPublicKeyInfo = publicKeyFromPem(companyInfo.getPrivateKey(),
                    companyInfo.getPublicKey());
            PublicKey publicKey = converter.getPublicKey(subjectPublicKeyInfo);

            X500Principal subject = new X500Principal(companyInfo.certificateSource());
            ContentSigner signGen = new JcaContentSignerBuilder(SIGNING_ALGORITHM)
                    .build(privateKey);

            PKCS10CertificationRequest csr = new JcaPKCS10CertificationRequestBuilder(
                    subject, publicKey).build(signGen);

            return toPem(csr);
        } catch (IOException | OperatorCreationException e) {
            throw Throwables.propagate(e);
        }
    }

    @Override
    public void updateCertificate(@Nonnull String certificate) {
        checkNotNull(certificate);
        CompanyInfo info = wsaaDao.loadActiveCompanyInfo();
        wsaaDao.saveCompanyInfo(new CompanyInfo(info.getId(),
                info.getName(),
                info.isActive(),
                info.getUnit(),
                info.getCuit(),
                info.getPublicKey(),
                info.getPrivateKey(),
                certificate,
                info.getGrossIncome(),
                info.getActivityStartDate(),
                info.getTaxCategory(),
                info.getAddress(),
                info.getLocation(),
                info.getAlias()));
    }

    @Override
    public Credentials login(@Nonnull Service service) {
        checkNotNull(service);
        try {
            CompanyInfo companyInfo = wsaaDao.loadActiveCompanyInfo();
            checkState(!Strings.isNullOrEmpty(companyInfo.getName()),
                    "Debe configurar el nombre de la empresa antes de realizar el login");
            checkState(!Strings.isNullOrEmpty(companyInfo.getUnit()),
                    "Debe configurar la unidad oranizacional  antes de realizar el login");
            checkState(!Strings.isNullOrEmpty(companyInfo.getCuit()),
                    "Debe configurar el CUIT antes de realizar el login");
            checkState(!Strings.isNullOrEmpty(companyInfo.getPrivateKey()),
                    "Debe configurar la clave privada antes de realizar el login");
            checkState(!Strings.isNullOrEmpty(companyInfo.getPublicKey()),
                    "Debe configurar la clave publica antes de realizar el login");
            checkState(!Strings.isNullOrEmpty(companyInfo.getCertificate()),
                    "Debe configurar el certificado antes de realizar el login");
            Setup setup = setupDao.readSetup();

            X509CertificateHolder certificateHolder = fromPem(companyInfo
                    .getCertificate());
            CertificateFactory certFactory = CertificateFactory
                    .getInstance("X.509");
            X509Certificate certificate = (X509Certificate) certFactory
                    .generateCertificate(new ByteArrayInputStream(
                            certificateHolder.getEncoded()));

            PrivateKeyInfo privateKeyInfo = privateKeyFromPem(companyInfo.getPrivateKey());
            JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
            PrivateKey privateKey = converter.getPrivateKey(privateKeyInfo);

            String cms = LoginTicketRequest
                    .create(setup.useSourceAndDestination()
                                    ? companyInfo.loginSource()
                                    : null,
                            service,
                            setup.useSourceAndDestination()
                                    ? setup.getEnvironment()
                                    : null)
                    .toXml(xmlConverter)
                    .toCms(certificate, privateKey)
                    .toString();

            String loginTicketResponseXml = loginCms.loginCms(cms);

            LoginTicketResponse response = xmlConverter
                    .fromXml(LoginTicketResponse.class, loginTicketResponseXml);

            return response.getCredentials();
        } catch (IOException | CertificateException e) {
            throw Throwables.propagate(e);
        }
    }

    private static String toPem(Object data) throws IOException {
        try (StringWriter out = new StringWriter();
             JcaPEMWriter pem = new JcaPEMWriter(out)) {
            pem.writeObject(data);
            pem.flush();
            return out.toString();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T fromPem(String data) throws IOException {
        try (PEMParser parser = new PEMParser(new StringReader(data))) {
            return (T) parser.readObject();
        }
    }

    private static PrivateKeyInfo privateKeyFromPem(String privateKeyData) throws IOException {
        Object result = fromPem(privateKeyData);
        if (result instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) result;
        } else if (result instanceof PEMKeyPair) {
            PEMKeyPair pemKeyPair = (PEMKeyPair) result;
            return pemKeyPair.getPrivateKeyInfo();
        } else {
            throw new IllegalArgumentException("Clave privada no soportada");
        }
    }

    private static SubjectPublicKeyInfo publicKeyFromPem(String privateKeyData,
                                                         String publicKeyData) throws IOException {
        SubjectPublicKeyInfo result = toPublicKey(privateKeyData);
        if (result == null) {
            result = toPublicKey(publicKeyData);
        }
        if (result == null) {
            throw new IllegalArgumentException("Clave publica no soportada");
        }
        return result;
    }

    private static SubjectPublicKeyInfo toPublicKey(String data) throws IOException {
        Object privateKeyResult = fromPem(data);
        if (privateKeyResult instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) privateKeyResult;
        } else if (privateKeyResult instanceof PEMKeyPair) {
            PEMKeyPair pemKeyPair = (PEMKeyPair) privateKeyResult;
            return pemKeyPair.getPublicKeyInfo();
        } else {
            return null;
        }
    }

    private static KeyPair buildKeys() {
        try {

            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            return keyGen.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw Throwables.propagate(e);
        }
    }
}
