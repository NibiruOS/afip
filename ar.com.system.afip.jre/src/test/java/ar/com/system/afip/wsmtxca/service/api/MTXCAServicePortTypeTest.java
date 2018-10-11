package ar.com.system.afip.wsmtxca.service.api;


import ar.com.system.afip.utils.Utils;
import org.junit.Before;
import org.junit.Test;

public class MTXCAServicePortTypeTest {
    @Before
    public void setUp() {
        Utils.initWsmtxca();
    }

    @Test
    public void testDummy() {
        MTXCAServicePortTypeTestImpl.testDummy();
    }

    @Test
    public void testParamGetTiposIva() throws ExceptionFaultMsg {
        MTXCAServicePortTypeTestImpl.testParamGetTiposIva();
    }
}
