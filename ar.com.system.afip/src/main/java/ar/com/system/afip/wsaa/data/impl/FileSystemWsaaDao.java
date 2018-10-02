package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import com.google.gson.Gson;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

public class FileSystemWsaaDao
        extends BaseFilesystemDao<CompanyInfo>
        implements WsaaDao {

    public FileSystemWsaaDao(String path, Gson gson) {
        super(path, gson, CompanyInfo.class);
    }

    @Override
    public void saveCompanyInfo(@Nonnull CompanyInfo companyInfo) {
        checkNotNull(companyInfo);
        save(companyInfo);
    }

    @Override
    public CompanyInfo loadActiveCompanyInfo() {
        return load();
    }
}
