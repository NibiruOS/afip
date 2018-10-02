package ar.com.system.afip.wsmtxca.business.impl;


public class MtxcaException extends RuntimeException {
    private static final long serialVersionUID = -6140230396277534874L;

    public MtxcaException(Exception root) {
        super(root);
    }
}
