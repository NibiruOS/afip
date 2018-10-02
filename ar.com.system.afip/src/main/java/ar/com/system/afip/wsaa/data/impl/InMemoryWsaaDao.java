package ar.com.system.afip.wsaa.data.impl;

import javax.inject.Singleton;

@Singleton
public class InMemoryWsaaDao
        extends BaseWsaaDao {
    public InMemoryWsaaDao() {
        super(new MemoryPersister<>());
    }
}
