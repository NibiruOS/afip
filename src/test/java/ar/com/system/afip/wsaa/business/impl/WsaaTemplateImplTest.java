package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.service.impl.RetrofitBuilderProvider;
import ar.com.system.afip.wsfe.service.api.FEAuthRequest;
import ar.com.system.afip.wsfe.service.api.IvaTipoResponse;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.WsdlParser;
import org.junit.Before;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParser;

import javax.inject.Provider;

import static org.junit.Assert.assertEquals;

public class WsaaTemplateImplTest {
    private WsaaTemplate wsaaTemplate;
    private ServiceSoap serviceSoap;

    @Before
    public void setUp() throws Exception {
        WsaaManager wsaaManager = BouncyCastleWsaaManagerTest
                .buildWsaaManager();
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        wsaaTemplate = new WsaaTemplateImpl.FactoryImpl(wsaaManager).create(Service.WSFE);
        serviceSoap = new ServiceSoapProvider(new HomoSetupDao(),
                new ServiceFactory(
                        new WsdlParser(pullParserProvider),
                        new RetrofitBuilderProvider(new XmlSerializerProvider(),
                                pullParserProvider)))
                .get();
    }

    @Test
    public void test() {
        IvaTipoResponse response = wsaaTemplate
                .runAuhtenticated(credentials -> serviceSoap
                        .feParamGetTiposIva(FEAuthRequest
                                .fromCredentials(credentials,
                                        BouncyCastleWsaaManagerTest.CUIT)));
        assertEquals(6, response.getResultGet().getIvaTipo().size());
    }

}
