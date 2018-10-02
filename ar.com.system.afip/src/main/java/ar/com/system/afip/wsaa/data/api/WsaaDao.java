package ar.com.system.afip.wsaa.data.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface WsaaDao {
    void saveCompanyInfo(@Nonnull CompanyInfo companyInfo);

    @Nullable
    CompanyInfo loadActiveCompanyInfo();
}
