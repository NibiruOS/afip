package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CredentialsDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

public class FileSystemCredentialsDao
        extends BaseFilesystemDao<Map<Service, Credentials>>
        implements CredentialsDao {

    public FileSystemCredentialsDao(String path, Gson gson) {
        super(path, gson, new TypeToken<Map<Service, Credentials>>() {
        }.getType());
    }

    @Override
    public void saveCredentials(@Nonnull Credentials credentials,
                                @Nonnull Service service) {
        checkNotNull(credentials);
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = map();
        credentialsMap.put(service, credentials);
        save(credentialsMap);
    }

    @Nullable
    @Override
    public Credentials loadCredentials(@Nonnull Service service) {
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = map();
        return credentialsMap.get(service);
    }

    @Override
    public void deleteCredentials(@Nonnull Service service) {
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = map();
        credentialsMap.remove(service);
        save(credentialsMap);
    }

    private Map<Service, Credentials> map() {
        Map<Service, Credentials> credentialsMap = load();
        return credentialsMap != null
                ? credentialsMap
                : Maps.newHashMap();
    }
}
