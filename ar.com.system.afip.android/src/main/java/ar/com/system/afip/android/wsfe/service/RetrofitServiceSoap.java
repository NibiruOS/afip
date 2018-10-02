package ar.com.system.afip.android.wsfe.service;

import ar.com.system.afip.wsfe.service.api.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static ar.com.system.afip.wsfe.service.api.ServiceSoap.SERVICE_NAMESPACE;
import static io.github.nibiruos.retrosoap.SoapConstants.CONTENT_TYPE_HEADER;
import static io.github.nibiruos.retrosoap.SoapConstants.SOAP_ACTION_PREFIX;


public interface RetrofitServiceSoap {
    String SERVICE_PATH = "../service.asmx";

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAESolicitar\""})
    @POST(SERVICE_PATH)
    Call<FECAESolicitarResponse> fecaeSolicitar(
            @Body FECAESolicitar fecaeSolicitar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECompTotXRequest\""})
    @POST(SERVICE_PATH)
    Call<FECompTotXRequestResponse> feCompTotXRequest(
            @Body FECompTotXRequest feCompTotXRequest);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEDummy\""})
    @POST(SERVICE_PATH)
    Call<FEDummyResponse> feDummy(@Body FEDummy feDummy);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECompUltimoAutorizado\""})
    @POST(SERVICE_PATH)
    Call<FECompUltimoAutorizadoResponse> feCompUltimoAutorizado(
            @Body FECompUltimoAutorizado feCompUltimoAutorizado);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECompConsultar\""})
    @POST(SERVICE_PATH)
    Call<FECompConsultarResponse> feCompConsultar(
            @Body FECompConsultar feCompConsultar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAEARegInformativo\""})
    @POST(SERVICE_PATH)
    Call<FECAEARegInformativoResponse> fecaeaRegInformativo(
            @Body FECAEARegInformativo fecaeaRegInformativo);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAEASolicitar\""})
    @POST(SERVICE_PATH)
    Call<FECAEASolicitarResponse> fecaeaSolicitar(
            @Body FECAEASolicitar fecaeaSolicitar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAEASinMovimientoConsultar\""})
    @POST(SERVICE_PATH)
    Call<FECAEASinMovimientoConsultarResponse> fecaeaSinMovimientoConsultar(
            @Body FECAEASinMovimientoConsultar fecaeaSinMovimientoConsultar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAEASinMovimientoInformar\""})
    @POST(SERVICE_PATH)
    Call<FECAEASinMovimientoInformarResponse> fecaeaSinMovimientoInformar(
            @Body FECAEASinMovimientoInformar fecaeaSinMovimientoInformar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FECAEAConsultar\""})
    @POST(SERVICE_PATH)
    Call<FECAEAConsultarResponse> fecaeaConsultar(
            @Body FECAEAConsultar fecaeaConsultar);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetCotizacion\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetCotizacionResponse> feParamGetCotizacion(
            @Body FEParamGetCotizacion feParamGetCotizacion);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposTributos\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposTributosResponse> feParamGetTiposTributos(
            @Body FEParamGetTiposTributos feParamGetTiposTributos);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposMonedas\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposMonedasResponse> feParamGetTiposMonedas(
            @Body FEParamGetTiposMonedas feParamGetTiposMonedas);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposIva\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposIvaResponse> feParamGetTiposIva(
            @Body FEParamGetTiposIva feParamGetTiposIva);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposOpcional\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposOpcionalResponse> feParamGetTiposOpcional(
            @Body FEParamGetTiposOpcional feParamGetTiposOpcional);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposConcepto\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposConceptoResponse> feParamGetTiposConcepto(
            @Body FEParamGetTiposConcepto feParamGetTiposConcepto);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetPtosVenta\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetPtosVentaResponse> feParamGetPtosVenta(
            @Body FEParamGetPtosVenta feParamGetPtosVenta);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposCbte\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposCbteResponse> feParamGetTiposCbte(
            @Body FEParamGetTiposCbte feParamGetTiposCbte);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposDoc\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposDocResponse> feParamGetTiposDoc(
            @Body FEParamGetTiposDoc feParamGetTiposDoc);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "FEParamGetTiposPaises\""})
    @POST(SERVICE_PATH)
    Call<FEParamGetTiposPaisesResponse> feParamGetTiposPaises(
            @Body FEParamGetTiposPaises feParamGetTiposPaises);
}
