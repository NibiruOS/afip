package ar.com.system.afip.wsaa.service.api;

public class Credentials {
    private String token;
    private String sign;

    public Credentials() {
    }

    public Credentials(String token, String sign) {
        this.token = token;
        this.sign = sign;
    }

    public String getToken() {
        return token;
    }

    public String getSign() {
        return sign;
    }
}
