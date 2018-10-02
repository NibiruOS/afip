package ar.com.system.afip.android.wsfe.service;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.SoapSpec;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class RetrofitServiceSoapProvider
        implements Provider<RetrofitServiceSoap> {
    private final SetupDao setupDao;
    private final ServiceFactory serviceFactory;

    @Inject
    public RetrofitServiceSoapProvider(@Nonnull SetupDao setupDao,
                                       @Nonnull ServiceFactory serviceFactory) {
        this.setupDao = checkNotNull(setupDao);
        this.serviceFactory = checkNotNull(serviceFactory);
    }

    @Override
    public RetrofitServiceSoap get() {
        return serviceFactory.createService(RetrofitServiceSoap.class,
                SoapSpec.V_1_1,
                setupDao.readSetup()
                        .geBillingWsdl(),
                ServiceSoap.SERVICE_NAME,
                ServiceSoap.PORT_NAME);
    }
}
