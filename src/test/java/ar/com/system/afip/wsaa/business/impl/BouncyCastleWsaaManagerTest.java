package ar.com.system.afip.wsaa.business.impl;

import static org.junit.Assert.*;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Date;

import ar.com.system.afip.wsaa.data.impl.FileSystemWsaaDao;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.gson.*;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.bouncycastle.util.encoders.Base64;
import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.TaxCategory;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.impl.LoginCMSProvider;

public class BouncyCastleWsaaManagerTest {
    public static final String COMPANY = "<colocar el nombre de la empresa>";
    public static final String UNIT = "<colocar el nombre de la unidad>";
    public static final String CUIT = "<colocar el CUIT>";
    public static final String ADDRESS = "<colocar la direccion>";
    public static final String LOCATION = "<colocar ciudad y provincia>";
    public static final String PRIVATE_KEY = "<colocar la clave privada>";
    public static final String PUBLIC_KEY = "<colocar la clave publica>";
    public static final String CERTIFICATE = "<colocar el certificado>";
    public static final String CN = "<colocar el CN>";

    public static WsaaManager buildWsaaManager() {
        return buildWsaaManager(new InMemoryWsaaDao());
    }

    public static WsaaManager buildWsaaManager(WsaaDao dao) {
        dao.saveCompanyInfo(new CompanyInfo(0, COMPANY, true, UNIT, CUIT, PUBLIC_KEY,
                PRIVATE_KEY, CERTIFICATE, "", new Date(), TaxCategory.MONOTRIBUTO, ADDRESS, LOCATION,
                CN));
        return new BouncyCastleWsaaManager(dao,
                new HomoSetupDao(),
                new LoginCMSProvider(new HomoSetupDao()).get(),
                new XStreamProvider().get());
    }

    private WsaaManager wsaaManager;
    private WsaaDao dao;

    @Before
    public void setUp() throws Exception {

//        Gson gson = new GsonBuilder()
//                .registerTypeAdapter(Serializable.class, new JsonDeserializer<Serializable>() {
//                    @Override
//                    public Serializable deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//                        try {
//                            ByteArrayInputStream bais = new ByteArrayInputStream(BaseEncoding
//                                    .base64()
//                                    .decode(json.getAsString()));
//                            return (Serializable) new ObjectInputStream(bais)
//                                    .readObject();
//                        } catch (IOException | ClassNotFoundException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                })
//                .registerTypeAdapter(Serializable.class, new JsonSerializer<Serializable>() {
//                    @Override
//                    public JsonElement serialize(Serializable src, Type typeOfSrc, JsonSerializationContext context) {
//                        try {
//                            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                            new ObjectOutputStream(bos).writeObject(src);
//                            return new JsonPrimitive(BaseEncoding
//                                    .base64()
//                                    .encode(bos.toByteArray()));
//                        } catch (IOException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                })
//                .create();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Serializable.class,
                        (JsonDeserializer<Serializable>) (json, typeOfT, context) -> Integer.valueOf(json.getAsString()))
                .create();
        dao = new FileSystemWsaaDao("/home/lbrasseur/Documents/kkck.json", gson);
        wsaaManager = buildWsaaManager(dao);
    }

    @Test
    public void testInitializeKeys() {
        Date now = new Date();
        dao.saveCompanyInfo(new CompanyInfo(0, COMPANY, true, UNIT, CUIT, PUBLIC_KEY,
                PRIVATE_KEY, CERTIFICATE, "", now, TaxCategory.MONOTRIBUTO, ADDRESS, LOCATION,
                CN));
        wsaaManager.initializeKeys();
        CompanyInfo companyInfo = dao.loadActiveCompanyInfo();

        assertEquals(COMPANY, companyInfo.getName());
        assertEquals(UNIT, companyInfo.getUnit());
        assertEquals(CUIT, companyInfo.getCuit());
//        assertEquals(now, companyInfo.getActivityStartDate());
        assertEquals(TaxCategory.MONOTRIBUTO, companyInfo.getTaxCategory());
        assertEquals(ADDRESS, companyInfo.getAddress());
        assertEquals(LOCATION, companyInfo.getLocation());
        assertEquals(CN, companyInfo.getAlias());
        assertNotNull(companyInfo.getPrivateKey());
        assertNotNull(companyInfo.getPublicKey());
        assertNull(companyInfo.getCertificate());
    }

    @Test
    public void testLoginBuildCertificateRequest() {
        String certificateRequest = wsaaManager.buildCertificateRequest();
        assertNotNull(certificateRequest);
        assertFalse(certificateRequest.isEmpty());
        assertTrue(certificateRequest
                .startsWith("-----BEGIN CERTIFICATE REQUEST-----"
                        + System.lineSeparator()));
        assertTrue(certificateRequest
                .endsWith("-----END CERTIFICATE REQUEST-----"
                        + System.lineSeparator()));
    }

    @Test
    public void testUpdateCertificate() {
        wsaaManager.updateCertificate("A");
        CompanyInfo companyInfo = dao.loadActiveCompanyInfo();

        assertEquals("A", companyInfo.getCertificate());
    }

    @Test
    public void testLogin() {
        Credentials credentials = wsaaManager.login(Service.WSFE);

        assertNotNull(credentials);
        assertNotNull(credentials.getToken());
        assertNotNull(credentials.getSign());
        assertFalse(credentials.getToken().isEmpty());
        assertFalse(credentials.getSign().isEmpty());
    }
}
