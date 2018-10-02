package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CredentialsDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.common.collect.Maps;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Singleton;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

@Singleton
public class InMemoryCredentialsDao
        implements CredentialsDao {
    private final Map<Service, Credentials> credentialsMap;

    public InMemoryCredentialsDao() {
        credentialsMap = Maps.newHashMap();
    }

    @Override
    public void saveCredentials(@Nonnull Credentials credentials,
                                @Nonnull Service service) {
        checkNotNull(credentials);
        checkNotNull(service);
        credentialsMap.put(service, credentials);
    }

    @Override
    @Nullable
    public Credentials loadCredentials(@Nonnull Service service) {
        checkNotNull(service);
        return credentialsMap.get(service);
    }

    @Override
    public void deleteCredentials(@Nonnull Service service) {
        checkNotNull(service);
        credentialsMap.remove(service);
    }
}
