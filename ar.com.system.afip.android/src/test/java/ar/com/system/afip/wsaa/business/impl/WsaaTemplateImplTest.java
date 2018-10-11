package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.utils.Utils;
import org.junit.Before;
import org.junit.Test;

public class WsaaTemplateImplTest {
    @Before
    public void setUp() {
        Utils.initWsaa();
    }

    @Test
    public void test() {
        WsaaTemplateImplTestImpl.test();
    }
}
