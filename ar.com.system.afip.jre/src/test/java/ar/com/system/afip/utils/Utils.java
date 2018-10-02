package ar.com.system.afip.utils;

import ar.com.system.afip.jre.wsaa.business.XStreamProvider;
import ar.com.system.afip.jre.wsaa.business.XStreamXmlConverter;
import ar.com.system.afip.jre.wsaa.service.LoginCMSProvider;
import ar.com.system.afip.jre.wsfe.service.ServiceSoapProvider;
import ar.com.system.afip.util.Dependencies;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;

public class Utils {
    public static void init() {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        SetupDao setupDao = new HomoSetupDao();
        Dependencies.init(new HomoSetupDao(),
                new LoginCMSProvider(setupDao)
                        .get(),
                new ServiceSoapProvider(setupDao)
                        .get(),
                new XStreamXmlConverter(new XStreamProvider()
                        .get()));

    }
}
