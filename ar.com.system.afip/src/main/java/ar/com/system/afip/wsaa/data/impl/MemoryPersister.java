package ar.com.system.afip.wsaa.data.impl;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

class MemoryPersister<T>
        implements Persister<T> {
    private T entity;

    @Override
    public void save(@Nonnull T entity) {
        this.entity = checkNotNull(entity);
    }

    @Override
    public T load() {
        return entity;
    }

    @Override
    public void delete() {
        this.entity = null;
    }
}
