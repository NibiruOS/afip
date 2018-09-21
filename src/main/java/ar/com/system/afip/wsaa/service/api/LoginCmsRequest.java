package ar.com.system.afip.wsaa.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

@Root(name = "loginCms")
public class LoginCmsRequest {
    @Element(name = "arg0")
    private final String cms;

    public LoginCmsRequest(@Nonnull String cms) {
        this.cms = checkNotNull(cms);
    }
}
