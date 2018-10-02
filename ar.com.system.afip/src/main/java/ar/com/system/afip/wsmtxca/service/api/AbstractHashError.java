package ar.com.system.afip.wsmtxca.service.api;

public abstract class AbstractHashError implements HasErrors {

    public abstract ArrayCodigosDescripcionesType getArrayErrores();

    public ArrayCodigosDescripcionesType getErrors() {
        return getArrayErrores();
    }

}
