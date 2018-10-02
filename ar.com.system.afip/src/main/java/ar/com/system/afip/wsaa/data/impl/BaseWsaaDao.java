package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

abstract class BaseWsaaDao implements WsaaDao {
    private final Persister<Map<Serializable, CompanyInfo>> persister;

    BaseWsaaDao(Persister<Map<Serializable, CompanyInfo>> persister) {
        this.persister = checkNotNull(persister);
    }

    @Override
    public void saveCompanyInfo(@Nonnull CompanyInfo companyInfo) {
        checkNotNull(companyInfo);
        Map<Serializable, CompanyInfo> map = map();
        map.put(companyInfo.getId(), companyInfo);
        persister.save(map);
    }

    @Override
    @Nullable
    public CompanyInfo loadActiveCompanyInfo() {
        return Iterables.find(map().values(),
                CompanyInfo::isActive,
                null);
    }

    private Map<Serializable, CompanyInfo> map() {
        Map<Serializable, CompanyInfo> map = persister.load();
        return map != null
                ? map
                : Maps.newHashMap();
    }
}
