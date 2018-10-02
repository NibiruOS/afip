package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.service.api.CodigoDescripcionType;
import ar.com.system.afip.wsmtxca.service.api.DummyResponseType;

import java.util.List;

import static ar.com.system.afip.wsmtxca.WsmtxcaComponents.mtxcaManager;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WsmtxcaManagerImplTestImpl {
    public static void testDummy() {
        MtxcaManager mtxcaManager = mtxcaManager();

        DummyResponseType response = mtxcaManager.dummy();

        assertNotNull(response);
        assertEquals("OK", response.getAppserver());
        assertEquals("OK", response.getAuthserver());
        assertEquals("OK", response.getDbserver());
    }

    public static void testParamGetTiposIva() {
        MtxcaManager mtxcaManager = mtxcaManager();

        List<CodigoDescripcionType> response = mtxcaManager
                .consultarCondicionesIVA();

        assertNotNull(response);
        assertEquals(8, response.size());
    }
}
