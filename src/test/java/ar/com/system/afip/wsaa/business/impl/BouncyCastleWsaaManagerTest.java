package ar.com.system.afip.wsaa.business.impl;

import static org.junit.Assert.*;

import java.util.Date;

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
		dao = new InMemoryWsaaDao();
		wsaaManager = buildWsaaManager(dao);
	}

	@Test
	public void testInitializeKeys() {
		Date now =  new Date();
		dao.saveCompanyInfo(new CompanyInfo(0, COMPANY, true, UNIT, CUIT, PUBLIC_KEY,
				PRIVATE_KEY, CERTIFICATE, "", now, TaxCategory.MONOTRIBUTO, ADDRESS, LOCATION,
				CN));
		wsaaManager.initializeKeys();
		CompanyInfo companyInfo = dao.loadActiveCompanyInfo();

		assertEquals(COMPANY, companyInfo.getName());
		assertEquals(UNIT, companyInfo.getUnit());
		assertEquals(CUIT, companyInfo.getCuit());
		assertEquals(now, companyInfo.getActivityStartDate());
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
