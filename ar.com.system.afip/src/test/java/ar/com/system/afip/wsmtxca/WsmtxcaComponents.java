package ar.com.system.afip.wsmtxca;

import ar.com.system.afip.wsaa.WsaaComponents;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.business.impl.MtxcaManagerImpl;
import ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType;

public class WsmtxcaComponents {
    private static MTXCAServicePortType mtxcaService;

    public static void init(MTXCAServicePortType mtxcaService) {
        WsmtxcaComponents.mtxcaService = mtxcaService;
    }

    public static MtxcaManager mtxcaManager() {
        return new MtxcaManagerImpl(new WsaaTemplateImpl.FactoryImpl(
                WsaaComponents.wsaaManager(Service.WSMTXCA),
                WsaaComponents.credentialsDao()),
                mtxcaService,
                WsaaComponents.wsaaDao());
    }

    public static MTXCAServicePortType mtxcaService() {
        return mtxcaService;
    }
}
