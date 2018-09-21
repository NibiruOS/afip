package ar.com.system.afip.wsaa.service.api;

import org.simpleframework.xml.Element;

public class Credentials {
    @Element
    private String token;
    @Element
    private String sign;

    public String getToken() {
        return token;
    }

    public String getSign() {
        return sign;
    }
}
