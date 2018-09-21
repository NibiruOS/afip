package ar.com.system.afip.wsaa.service.impl;

import java.io.IOException;
import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.CallAdapter;

import static com.google.common.base.Preconditions.checkNotNull;

public class PojoCallAdapter implements CallAdapter<Object, Object> {
    private final Type type;

    public PojoCallAdapter(Type type) {
        this.type = checkNotNull(type);
    }

    @Override
    public Type responseType() {
        return type;
    }

    @Override
    public Object adapt(Call<Object> call) {
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
