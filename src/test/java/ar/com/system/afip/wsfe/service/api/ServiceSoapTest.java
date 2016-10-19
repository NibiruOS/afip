package ar.com.system.afip.wsfe.service.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManagerTest;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;

public class ServiceSoapTest {
	private ServiceSoap serviceSoap;
	private SetupDao setupDao;

	@Before
	public void setUp() throws Exception {
		setupDao = new HomoSetupDao();
		serviceSoap = new ServiceSoapProvider(setupDao).get();
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
