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
//	public static final String COMPANY = "<colocar el nombre de la empresa>";
//	public static final String UNIT = "<colocar el nombre de la unidad>";
//	public static final String CUIT = "<colocar el CUIT>";
//	public static final String ADDRESS = "<colocar la direccion>";
//	public static final String LOCATION = "<colocar ciudad y provincia>";
//	public static final String PRIVATE_KEY = "<colocar la clave privada>";
//	public static final String PUBLIC_KEY = "<colocar la clave publica>";
//	public static final String CERTIFICATE = "<colocar el certificado>";
//	public static final String CN = "<colocar el CN>";
	
	public static final String COMPANY = "Rick Sanchez";
	public static final String UNIT = "facturacion";
	public static final String CUIT = "20245922141";
	public static final String ADDRESS = ".";
	public static final String LOCATION = "Ros";
	public static final String PRIVATE_KEY = "-----BEGIN RSA PRIVATE KEY-----\n"
+ "MIIEpQIBAAKCAQEAwHnywXCKgnZaCLXNWwOHCJJOEW3VCwEAyf/KdHgHahE32RNZ"
+ "R1noccW86nOJ5XUB0Jh1HRQAnjFXb9qEBp8pQJpMxJ6c0Gk5XweqdomUBg/SvWuO"
+ "JfhyelNfMN++lHIoeS/TLFIQJb7c566kb5ih0u0LllMEGyO7PkYyjDjNV65YzmZ1"
+ "6U7giQ53JpE+uahjRRuMgnJ8cynt351/kYLEFlzg5mZh0aZnSITOrv0eb3ViUNm0"
+ "jYe8o9/jo0zDgNjNUDqD0AryCHbYiTzvNm86FBPxHdDPAYhjak2f9qFd3HVIoXXi"
+ "vqnAxyKP6VRCXxFtRG+Jp42x+P0jEKuphOE99QIDAQABAoIBAQC44ap7gsWZEWPk"
+ "L/Vkchv38MjKVwynuDvwzCHFBDJjAMz7V2mPbt4mwsB3F6oiXOT0YC1GVBtP2Kdb"
+ "SrM8xQ9T/aK1zoFkc15nWK61k+s6c2KDDlgJQv97Xq/1+0VNw+X6miSm0uCt0QrS"
+ "BF/wzdTLDWTu7SjphMXryHPvWvRrPd+mQ/qHDITBPJ57A88w/IFASyStq0SUh2si"
+ "HgMw2KkoNnTHkL+C0hNdSRhrGHDb0NoeyyXkFHP5fgA1rll4Ikp858VSSSvxP6GJ"
+ "e1rFaVV8aRrliTyRIV48DV9skKxrJNt0ieEHnvhVpbOVAhoqEBgabT/mWch+qb3D"
+ "jxoh+iLVAoGBAP5utlrPP34EwTSXuMVoXlLWZDcToZD/AOUXSp+962Ugmgtm9vse"
+ "D+vRKb0GmiyrL7PvtJIQFkB5RyzJq6wks8F0CaOmBYFm/rM6Dp0rJE0v029/9OZQ"
+ "TW6OlPWKTArQXfYtUkc0zLcr7oJLer3aHBo2hZh0pmUwaz8q+BssSy0XAoGBAMGp"
+ "hQEVTlVYjRuNWAUGNC44t63z2EA7bSf97gYq4v+eJ5oF2zZC4t+nqm1IZMhgDwzL"
+ "47xuq/vPj3z8qlBV/BWeihSzdswLGjgVp4vjoEfiUWLAjyqsG0ispbinFG3FHE83"
+ "ClGc4yI0/vZKnFBU0PGGlQ68kK0/LU7THgjWYgzTAoGARyd/J/Y9s2hw/9xOeCav"
+ "+kqqzBxZWst13Jue6v2aDzYG3pl1CNVnbnOYUJzAES3usUugHBkToARKu2PK9uFs"
+ "w/VHnNSZRY8gO89ItvuRs2RkpRIL0z0x6nFFh0Wd7ohHPsl98Rv7BF7s3NNvCBkv"
+ "MsV8px44SqQ32fqSWEcS3xECgYEAgTpxemuRPfo9DumelpuxLjbCut1ArHv7NviH"
+ "YK41k4Uhv/GweeDgK4Zif1ITjnIrGMrlSNRBB2NVyH2B2OHHuVV1pqKq3zV5ZXtt"
+ "tjdKuS0YSeFcp4j5G+G5JCK5yxYA8gs0Y4lhN25NxGO9Mw2l78VyqcbCdBj4TuUp"
+ "4ZPNEekCgYEAnScgn9NjejAJZL8bRRGXGnxTnbuP9/8NzPchpghHDqTwkLmnNSkc"
+ "ijPtVFUbus6hQKxqZi6+IVQOs1S11EM21gHh8otp+HGP1fPWRB8+4Z7H2/e2vGOT"
+ "6P+svluwpJhsaTjQst0xffhM31ebWWHdkpjR7unTci0d7FkJ8N70mcg="
+ "\n-----END RSA PRIVATE KEY-----";
	
	public static final String PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\n"
+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwHnywXCKgnZaCLXNWwOH"
+ "CJJOEW3VCwEAyf/KdHgHahE32RNZR1noccW86nOJ5XUB0Jh1HRQAnjFXb9qEBp8p"
+ "QJpMxJ6c0Gk5XweqdomUBg/SvWuOJfhyelNfMN++lHIoeS/TLFIQJb7c566kb5ih"
+ "0u0LllMEGyO7PkYyjDjNV65YzmZ16U7giQ53JpE+uahjRRuMgnJ8cynt351/kYLE"
+ "Flzg5mZh0aZnSITOrv0eb3ViUNm0jYe8o9/jo0zDgNjNUDqD0AryCHbYiTzvNm86"
+ "FBPxHdDPAYhjak2f9qFd3HVIoXXivqnAxyKP6VRCXxFtRG+Jp42x+P0jEKuphOE9"
+ "9QIDAQAB"
+ "\n-----END PUBLIC KEY-----";
	
	public static final String CERTIFICATE = "-----BEGIN CERTIFICATE-----"
+ "\nMIIDRjCCAi6gAwIBAgIIMMVxnJJfMmowDQYJKoZIhvcNAQENBQAwODEaMBgGA1UEAwwRQ29tcHV0"
+ "\nYWRvcmVzIFRlc3QxDTALBgNVBAoMBEFGSVAxCzAJBgNVBAYTAkFSMB4XDTE4MDYwNjEyMjY1N1oX"
+ "\nvDTIwMDYwNTEyMjY1N1owLDEPMA0GA1UEAwwGUHJ1ZWJhMRkwFwYDVQQFExBDVUlUIDIwMjQ1OTIy"
+ "\nMTQxMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwHnywXCKgnZaCLXNWwOHCJJOEW3V"
+ "\nCwEAyf/KdHgHahE32RNZR1noccW86nOJ5XUB0Jh1HRQAnjFXb9qEBp8pQJpMxJ6c0Gk5XweqdomU"
+ "\nBg/SvWuOJfhyelNfMN++lHIoeS/TLFIQJb7c566kb5ih0u0LllMEGyO7PkYyjDjNV65YzmZ16U7g"
+ "\niQ53JpE+uahjRRuMgnJ8cynt351/kYLEFlzg5mZh0aZnSITOrv0eb3ViUNm0jYe8o9/jo0zDgNjN"
+ "\nUDqD0AryCHbYiTzvNm86FBPxHdDPAYhjak2f9qFd3HVIoXXivqnAxyKP6VRCXxFtRG+Jp42x+P0j"
+ "\nEKuphOE99QIDAQABo2AwXjAMBgNVHRMBAf8EAjAAMB8GA1UdIwQYMBaAFLOy0//96bre3o2vESGc"
+ "\n1iB98k9vMB0GA1UdDgQWBBRFkwrXVTB8aa+W0/ULCO764kyMyTAOBgNVHQ8BAf8EBAMCBeAwDQYJ"
+ "\nKoZIhvcNAQENBQADggEBAFGFVfvE27IvPreIY5d/degOzLvpF//UG1nz8ulsqSfxIsguYicrVgq0"
+ "\n5qUyJW3MXYyr4zhy4NTctII/0phyberGtFylO6aj9Vj7kzjRAHT8yVzKRRXKDnrSrIzuZ+zgG8zz"
+ "\nyl34pp6R31pa4TifMDzV4mP1VDuQSRLtnM6cydaIX7Oj/jkaEXc43QOku64lrrfDn1PEpjMH3s4A"
+ "\nAREm410XbI1Ou7WBBFcxMQhldAKb0BgwZx0rIiFeHD4gixkXJjfKlhUEfUbernzwJRoJNjOUH+mG"
+ "\nLg+OppeAmo+q7cocPbt4w5oweIATGIoavXnVjDGKDkdBl9C1CZ1J+YSTvXw="
+ "\n-----END CERTIFICATE-----";
	public static final String CN = "prueba";

	public static WsaaManager buildWsaaManager() {
		return buildWsaaManager(new InMemoryWsaaDao());
	}

	public static WsaaManager buildWsaaManager(WsaaDao dao) {
		dao.saveCompanyInfo(new CompanyInfo(0, COMPANY, true, UNIT, CUIT, PUBLIC_KEY,
				PRIVATE_KEY, CERTIFICATE, "", new Date(), TaxCategory.MONOTRIBUTO, ADDRESS, LOCATION,
				CN));
		return new BouncyCastleWsaaManager(dao,
				new HomoSetupDao(Service.WSMTXCA),
				new LoginCMSProvider(new HomoSetupDao(Service.WSMTXCA)).get(),
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
		Credentials credentials = wsaaManager.login(Service.WSMTXCA);

		assertNotNull(credentials);
		assertNotNull(credentials.getToken());
		assertNotNull(credentials.getSign());
		assertFalse(credentials.getToken().isEmpty());
		assertFalse(credentials.getSign().isEmpty());
	}
}
