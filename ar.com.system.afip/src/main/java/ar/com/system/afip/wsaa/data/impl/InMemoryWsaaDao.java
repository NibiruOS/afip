package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.google.common.base.Preconditions.checkNotNull;

public class InMemoryWsaaDao implements WsaaDao {
    private CompanyInfo companyInfo;

    @Override
    public void saveCompanyInfo(@Nonnull CompanyInfo companyInfo) {
        this.companyInfo = checkNotNull(companyInfo);
    }

    @Override
    @Nullable
    public CompanyInfo loadActiveCompanyInfo() {
        return companyInfo;
    }

}
