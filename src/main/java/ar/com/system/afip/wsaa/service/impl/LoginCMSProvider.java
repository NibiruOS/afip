package ar.com.system.afip.wsaa.service.impl;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.SoapSpec;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class LoginCMSProvider implements Provider<LoginCMS> {
    private final SetupDao setupDao;
    private final ServiceFactory serviceFactory;

    @Inject
    public LoginCMSProvider(@Nonnull SetupDao setupDao,
                            @Nonnull ServiceFactory serviceFactory) {
        this.setupDao = checkNotNull(setupDao);
        this.serviceFactory = checkNotNull(serviceFactory);
    }

    @Override
    public LoginCMS get() {
        return serviceFactory.createService(LoginCMS.class,
                SoapSpec.V_1_1,
                setupDao.readSetup().getWsaaWsdl(),
                LoginCMS.SERVICE_NAME,
                LoginCMS.PORT_NAME);
    }
}
