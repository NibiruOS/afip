package ar.com.system.afip.wsfe.service.api;

import ar.com.system.afip.utils.Utils;
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
