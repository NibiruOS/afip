package ar.com.system.afip.wsmtxca.service.api;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManagerTest;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsmtxca.service.impl.MTXCAServicePortTypeProvider;

public class ServiceSoapTest {

	private MTXCAServicePortType serviceSoap;
	private SetupDao setupDao;
	
	@Before
	public void setUp() throws Exception {
		setupDao = new HomoSetupDao(Service.WSMTXCA);
		serviceSoap = new MTXCAServicePortTypeProvider(setupDao).get();
	}
	
	@Test
	public void testDummy() {
		DummyResponseType response = null;
		try {
			response = serviceSoap.dummy();
		} catch (ExceptionFaultMsg e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(response);
		assertEquals("OK", response.getAppserver());
		assertEquals("OK", response.getAuthserver());
		assertEquals("OK", response.getDbserver());
	}
	
	@Test
	public void testParamGetTiposIva() {
		ConsultarCondicionesIVAResponseType response = null;
		try {
			response = serviceSoap
					.consultarCondicionesIVA(new ConsultarCondicionesIVARequestType(buildAuthRequestType()));
		} catch (ExceptionFaultMsg e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(response);
		response.getEvento();
		response.getArrayCondicionesIVA();
//		assertNull(response.errors);
//		assertNull(response.events);
//		assertNotNull(response.resultGet);
//		assertNotNull(response.resultGet.ivaTipo);
	}
	
	/*
	 * return wsaaTemplate.runAuhtenticated(
				credentials -> exception(
						() -> service.consultarCondicionesIVA(
								new ConsultarCondicionesIVARequestType(
										AuthRequestType.fromCredentials(credentials, cuit)))
						)
				).getArrayCondicionesIVA().getCodigoDescripcion();
	 */
	
	//AuthRequestType
	private AuthRequestType buildAuthRequestType() {
		WsaaManager wsaaManager = BouncyCastleWsaaManagerTest.buildWsaaManager();

		Credentials credentials = wsaaManager.login(Service.WSMTXCA);

		return AuthRequestType.fromCredentials(credentials,
				BouncyCastleWsaaManagerTest.CUIT);
	}
}
