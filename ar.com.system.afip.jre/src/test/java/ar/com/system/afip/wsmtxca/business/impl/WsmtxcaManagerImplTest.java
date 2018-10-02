package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.utils.Utils;
import ar.com.system.afip.wsmtxca.service.api.ExceptionFaultMsg;
import org.junit.Before;
import org.junit.Test;

public class WsmtxcaManagerImplTest {
    @Before
    public void setUp() {
        Utils.initWsmtxca();
    }

    @Test
    public void testDummy() {
        WsmtxcaManagerImplTestImpl.testDummy();
    }


    @Test
    public void testParamGetTiposIva() throws ExceptionFaultMsg {
        WsmtxcaManagerImplTestImpl.testParamGetTiposIva();
    }
}
