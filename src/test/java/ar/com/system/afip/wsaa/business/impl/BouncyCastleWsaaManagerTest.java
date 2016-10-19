package ar.com.system.afip.wsaa.business.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.impl.LoginCMSProvider;

public class BouncyCastleWsaaManagerTest {
	public static final String COMPANY = "<colocar el nombre de la empresa>";
	public static final String UNIT = "<colocar el nombre de la unidad>";
	public static final String CUIT = "<colocar el CUIT>";
	public static final String PRIVATE_KEY = "<colocar la clave privada>";
	public static final String PUBLIC_KEY = "<colocar la clave publica>";
	public static final String CERTIFICATE = "<colocar el certificado>";

	public static WsaaManager buildWsaaManager() {
		return buildWsaaManager(new InMemoryWsaaDao());
	}

	public static WsaaManager buildWsaaManager(WsaaDao dao) {
		dao.saveCompanyInfo(new CompanyInfo(COMPANY, UNIT, CUIT, PUBLIC_KEY,
				PRIVATE_KEY, CERTIFICATE));
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
	public void testInitialize() {
		wsaaManager.initialize("A", "B", "C");
		CompanyInfo companyInfo = dao.loadCompanyInfo();

		assertEquals("A", companyInfo.getName());
		assertEquals("B", companyInfo.getUnit());
		assertEquals("C", companyInfo.getCuit());
		assertNotNull(companyInfo.getPrivateKey());
		assertNotNull(companyInfo.getPublicKey());
		assertNull(companyInfo.getCertificate());
	}

	@Test
	public void testInitializeKeys() {
		dao.saveCompanyInfo(new CompanyInfo("A", "B", "C", null, null, null));
		wsaaManager.initialize("A", "B", "C");
		CompanyInfo companyInfo = dao.loadCompanyInfo();

		assertEquals("A", companyInfo.getName());
		assertEquals("B", companyInfo.getUnit());
		assertEquals("C", companyInfo.getCuit());
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
		CompanyInfo companyInfo = dao.loadCompanyInfo();

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
