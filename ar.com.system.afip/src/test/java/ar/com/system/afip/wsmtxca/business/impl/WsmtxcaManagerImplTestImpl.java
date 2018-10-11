package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.service.api.DummyResponseType;

import static ar.com.system.afip.wsmtxca.WsmtxcaComponents.mtxcaManager;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WsmtxcaManagerImplTestImpl {
    public static void testDummy() {
        MtxcaManager mtxcaManager = mtxcaManager();

        DummyResponseType response = null;
        try {
            response = mtxcaManager.dummy();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertNotNull(response);
        assertEquals("OK", response.getAppserver());
        assertEquals("OK", response.getAuthserver());
        assertEquals("OK", response.getDbserver());
    }
}
