package ar.com.system.afip.jre.wsmtxca.service;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

import static com.google.common.base.Preconditions.checkNotNull;

public class MTXCAServicePortTypeProvider implements Provider<MTXCAServicePortType> {
    private final SetupDao setupDao;

    @Inject
    public MTXCAServicePortTypeProvider(SetupDao setupDao) {
        this.setupDao = checkNotNull(setupDao);
    }

    @Override
    public MTXCAServicePortType get() {
        try {
            Service service = Service.create(new URL(setupDao.readSetup().geBillingWsdl()),
                    new QName(MTXCAServicePortType.SERVICE_NAMESPACE, MTXCAServicePortType.SERVICE_NAME));
            return service.getPort(new QName(MTXCAServicePortType.SERVICE_NAMESPACE,
                            MTXCAServicePortType.PORT_NAME),
                    MTXCAServicePortType.class);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
