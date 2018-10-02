package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class FileSystemCredentialsDao
        extends BaseCredentialsDao {
    public FileSystemCredentialsDao(String path,
                                    Gson gson,
                                    WsaaDao wsaaDao) {
        super(new FileSystemPersister<>(path, gson,
                new TypeToken<Map<String, Map<Service, Credentials>>>() {
                }.getType()), wsaaDao);
    }
}
