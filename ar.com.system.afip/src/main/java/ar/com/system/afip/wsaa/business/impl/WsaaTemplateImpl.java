package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.CredentialsDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.common.base.Function;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

public class WsaaTemplateImpl implements WsaaTemplate {
    public static class FactoryImpl implements Factory {
        private final WsaaManager wsaaManager;
        private final CredentialsDao credentialsDao;

        @Inject
        public FactoryImpl(@Nonnull WsaaManager wsaaManager,
                           @Nonnull CredentialsDao credentialsDao) {
            this.wsaaManager = checkNotNull(wsaaManager);
            this.credentialsDao = checkNotNull(credentialsDao);
        }

        @Override
        public WsaaTemplate create(@Nonnull Service service) {
            checkNotNull(service);
            return new WsaaTemplateImpl(wsaaManager,
                    service,
                    credentialsDao);
        }
    }

    private final Object lock = new Object();
    private final WsaaManager wsaaManager;
    private final Service service;
    private final CredentialsDao credentialsDao;

    private WsaaTemplateImpl(WsaaManager wsaaManager,
                             Service service,
                             CredentialsDao credentialsDao) {
        this.wsaaManager = checkNotNull(wsaaManager);
        this.service = checkNotNull(service);
        this.credentialsDao = checkNotNull(credentialsDao);
    }

    @Override
    public <T> T runAuhtenticated(Function<Credentials, T> callback) {
        checkNotNull(callback);
        try {
            login();
            return callback.apply(credentialsDao
                    .loadCredentials(service));
        } catch (RuntimeException e) {
            if (e.getMessage() != null
                    && e.getMessage()
                    .matches("El tiempo de expiraci.n es inferior a la hora actual")) {
                credentialsDao
                        .deleteCredentials(service);
                login();
                return callback.apply(credentialsDao
                        .loadCredentials(service));
            } else {
                throw e;
            }
        }
    }

    private void login() {
        if (credentialsDao.loadCredentials(service) == null) {
            synchronized (lock) {
                if (credentialsDao.loadCredentials(service) == null) {
                    credentialsDao.saveCredentials(wsaaManager.login(service),
                            service);
                }
            }
        }
    }
}
