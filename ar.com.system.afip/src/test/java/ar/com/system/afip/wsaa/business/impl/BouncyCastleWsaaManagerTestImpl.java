package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.util.Dependencies;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.TaxCategory;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;

import java.util.Date;

import static ar.com.system.afip.util.Constants.*;
import static org.junit.Assert.*;

public class BouncyCastleWsaaManagerTestImpl {
    public static void testInitializeKeys() {
        WsaaDao dao = Dependencies.wsaaDao();
        WsaaManager wsaaManager = Dependencies.wsaaManager();

        Date now = new Date();

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

    public static void testLoginBuildCertificateRequest() {
        WsaaManager wsaaManager = Dependencies.wsaaManager();

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

    public static void testUpdateCertificate() {
        WsaaDao dao = Dependencies.wsaaDao();
        WsaaManager wsaaManager = Dependencies.wsaaManager();

        wsaaManager.updateCertificate("A");
        CompanyInfo companyInfo = dao.loadActiveCompanyInfo();

        assertEquals("A", companyInfo.getCertificate());
    }

    public static void testLogin() {
        WsaaManager wsaaManager = Dependencies.wsaaManager();

        Credentials credentials = wsaaManager.login(Service.WSFE);

        assertNotNull(credentials);
        assertNotNull(credentials.getToken());
        assertNotNull(credentials.getSign());
        assertFalse(credentials.getToken().isEmpty());
        assertFalse(credentials.getSign().isEmpty());
    }
}
