package ar.com.system.afip.common.service;

import javax.annotation.Nullable;
import java.util.concurrent.Callable;

public interface ExceptionConverter {
    @Nullable
    <T> T convert(Callable<T> callback);
}
