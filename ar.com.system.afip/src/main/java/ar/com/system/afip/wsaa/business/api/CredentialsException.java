package ar.com.system.afip.wsaa.business.api;

/**
 * Excepcion a ser lanzada ante un problema con credenciales.
 * Cada servicio maneja los errores de credenciales de forma diferente
 * (por ejemplo, WSFE retorna un código 600), de manera que cada
 * manager tiene la responsabilidad de detectar dicho error y lanzar
 * una excepcion de este tipo, de modo que WsaaTemplate pueda capturarla.
 */
public class CredentialsException
        extends RuntimeException {
    public CredentialsException(String message) {
        super(message);
    }

    public CredentialsException(Exception root) {
        super(root);
    }
}
