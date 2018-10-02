package ar.com.system.afip.wsaa.data.impl;

import javax.annotation.Nonnull;

interface Persister<T> {
    void save(@Nonnull T entity);

    T load();

    void delete();
}
