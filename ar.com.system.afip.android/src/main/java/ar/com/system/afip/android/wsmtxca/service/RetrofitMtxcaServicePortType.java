package ar.com.system.afip.android.wsmtxca.service;

import ar.com.system.afip.wsmtxca.service.api.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType.SERVICE_NAMESPACE;
import static io.github.nibiruos.retrosoap.SoapConstants.CONTENT_TYPE_HEADER;
import static io.github.nibiruos.retrosoap.SoapConstants.SOAP_ACTION_PREFIX;


public interface RetrofitMtxcaServicePortType {
    String SERVICE_PATH = "../MTXCAService";

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "dummy\""})
    @POST(SERVICE_PATH)
    Call<DummyResponseType> dummy(@Body String dummy);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "autorizarComprobante\""})
    @POST(SERVICE_PATH)
    Call<AutorizarComprobanteResponseType> autorizarComprobante(@Body AutorizarComprobanteRequestType request);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "solicitarCAEA\""})
    @POST(SERVICE_PATH)
    Call<SolicitarCAEAResponseType> solicitarCAEA(@Body SolicitarCAEARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "informarComprobanteCAEA\""})
    @POST(SERVICE_PATH)
    Call<InformarComprobanteCAEAResponseType> informarComprobanteCAEA(
            @Body InformarComprobanteCAEARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarUltimoComprobanteAutorizado\""})
    @POST(SERVICE_PATH)
    Call<ConsultarUltimoComprobanteAutorizadoResponseType> consultarUltimoComprobanteAutorizado(
            @Body ConsultarUltimoComprobanteAutorizadoRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarComprobante\""})
    @POST(SERVICE_PATH)
    Call<ConsultarComprobanteResponseType> consultarComprobante(
            @Body ConsultarComprobanteRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarTiposComprobante\""})
    @POST(SERVICE_PATH)
    Call<ConsultarTiposComprobanteResponseType> consultarTiposComprobante(
            @Body ConsultarTiposComprobanteRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarTiposDocumento\""})
    @POST(SERVICE_PATH)
    Call<ConsultarTiposDocumentoResponseType> consultarTiposDocumento(
            @Body ConsultarTiposDocumentoRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarAlicuotasIVA\""})
    @POST(SERVICE_PATH)
    Call<ConsultarAlicuotasIVAResponseType> consultarAlicuotasIVA(
            @Body ConsultarAlicuotasIVARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarCondicionesIVA\""})
    @POST(SERVICE_PATH)
    Call<ConsultarCondicionesIVAResponseType> consultarCondicionesIVA(
            @Body ConsultarCondicionesIVARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarMonedas\""})
    @POST(SERVICE_PATH)
    Call<ConsultarMonedasResponseType> consultarMonedas(
            @Body ConsultarMonedasRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarCotizacionMoneda\""})
    @POST(SERVICE_PATH)
    Call<ConsultarCotizacionMonedaResponseType> consultarCotizacionMoneda(
            @Body ConsultarCotizacionMonedaRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarUnidadesMedida\""})
    @POST(SERVICE_PATH)
    Call<ConsultarUnidadesMedidaResponseType> consultarUnidadesMedida(
            @Body ConsultarUnidadesMedidaRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarPuntosVenta\""})
    @POST(SERVICE_PATH)
    Call<ConsultarPuntosVentaResponseType> consultarPuntosVenta(
            @Body ConsultarPuntosVentaRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarPuntosVentaCAE\""})
    @POST(SERVICE_PATH)
    Call<ConsultarPuntosVentaResponseType> consultarPuntosVentaCAE(
            @Body ConsultarPuntosVentaCAERequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarPuntosVentaCAEA\""})
    @POST(SERVICE_PATH)
    Call<ConsultarPuntosVentaResponseType> consultarPuntosVentaCAEA(
            @Body ConsultarPuntosVentaCAEARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "informarCAEANoUtilizado\""})
    @POST(SERVICE_PATH)
    Call<InformarCAEANoUtilizadoResponseType> informarCAEANoUtilizado(
            @Body InformarCAEANoUtilizadoRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarTiposTributo\""})
    @POST(SERVICE_PATH)
    Call<ConsultarTiposTributoResponseType> consultarTiposTributo(
            @Body ConsultarTiposTributoRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "informarCAEANoUtilizadoPtoVta\""})
    @POST(SERVICE_PATH)
    Call<InformarCAEANoUtilizadoPtoVtaResponseType> informarCAEANoUtilizadoPtoVta(
            @Body InformarCAEANoUtilizadoPtoVtaRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarCAEA\""})
    @POST(SERVICE_PATH)
    Call<ConsultarCAEAResponseType> consultarCAEA(
            @Body ConsultarCAEARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarPtosVtaCAEANoInformados\""})
    @POST(SERVICE_PATH)
    Call<ConsultarPtosVtaCAEANoInformadosResponseType> consultarPtosVtaCAEANoInformados(
            @Body ConsultarPtosVtaCAEANoInformadosRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarCAEAEntreFechas\""})
    @POST(SERVICE_PATH)
    Call<ConsultarCAEAEntreFechasResponseType> consultarCAEAEntreFechas(
            @Body ConsultarCAEAEntreFechasRequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "autorizarAjusteIVA\""})
    @POST(SERVICE_PATH)
    Call<AutorizarAjusteIVAResponseType> autorizarAjusteIVA(
            @Body AutorizarAjusteIVARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "informarAjusteIVACAEA\""})
    @POST(SERVICE_PATH)
    Call<InformarAjusteIVACAEAResponseType> informarAjusteIVACAEA(
            @Body InformarAjusteIVACAEARequestType parameters);

    @Headers({CONTENT_TYPE_HEADER,
            SOAP_ACTION_PREFIX + '"' + SERVICE_NAMESPACE + "consultarTiposDatosAdicionales\""})
    @POST(SERVICE_PATH)
    Call<ConsultarTiposDatosAdicionalesResponseType> consultarTiposDatosAdicionales(
            @Body ConsultarTiposDatosAdicionalesRequestType parameters);
}
