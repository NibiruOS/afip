package ar.com.system.afip.wsfe.service.api;

import ar.com.system.afip.util.Constants;
import ar.com.system.afip.util.Dependencies;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.service.api.Credentials;

import static org.junit.Assert.*;

public class ServiceSoapTestImpl {
    public static void testDummy() {
        ServiceSoap serviceSoap = Dependencies.serviceSoap();

        DummyResponse response = serviceSoap.feDummy();
        assertNotNull(response);
        assertEquals("OK", response.appServer);
        assertEquals("OK", response.authServer);
        assertEquals("OK", response.dbServer);
    }

    public static void testParamGetTiposIva() {
        ServiceSoap serviceSoap = Dependencies.serviceSoap();

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
        return FEAuthRequest.fromCredentials(Dependencies.credentials(Service.WSFE),
                Constants.CUIT);
    }
}
