package ar.com.system.afip.android.wsaa.service;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.SoapSpec;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class RetrofitLoginCmsProvider implements Provider<RetrofitLoginCms> {
    private final SetupDao setupDao;
    private final ServiceFactory serviceFactory;

    @Inject
    public RetrofitLoginCmsProvider(@Nonnull SetupDao setupDao,
                                    @Nonnull ServiceFactory serviceFactory) {
        this.setupDao = checkNotNull(setupDao);
        this.serviceFactory = checkNotNull(serviceFactory);
    }

    @Override
    public RetrofitLoginCms get() {
        return serviceFactory.createService(RetrofitLoginCms.class,
                SoapSpec.V_1_1,
                setupDao.readSetup().getWsaaWsdl(),
                LoginCMS.SERVICE_NAME,
                LoginCMS.PORT_NAME);
    }
}
