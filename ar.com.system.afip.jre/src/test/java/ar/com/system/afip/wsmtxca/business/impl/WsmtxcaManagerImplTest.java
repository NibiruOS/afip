package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.utils.Utils;
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
}
