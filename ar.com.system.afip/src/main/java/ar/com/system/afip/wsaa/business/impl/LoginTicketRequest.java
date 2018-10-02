package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.XmlConverter;
import com.google.common.base.Charsets;
import com.google.common.base.Throwables;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.*;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

@Root(name = "loginTicketRequest")
public class LoginTicketRequest {
    public static LoginTicketRequest create(String source, Service service, String environment) {
        Calendar generation = Calendar.getInstance();
        Calendar expiration = Calendar.getInstance();
        generation.add(Calendar.MINUTE, -10);
        expiration.add(Calendar.HOUR_OF_DAY, 1);

        return new LoginTicketRequest(
                new Header(source,
                        String.format("cn=%s,o=afip,c=ar,serialNumber=CUIT 33693450239", environment),
                        generation.getTime().getTime() / 1000,
                        generation.getTime(),
                        expiration.getTime()),
                service.toString().toLowerCase(),
                "1.0");
    }

    @Element
    private final Header header;
    @Element
    private final String service;
    @Attribute
    private final String version;

    private LoginTicketRequest(Header header, String service, String version) {
        this.header = checkNotNull(header);
        this.service = checkNotNull(service);
        this.version = checkNotNull(version);
    }

    public Header getHeader() {
        return header;
    }

    public String getService() {
        return service;
    }

    public String getVersion() {
        return version;
    }

    public Xml toXml(XmlConverter xmlConverter) {
        return new Xml(xmlConverter);
    }

    public class Xml {
        private final XmlConverter xmlConverter;

        private Xml(XmlConverter xmlConverter) {
            this.xmlConverter = checkNotNull(xmlConverter);
        }

        @Override
        public String toString() {
            return xmlConverter.toXml(LoginTicketRequest.this);
        }

        public Cms toCms(X509Certificate signCert, PrivateKey privateKey) {
            return new Cms(signCert, privateKey);
        }

        public class Cms {
            private final X509Certificate signCert;
            private final PrivateKey privateKey;

            private Cms(X509Certificate signCert, PrivateKey privateKey) {
                this.signCert = checkNotNull(signCert);
                this.privateKey = checkNotNull(privateKey);
            }

            @Override
            public String toString() {
                try {
                    return Base64.toBase64String(toSignedData()
                            .getEncoded());
                } catch (CertificateEncodingException
                        | OperatorCreationException | CMSException
                        | IOException e) {
                    throw Throwables.propagate(e);
                }
            }

            private CMSSignedData toSignedData()
                    throws CertificateEncodingException,
                    OperatorCreationException, CMSException {
                if (Security.getProvider("BC") == null) {
                    Security.addProvider(new BouncyCastleProvider());
                }

                List<X509Certificate> certList = new ArrayList<X509Certificate>();
                CMSTypedData msg = new CMSProcessableByteArray(Xml.this
                        .toString().getBytes(Charsets.UTF_8));

                certList.add(signCert);

                @SuppressWarnings("unchecked")
                Store<X509Certificate> certs = new JcaCertStore(certList);

                CMSSignedDataGenerator gen = new CMSSignedDataGenerator();
                ContentSigner signer = new JcaContentSignerBuilder(
                        BouncyCastleWsaaManager.SIGNING_ALGORITHM)
                        .setProvider("BC").build(privateKey);

                gen.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(
                        new JcaDigestCalculatorProviderBuilder().setProvider(
                                "BC").build()).build(signer, signCert));

                gen.addCertificates(certs);

                return gen.generate(msg, true);
            }
        }
    }
}
