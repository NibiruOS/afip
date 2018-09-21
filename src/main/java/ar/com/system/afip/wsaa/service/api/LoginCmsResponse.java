package ar.com.system.afip.wsaa.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "loginCmsResponse")
public class LoginCmsResponse {
    @Element
    private String loginCmsReturn;

    public String getLoginCmsReturn() {
        return loginCmsReturn;
    }
}
