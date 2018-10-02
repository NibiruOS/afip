package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.utils.Utils;
import org.junit.Before;
import org.junit.Test;

public class BouncyCastleWsaaManagerTest {
    @Before
    public void setUp() {
        Utils.initWsaa();
    }

    @Test
    public void testInitializeKeys() {
        BouncyCastleWsaaManagerTestImpl.testInitializeKeys();
    }

    @Test
    public void testLoginBuildCertificateRequest() {
        BouncyCastleWsaaManagerTestImpl.testLoginBuildCertificateRequest();
    }

    @Test
    public void testUpdateCertificate() {
        BouncyCastleWsaaManagerTestImpl.testUpdateCertificate();
    }

    @Test
    public void testLogin() {
        BouncyCastleWsaaManagerTestImpl.testLogin();
    }
}
