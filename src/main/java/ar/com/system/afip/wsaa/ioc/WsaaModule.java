package ar.com.system.afip.wsaa.ioc;

import com.thoughtworks.xstream.XStream;

import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManager;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsaa.business.impl.XStreamProvider;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import ar.com.system.afip.wsaa.service.impl.KSoap2LoginCMS;
import dagger.Module;
import dagger.Provides;

@Module
public class WsaaModule {
    @Provides
    public WsaaManager getWsaaManager(BouncyCastleWsaaManager manager) {
        return manager;
    }

    @Provides
    public WsaaTemplate.Factory getWsaaTemplateFactory(WsaaTemplateImpl.FactoryImpl factory) {
        return factory;
    }

    @Provides
    public XStream getXStream(XStreamProvider provider) {
        return provider.get();
    }

    @Provides
    public LoginCMS getLoginCMS(KSoap2LoginCMS service) {
        return service;
    }
}
