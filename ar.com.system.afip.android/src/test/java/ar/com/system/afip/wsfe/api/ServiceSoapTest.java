package ar.com.system.afip.wsfe.api;

import ar.com.system.afip.utils.Utils;
import ar.com.system.afip.wsfe.service.api.ServiceSoapTestImpl;
import org.junit.Before;
import org.junit.Test;

public class ServiceSoapTest {
    @Before
    public void setUp() {
        Utils.init();
    }

    @Test
    public void testDummy() {
        ServiceSoapTestImpl.testDummy();
    }

    @Test
    public void testParamGetTiposIva() {
        ServiceSoapTestImpl.testParamGetTiposIva();
    }
}
