package ar.com.system.afip.android.wsaa.service;

import ar.com.system.afip.android.wsaa.service.dto.LoginCmsRequest;
import ar.com.system.afip.android.wsaa.service.dto.LoginCmsResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static io.github.nibiruos.retrosoap.SoapConstants.CONTENT_TYPE_HEADER;
import static io.github.nibiruos.retrosoap.SoapConstants.SOAP_ACTION_PREFIX;

public interface RetrofitLoginCms {
    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + "\"\""})
    @POST("../LoginCms")
    Call<LoginCmsResponse> loginCms(@Body LoginCmsRequest cmsBody);
}
