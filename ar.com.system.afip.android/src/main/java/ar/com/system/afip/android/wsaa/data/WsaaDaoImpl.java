package ar.com.system.afip.android.wsaa.data;

import ar.com.system.afip.android.wsaa.data.dao.RoomCompanyDao;
import ar.com.system.afip.android.wsaa.data.model.Company;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

public class WsaaDaoImpl implements WsaaDao {
    private final RoomCompanyDao companyDao;

    @Inject
    public WsaaDaoImpl(@Nonnull RoomCompanyDao companyDao) {
        this.companyDao = checkNotNull(companyDao);
    }

    @Override
    public void saveCompanyInfo(@Nonnull CompanyInfo companyInfo) {
        checkNotNull(companyInfo);
        Company company = Company.fromCompanyInfo(companyInfo);
        Company existing = companyDao.findById(company.getId());
        if (existing != null) {
            companyDao.update(company);
        } else {
            companyDao.insert(company);
        }
    }

    @Nullable
    @Override
    public CompanyInfo loadActiveCompanyInfo() {
        Company company = companyDao.findActiveCompany();
        return company != null
                ? company.toCompanyInfo()
                : null;
    }
}
