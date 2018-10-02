package ar.com.system.afip.common.service;

import javax.annotation.Nonnull;

import static java.util.Objects.requireNonNull;

public class SoapException extends RuntimeException {
    private final String code;
    private final String string;

    public SoapException(@Nonnull String code,
                         @Nonnull String string) {
        super(code + " - " + string);
        this.code = requireNonNull(code);
        this.string = requireNonNull(string);
    }

    public String getCode() {
        return code;
    }

    public String getString() {
        return string;
    }
}