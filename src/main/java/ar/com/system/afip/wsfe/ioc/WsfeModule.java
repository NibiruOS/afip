package ar.com.system.afip.wsfe.ioc;

import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.business.impl.WsfeManagerImpl;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;
import dagger.Module;
import dagger.Provides;

@Module
public class WsfeModule {
    @Provides
    public WsfeManager getWsfeManager(WsfeManagerImpl manager) {
        return manager;
    }

    @Provides
    public ServiceSoap getServiceSoap(ServiceSoapProvider provider) {
        return provider.get();
    }
}
