package ar.com.system.afip.android.common.service;

import ar.com.system.afip.common.service.ExceptionConverter;
import ar.com.system.afip.common.service.SoapException;
import io.github.nibiruos.retrosoap.SoapFault;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.util.concurrent.Callable;

public class RetrosoapExceptionConverter
        implements ExceptionConverter {
    @Inject
    public RetrosoapExceptionConverter() {
    }

    @Nullable
    @Override
    public <T> T convert(Callable<T> callback) {
        try {
            return callback.call();
        } catch (SoapFault e) {
            throw new SoapException(e.getCode(), e.getString());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
