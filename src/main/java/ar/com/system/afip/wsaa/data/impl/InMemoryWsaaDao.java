package ar.com.system.afip.wsaa.data.impl;

import javax.inject.Inject;

import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;

import static com.google.common.base.Preconditions.checkNotNull;

public class InMemoryWsaaDao implements WsaaDao {
    private CompanyInfo companyInfo;

    @Inject
    public InMemoryWsaaDao() {
    }

    @Override
    public void saveCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = checkNotNull(companyInfo);
    }

    @Override
    public CompanyInfo loadActiveCompanyInfo() {
        return companyInfo;
    }

}
