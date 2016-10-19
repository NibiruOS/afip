package ar.com.system.afip.wsaa.business.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsfe.service.api.FEAuthRequest;
import ar.com.system.afip.wsfe.service.api.IvaTipoResponse;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;

import com.google.common.base.Function;

public class WsaaTemplateImplTest {
	private WsaaTemplate wsaaTemplate;
	private ServiceSoap serviceSoap;

	@Before
	public void setUp() throws Exception {
		WsaaManager wsaaManager = BouncyCastleWsaaManagerTest
				.buildWsaaManager();
		wsaaTemplate = new WsaaTemplateImpl.FactoryImpl(wsaaManager).create(Service.WSFE);
		serviceSoap = new ServiceSoapProvider(new HomoSetupDao()).get();
	}

	@Test
	public void test() {
		IvaTipoResponse response = wsaaTemplate
				.runAuhtenticated(new Function<Credentials, IvaTipoResponse>() {
					@Override
					public IvaTipoResponse apply(Credentials credentials) {
						return serviceSoap.feParamGetTiposIva(FEAuthRequest
								.fromCredentials(credentials,
										BouncyCastleWsaaManagerTest.CUIT));
					}
				});
		assertEquals(6, response.getResultGet().getIvaTipo().size());
	}

}
