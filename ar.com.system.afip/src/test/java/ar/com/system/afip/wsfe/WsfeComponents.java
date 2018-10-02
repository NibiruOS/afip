package ar.com.system.afip.wsfe;

import ar.com.system.afip.common.service.ExceptionConverter;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.business.impl.WsfeManagerImpl;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;

import static ar.com.system.afip.wsaa.WsaaComponents.*;

public class WsfeComponents {
    private static ServiceSoap serviceSoap;
    private static ExceptionConverter exceptionConverter;

    public static void init(ServiceSoap serviceSoap,
                            ExceptionConverter exceptionConverter) {
        WsfeComponents.serviceSoap = serviceSoap;
        WsfeComponents.exceptionConverter = exceptionConverter;
    }

    public static ServiceSoap serviceSoap() {
        return serviceSoap;
    }

    public static WsfeManager wsfeManager() {
        return new WsfeManagerImpl(
                new WsaaTemplateImpl.FactoryImpl(
                        wsaaManager(Service.WSFE),
                        credentialsDao()),
                serviceSoap(),
                wsaaDao(),
                exceptionConverter);
    }
}
