package ar.com.system.afip.wsaa.data.impl;

import com.google.gson.Gson;

import javax.annotation.Nonnull;
import java.io.*;
import java.lang.reflect.Type;

import static com.google.common.base.Preconditions.checkNotNull;

class FileSystemPersister<T>
        implements Persister<T> {
    private final File path;
    private final Gson gson;
    private final Type type;

    FileSystemPersister(String path,
                        Gson gson,
                        Type type) {
        this.path = new File(checkNotNull(path));
        this.gson = checkNotNull(gson);
        this.type = checkNotNull(type);
    }

    @Override
    public void save(@Nonnull T entity) {
        checkNotNull(entity);
        if (!path.exists()) {
            path.getParentFile().mkdirs();
        } else {
            delete();
        }
        try (Writer out = new OutputStreamWriter(new FileOutputStream(path))) {
            gson.toJson(entity, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T load() {
        if (!path.exists()) {
            return null;
        }

        try (Reader in = new InputStreamReader(new FileInputStream(path))) {
            return gson.fromJson(in, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete() {
        path.delete();
    }
}
