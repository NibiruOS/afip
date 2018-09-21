package ar.com.system.afip.wsfe.service.api;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManagerTest;
import ar.com.system.afip.wsaa.business.impl.XmlPullParserProvider;
import ar.com.system.afip.wsaa.business.impl.XmlSerializerProvider;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.impl.RetrofitBuilderProvider;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.WsdlParser;
import org.junit.Before;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParser;

import javax.inject.Provider;

import static org.junit.Assert.*;

public class ServiceSoapTest {
    private ServiceSoap serviceSoap;

    @Before
    public void setUp() throws Exception {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        serviceSoap = new ServiceSoapProvider(new HomoSetupDao(),
                new ServiceFactory(
                        new WsdlParser(pullParserProvider),
                        new RetrofitBuilderProvider(new XmlSerializerProvider(),
                                pullParserProvider)))
                .get();
    }

    @Test
    public void testDummy() {
        DummyResponse response = serviceSoap.feDummy();
        assertNotNull(response);
        assertEquals("OK", response.appServer);
        assertEquals("OK", response.authServer);
        assertEquals("OK", response.dbServer);
    }

    @Test
    public void testParamGetTiposIva() {
        IvaTipoResponse response = serviceSoap
                .feParamGetTiposIva(buildFEAuthRequest());
        assertNotNull(response);
        assertNull(response.errors);
        assertNull(response.events);
        assertNotNull(response.resultGet);
        assertNotNull(response.resultGet.ivaTipo);
        assertEquals(6, response.resultGet.ivaTipo.size());
    }

    private FEAuthRequest buildFEAuthRequest() {
        WsaaManager wsaaManager = BouncyCastleWsaaManagerTest.buildWsaaManager();

        Credentials credentials = wsaaManager.login(Service.WSFE);

        return FEAuthRequest.fromCredentials(credentials,
                BouncyCastleWsaaManagerTest.CUIT);
    }
}
