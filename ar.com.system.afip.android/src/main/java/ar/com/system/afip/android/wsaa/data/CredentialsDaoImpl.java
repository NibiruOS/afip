package ar.com.system.afip.android.wsaa.data;

import ar.com.system.afip.android.wsaa.data.dao.RoomCompanyDao;
import ar.com.system.afip.android.wsaa.data.dao.RoomCredentialsDao;
import ar.com.system.afip.android.wsaa.data.model.ServiceCredentials;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CredentialsDao;
import ar.com.system.afip.wsaa.service.api.Credentials;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

public class CredentialsDaoImpl implements CredentialsDao {
    private final RoomCredentialsDao credentialsDao;
    private final RoomCompanyDao companyDao;

    @Inject
    public CredentialsDaoImpl(@Nonnull RoomCredentialsDao credentialsDao,
                              @Nonnull RoomCompanyDao companyDao) {
        this.credentialsDao = checkNotNull(credentialsDao);
        this.companyDao = checkNotNull(companyDao);
    }

    @Override
    public void saveCredentials(@Nonnull Credentials credentials,
                                @Nonnull Service service) {
        checkNotNull(credentials);
        checkNotNull(service);

        ServiceCredentials serviceCredentials = ServiceCredentials
                .fromCredentials(activeCompany(),
                        service,
                        credentials);

        // TODO: buscar la empresa activa
        ServiceCredentials existing = credentialsDao.findByService(service);
        if (existing != null) {
            credentialsDao.update(serviceCredentials);
        } else {
            credentialsDao.insert(serviceCredentials);
        }
    }

    @Nullable
    @Override
    public Credentials loadCredentials(@Nonnull Service service) {
        checkNotNull(service);
        ServiceCredentials serviceCredentials = credentialsDao.findByService(service);
        return serviceCredentials != null
                ? serviceCredentials.toCredentials()
                : null;
    }

    @Override
    public void deleteCredentials(@Nonnull Service service) {
        checkNotNull(service);
        credentialsDao.deleteByService(service,
                activeCompany());
    }

    private int activeCompany() {
        return companyDao.findActiveCompany()
                .getId();
    }
}
