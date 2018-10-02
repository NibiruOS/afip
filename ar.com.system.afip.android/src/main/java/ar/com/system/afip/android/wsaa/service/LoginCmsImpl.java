package ar.com.system.afip.android.wsaa.service;

import ar.com.system.afip.android.wsaa.service.dto.LoginCmsRequest;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import ar.com.system.afip.wsaa.service.api.LoginFaultException;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkNotNull;

public class LoginCmsImpl implements LoginCMS {
    private final RetrofitLoginCms retrofitLoginCms;

    @Inject
    public LoginCmsImpl(@Nonnull RetrofitLoginCms retrofitLoginCms) {
        this.retrofitLoginCms = checkNotNull(retrofitLoginCms);
    }

    @Override
    public String loginCms(String cms) throws LoginFaultException {
        checkNotNull(retrofitLoginCms);
        try {
            return retrofitLoginCms.loginCms(new LoginCmsRequest(cms))
                    .execute()
                    .body()
                    .getLoginCmsReturn();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
