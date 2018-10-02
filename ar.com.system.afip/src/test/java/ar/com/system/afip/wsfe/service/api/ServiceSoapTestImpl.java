package ar.com.system.afip.wsfe.service.api;

import ar.com.system.afip.util.Constants;
import ar.com.system.afip.wsaa.business.api.Service;

import static ar.com.system.afip.wsaa.WsaaComponents.credentials;
import static ar.com.system.afip.wsfe.WsfeComponents.serviceSoap;
import static org.junit.Assert.*;

public class ServiceSoapTestImpl {
    public static void testDummy() {
        ServiceSoap serviceSoap = serviceSoap();

        DummyResponse response = serviceSoap.feDummy();
        assertNotNull(response);
        assertEquals("OK", response.appServer);
        assertEquals("OK", response.authServer);
        assertEquals("OK", response.dbServer);
    }

    public static void testParamGetTiposIva() {
        ServiceSoap serviceSoap = serviceSoap();

        IvaTipoResponse response = serviceSoap
                .feParamGetTiposIva(buildFEAuthRequest());
        assertNotNull(response);
        assertNull(response.errors);
        assertNull(response.events);
        assertNotNull(response.resultGet);
        assertNotNull(response.resultGet.ivaTipo);
        assertEquals(6, response.resultGet.ivaTipo.size());
    }

    private static FEAuthRequest buildFEAuthRequest() {
        return FEAuthRequest.fromCredentials(credentials(Service.WSFE),
                Constants.CUIT);
    }
}
