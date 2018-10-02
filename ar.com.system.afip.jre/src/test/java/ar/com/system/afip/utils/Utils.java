package ar.com.system.afip.utils;

import ar.com.system.afip.jre.common.service.JreExceptionConverter;
import ar.com.system.afip.jre.wsaa.business.XStreamProvider;
import ar.com.system.afip.jre.wsaa.business.XStreamXmlConverter;
import ar.com.system.afip.jre.wsaa.service.LoginCMSProvider;
import ar.com.system.afip.jre.wsfe.service.ServiceSoapProvider;
import ar.com.system.afip.jre.wsmtxca.service.MTXCAServicePortTypeProvider;
import ar.com.system.afip.wsaa.WsaaComponents;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsfe.WsfeComponents;
import ar.com.system.afip.wsmtxca.WsmtxcaComponents;

public class Utils {
    static {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    }

    public static void initWsaa() {
        WsaaComponents.init(new LoginCMSProvider(new HomoSetupDao(Service.WSFE))
                        .get(),
                new XStreamXmlConverter(new XStreamProvider()
                        .get()));
    }

    public static void initWsfe() {
        SetupDao setupDao = new HomoSetupDao(Service.WSFE);
        WsaaComponents.init(new LoginCMSProvider(setupDao)
                        .get(),
                new XStreamXmlConverter(new XStreamProvider()
                        .get()));
        WsfeComponents.init(new ServiceSoapProvider(setupDao)
                        .get(),
                new JreExceptionConverter());
    }


    public static void initWsmtxca() {
        SetupDao setupDao = new HomoSetupDao(Service.WSMTXCA);
        WsaaComponents.init(new LoginCMSProvider(setupDao)
                        .get(),
                new XStreamXmlConverter(new XStreamProvider()
                        .get()));

        WsmtxcaComponents.init(new MTXCAServicePortTypeProvider(setupDao)
                        .get(),
                new JreExceptionConverter());
    }
}
