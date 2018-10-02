package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.CredentialsDao;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.common.collect.Maps;
import com.google.common.io.BaseEncoding;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

abstract class BaseCredentialsDao
        implements CredentialsDao {
    private Persister<Map<String, Map<Service, Credentials>>> persister;
    private final WsaaDao wsaaDao;

    public BaseCredentialsDao(Persister<Map<String, Map<Service, Credentials>>> persister,
                              WsaaDao wsaaDao) {
        this.persister = checkNotNull(persister);
        this.wsaaDao = checkNotNull(wsaaDao);
    }

    @Override
    public void saveCredentials(@Nonnull Credentials credentials,
                                @Nonnull Service service) {
        checkNotNull(credentials);
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = credentialsMap();
        credentialsMap.put(service, credentials);
        saveCredentials(credentialsMap);
    }

    @Nullable
    @Override
    public Credentials loadCredentials(@Nonnull Service service) {
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = credentialsMap();
        return credentialsMap.get(service);
    }

    @Override
    public void deleteCredentials(@Nonnull Service service) {
        checkNotNull(service);
        Map<Service, Credentials> credentialsMap = credentialsMap();
        credentialsMap.remove(service);
        saveCredentials(credentialsMap);
    }

    private void saveCredentials(Map<Service, Credentials> credentialsMap) {
        Map<String, Map<Service, Credentials>> companyMap = companyMap();
        companyMap.put(company(), credentialsMap);
        persister.save(companyMap);
    }

    private Map<Service, Credentials> credentialsMap() {
        Map<Service, Credentials> credentialsMap = companyMap().get(company());
        return credentialsMap != null
                ? credentialsMap
                : Maps.newHashMap();
    }

    private Map<String, Map<Service, Credentials>> companyMap() {
        Map<String, Map<Service, Credentials>> companyMap = persister.load();
        return companyMap != null
                ? companyMap
                : Maps.newHashMap();
    }

    private String company() {
        CompanyInfo company = wsaaDao.loadActiveCompanyInfo();
        checkState(company != null, "No active company");

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(baos)) {
            out.writeObject(company.getId());
            out.flush();
            return BaseEncoding.base64()
                    .encode(baos.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
