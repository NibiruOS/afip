package ar.com.system.afip.wsaa.data.api;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.service.api.Credentials;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface CredentialsDao {
    void saveCredentials(@Nonnull Credentials credentials,
                         @Nonnull Service service);

    @Nullable
    Credentials loadCredentials(@Nonnull Service service);

    void deleteCredentials(@Nonnull Service service);
}
