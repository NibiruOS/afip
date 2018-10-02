package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.service.api.Credentials;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(name = "loginTicketResponse")
public class LoginTicketResponse {
    @Attribute
    private String version;
    @Element
    private Header header;
    @Element
    private Credentials credentials;

    public String getVersion() {
        return version;
    }

    public Header getHeader() {
        return header;
    }

    public Credentials getCredentials() {
        return credentials;
    }

}
