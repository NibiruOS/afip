package ar.com.system.afip.android.wsmtxca.service;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.SoapSpec;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class RetrofitMtxcaServicePortTypeProvider
        implements Provider<RetrofitMtxcaServicePortType> {
    private final SetupDao setupDao;
    private final ServiceFactory serviceFactory;

    @Inject
    public RetrofitMtxcaServicePortTypeProvider(@Nonnull SetupDao setupDao,
                                                @Nonnull ServiceFactory serviceFactory) {
        this.setupDao = checkNotNull(setupDao);
        this.serviceFactory = checkNotNull(serviceFactory);
    }

    @Override
    public RetrofitMtxcaServicePortType get() {
        return serviceFactory.createService(RetrofitMtxcaServicePortType.class,
                SoapSpec.V_1_1,
                setupDao.readSetup()
                        .geBillingWsdl(),
                MTXCAServicePortType.SERVICE_NAME,
                MTXCAServicePortType.PORT_NAME);
    }
}
