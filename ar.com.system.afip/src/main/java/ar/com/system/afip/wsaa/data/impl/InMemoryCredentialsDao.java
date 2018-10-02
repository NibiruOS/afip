package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.data.api.WsaaDao;

import javax.inject.Singleton;

@Singleton
public class InMemoryCredentialsDao
        extends BaseCredentialsDao {
    public InMemoryCredentialsDao(WsaaDao wsaaDao) {
        super(new MemoryPersister<>(), wsaaDao);
    }
}
