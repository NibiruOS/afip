package ar.com.system.afip.wsmtxca.business.api;

import ar.com.system.afip.wsmtxca.service.api.AutorizarAjusteIVARequestType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarAjusteIVAResponseType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarComprobanteRequestType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.ComprobanteType;
import ar.com.system.afip.wsmtxca.service.api.ConsultaUltimoComprobanteAutorizadoRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarAlicuotasIVARequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarAlicuotasIVAResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCAEAEntreFechasRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCAEAEntreFechasResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarComprobanteRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCondicionesIVARequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCondicionesIVAResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCotizacionMonedaRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarCotizacionMonedaResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarMonedasRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarMonedasResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPtosVtaCAEANoInformadosRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPtosVtaCAEANoInformadosResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPuntosVentaCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPuntosVentaCAERequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPuntosVentaRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarPuntosVentaResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposComprobanteRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposDatosAdicionalesRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposDatosAdicionalesResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposDocumentoRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposDocumentoResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposTributoRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarTiposTributoResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarUltimoComprobanteAutorizadoRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarUltimoComprobanteAutorizadoResponseType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarUnidadesMedidaRequestType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarUnidadesMedidaResponseType;
import ar.com.system.afip.wsmtxca.service.api.DummyResponseType;
import ar.com.system.afip.wsmtxca.service.api.ExceptionFaultMsg;
import ar.com.system.afip.wsmtxca.service.api.InformarAjusteIVACAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarAjusteIVACAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoPtoVtaRequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoPtoVtaResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoRequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarComprobanteCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarComprobanteCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.SolicitudCAEAType;

public interface MtxcaManager {

	DummyResponseType dummy();

	AutorizarComprobanteResponseType autorizarComprobante(ComprobanteType comprobanteCAERequest);

	SolicitarCAEAResponseType solicitarCAEA(SolicitudCAEAType parameters);

	InformarComprobanteCAEAResponseType informarComprobanteCAEA(ComprobanteType parameters);

	ConsultarUltimoComprobanteAutorizadoResponseType consultarUltimoComprobanteAutorizado(ConsultaUltimoComprobanteAutorizadoRequestType parameters);
//
//	ConsultarComprobanteResponseType consultarComprobante(ConsultarComprobanteRequestType parameters);
//
//	ConsultarTiposComprobanteResponseType consultarTiposComprobante(ConsultarTiposComprobanteRequestType parameters);
//
//	ConsultarTiposDocumentoResponseType consultarTiposDocumento(ConsultarTiposDocumentoRequestType parameters);
//
//	ConsultarAlicuotasIVAResponseType consultarAlicuotasIVA(ConsultarAlicuotasIVARequestType parameters);
//
//	ConsultarCondicionesIVAResponseType consultarCondicionesIVA(ConsultarCondicionesIVARequestType parameters);
//
//	ConsultarMonedasResponseType consultarMonedas(ConsultarMonedasRequestType parameters);
//
//	ConsultarCotizacionMonedaResponseType consultarCotizacionMoneda(ConsultarCotizacionMonedaRequestType parameters);
//
//	ConsultarUnidadesMedidaResponseType consultarUnidadesMedida(ConsultarUnidadesMedidaRequestType parameters);
//
//	ConsultarPuntosVentaResponseType consultarPuntosVenta(ConsultarPuntosVentaRequestType parameters);
//
//	ConsultarPuntosVentaResponseType consultarPuntosVentaCAE(ConsultarPuntosVentaCAERequestType parameters);
//
//	ConsultarPuntosVentaResponseType consultarPuntosVentaCAEA(ConsultarPuntosVentaCAEARequestType parameters);
//
//	InformarCAEANoUtilizadoResponseType informarCAEANoUtilizado(InformarCAEANoUtilizadoRequestType parameters);
//
//	ConsultarTiposTributoResponseType consultarTiposTributo(ConsultarTiposTributoRequestType parameters);
//
//	InformarCAEANoUtilizadoPtoVtaResponseType informarCAEANoUtilizadoPtoVta(InformarCAEANoUtilizadoPtoVtaRequestType parameters);
//
//	ConsultarCAEAResponseType consultarCAEA(ConsultarCAEARequestType parameters);
//
//	ConsultarPtosVtaCAEANoInformadosResponseType consultarPtosVtaCAEANoInformados(ConsultarPtosVtaCAEANoInformadosRequestType parameters);
//
//	ConsultarCAEAEntreFechasResponseType consultarCAEAEntreFechas(ConsultarCAEAEntreFechasRequestType parameters);

//	/**
//	 * 
//	 * @param parameters
//	 * @return returns
//	 *         ar.gov.afip.wsmtxca.service.impl.service.AutorizarAjusteIVAResponseType
//	 * @throws ExceptionFaultMsg
//	 */
//	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/autorizarAjusteIVA")
//	@WebResult(name = "autorizarAjusteIVAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
//	AutorizarAjusteIVAResponseType autorizarAjusteIVA(
//			@WebParam(name = "autorizarAjusteIVARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") AutorizarAjusteIVARequestType parameters)
//			throws ExceptionFaultMsg;
//
//	/**
//	 * 
//	 * @param parameters
//	 * @return returns
//	 *         ar.gov.afip.wsmtxca.service.impl.service.InformarAjusteIVACAEAResponseType
//	 * @throws ExceptionFaultMsg
//	 */
//	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/informarAjusteIVACAEA")
//	@WebResult(name = "informarAjusteIVACAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
//	InformarAjusteIVACAEAResponseType informarAjusteIVACAEA(
//			@WebParam(name = "informarAjusteIVACAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") InformarAjusteIVACAEARequestType parameters)
//			throws ExceptionFaultMsg;
//
//	/**
//	 * 
//	 * @param parameters
//	 * @return returns
//	 *         ar.gov.afip.wsmtxca.service.impl.service.ConsultarTiposDatosAdicionalesResponseType
//	 * @throws ExceptionFaultMsg
//	 */
//	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarTiposDatosAdicionales")
//	@WebResult(name = "consultarTiposDatosAdicionalesResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
//	ConsultarTiposDatosAdicionalesResponseType consultarTiposDatosAdicionales(
//			@WebParam(name = "consultarTiposDatosAdicionalesRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarTiposDatosAdicionalesRequestType parameters)
//			throws ExceptionFaultMsg;

}
