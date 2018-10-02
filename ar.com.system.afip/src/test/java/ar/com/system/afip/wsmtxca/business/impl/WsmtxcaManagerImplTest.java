package ar.com.system.afip.wsmtxca.business.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManagerTest;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.api.TaxCategory;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.service.api.DummyResponseType;
import ar.com.system.afip.wsmtxca.service.api.ExceptionFaultMsg;
import ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType;
import ar.com.system.afip.wsmtxca.service.impl.MTXCAServicePortTypeProvider;

public class WsmtxcaManagerImplTest {

	private MtxcaManager mtxcaManager;
	private SetupDao setupDao;
	
	@Before
	public void setUp() throws Exception {
		setupDao = new HomoSetupDao(Service.WSMTXCA);
		MTXCAServicePortType serviceSoap = new MTXCAServicePortTypeProvider(setupDao).get();
		mtxcaManager = new MtxcaManagerImpl(new WsaaTemplateImpl.FactoryImpl(
				BouncyCastleWsaaManagerTest.buildWsaaManager()),
				serviceSoap,
				buildDao());

	}
	
	@Test
	public void testDummy() {
		DummyResponseType response = null;
		try {
			response = mtxcaManager.dummy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(response);
		assertEquals("OK", response.getAppserver());
		assertEquals("OK", response.getAuthserver());
		assertEquals("OK", response.getDbserver());
	}
	
	private WsaaDao buildDao() {
		WsaaDao dao = new InMemoryWsaaDao();
		dao.saveCompanyInfo(new CompanyInfo(0,
				BouncyCastleWsaaManagerTest.COMPANY,
				true,
				BouncyCastleWsaaManagerTest.UNIT,
				BouncyCastleWsaaManagerTest.CUIT,
				BouncyCastleWsaaManagerTest.PUBLIC_KEY,
				BouncyCastleWsaaManagerTest.PRIVATE_KEY,
				BouncyCastleWsaaManagerTest.CERTIFICATE,
				"",
				new Date(),
				TaxCategory.MONOTRIBUTO,
				BouncyCastleWsaaManagerTest.ADDRESS,
				BouncyCastleWsaaManagerTest.LOCATION,
				BouncyCastleWsaaManagerTest.CN));
		return dao;
	}
}
