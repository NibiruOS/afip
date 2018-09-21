package ar.com.system.afip.wsaa.service.api;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LoginCMS {
    String SERVICE_NAME = "LoginCMSService";
    String PORT_NAME = "LoginCms";
    String WSAA_NAMESPACE = "http://wsaa.view.sua.dvadac.desein.afip.gov";

    @Headers({"Content-Type: text/xml;charset=UTF-8",
            "SOAPAction: \"\""})
    @POST("../LoginCms")
    LoginCmsResponse loginCms(@Body LoginCmsRequest cmsBody);
}
