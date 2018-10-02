package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class FileSystemWsaaDao
        extends BaseWsaaDao {
    public FileSystemWsaaDao(String path, Gson gson) {
        super(new FileSystemPersister<>(path, gson,
                new TypeToken<Map<Service, CompanyInfo>>() {
                }.getType()));
    }
}
