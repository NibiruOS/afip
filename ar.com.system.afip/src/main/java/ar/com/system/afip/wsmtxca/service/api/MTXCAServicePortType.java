
package ar.com.system.afip.wsmtxca.service.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = MTXCAServicePortType.PORT_NAME, targetNamespace = MTXCAServicePortType.SERVICE_NAMESPACE)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MTXCAServicePortType {
	String SERVICE_NAME = "MTXCAService";
	String PORT_NAME = "MTXCAServiceHttpSoap11Endpoint";
	String SERVICE_NAMESPACE = "http://impl.service.wsmtxca.afip.gov.ar/service/";

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/dummy")
	@WebResult(name = "dummyResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	DummyResponseType dummy() throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/autorizarComprobante")
	@WebResult(name = "autorizarComprobanteResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	AutorizarComprobanteResponseType autorizarComprobante(
			@WebParam(name = "autorizarComprobanteRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") AutorizarComprobanteRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/solicitarCAEA")
	@WebResult(name = "solicitarCAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	SolicitarCAEAResponseType solicitarCAEA(
			@WebParam(name = "solicitarCAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") SolicitarCAEARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/informarComprobanteCAEA")
	@WebResult(name = "informarComprobanteCAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	InformarComprobanteCAEAResponseType informarComprobanteCAEA(
			@WebParam(name = "informarComprobanteCAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") InformarComprobanteCAEARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarUltimoComprobanteAutorizado")
	@WebResult(name = "consultarUltimoComprobanteAutorizadoResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarUltimoComprobanteAutorizadoResponseType consultarUltimoComprobanteAutorizado(
			@WebParam(name = "consultarUltimoComprobanteAutorizadoRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarUltimoComprobanteAutorizadoRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarComprobante")
	@WebResult(name = "consultarComprobanteResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarComprobanteResponseType consultarComprobante(
			@WebParam(name = "consultarComprobanteRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarComprobanteRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarTiposComprobante")
	@WebResult(name = "consultarTiposComprobanteResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarTiposComprobanteResponseType consultarTiposComprobante(
			@WebParam(name = "consultarTiposComprobanteRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarTiposComprobanteRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarTiposDocumento")
	@WebResult(name = "consultarTiposDocumentoResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarTiposDocumentoResponseType consultarTiposDocumento(
			@WebParam(name = "consultarTiposDocumentoRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarTiposDocumentoRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarAlicuotasIVA")
	@WebResult(name = "consultarAlicuotasIVAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarAlicuotasIVAResponseType consultarAlicuotasIVA(
			@WebParam(name = "consultarAlicuotasIVARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarAlicuotasIVARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarCondicionesIVA")
	@WebResult(name = "consultarCondicionesIVAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarCondicionesIVAResponseType consultarCondicionesIVA(
			@WebParam(name = "consultarCondicionesIVARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarCondicionesIVARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarMonedas")
	@WebResult(name = "consultarMonedasResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarMonedasResponseType consultarMonedas(
			@WebParam(name = "consultarMonedasRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarMonedasRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarCotizacionMoneda")
	@WebResult(name = "consultarCotizacionMonedaResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarCotizacionMonedaResponseType consultarCotizacionMoneda(
			@WebParam(name = "consultarCotizacionMonedaRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarCotizacionMonedaRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarUnidadesMedida")
	@WebResult(name = "consultarUnidadesMedidaResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarUnidadesMedidaResponseType consultarUnidadesMedida(
			@WebParam(name = "consultarUnidadesMedidaRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarUnidadesMedidaRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarPuntosVenta")
	@WebResult(name = "consultarPuntosVentaResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarPuntosVentaResponseType consultarPuntosVenta(
			@WebParam(name = "consultarPuntosVentaRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarPuntosVentaRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarPuntosVentaCAE")
	@WebResult(name = "consultarPuntosVentaCAEResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarPuntosVentaResponseType consultarPuntosVentaCAE(
			@WebParam(name = "consultarPuntosVentaCAERequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarPuntosVentaCAERequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarPuntosVentaCAEA")
	@WebResult(name = "consultarPuntosVentaCAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarPuntosVentaResponseType consultarPuntosVentaCAEA(
			@WebParam(name = "consultarPuntosVentaCAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarPuntosVentaCAEARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/informarCAEANoUtilizado")
	@WebResult(name = "informarCAEANoUtilizadoResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	InformarCAEANoUtilizadoResponseType informarCAEANoUtilizado(
			@WebParam(name = "informarCAEANoUtilizadoRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") InformarCAEANoUtilizadoRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarTiposTributo")
	@WebResult(name = "consultarTiposTributoResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarTiposTributoResponseType consultarTiposTributo(
			@WebParam(name = "consultarTiposTributoRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarTiposTributoRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/informarCAEANoUtilizadoPtoVta")
	@WebResult(name = "informarCAEANoUtilizadoPtoVtaResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	InformarCAEANoUtilizadoPtoVtaResponseType informarCAEANoUtilizadoPtoVta(
			@WebParam(name = "informarCAEANoUtilizadoPtoVtaRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") InformarCAEANoUtilizadoPtoVtaRequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarCAEA")
	@WebResult(name = "consultarCAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarCAEAResponseType consultarCAEA(
			@WebParam(name = "consultarCAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarCAEARequestType parameters)
			throws ExceptionFaultMsg;

	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarPtosVtaCAEANoInformados")
	@WebResult(name = "consultarPtosVtaCAEANoInformadosResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarPtosVtaCAEANoInformadosResponseType consultarPtosVtaCAEANoInformados(
			@WebParam(name = "consultarPtosVtaCAEANoInformadosRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarPtosVtaCAEANoInformadosRequestType parameters)
			throws ExceptionFaultMsg;

	/**
	 * 
	 * @param parameters
	 * @return returns
	 *         ar.gov.afip.wsmtxca.service.impl.service.ConsultarCAEAEntreFechasResponseType
	 * @throws ExceptionFaultMsg
	 */
	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarCAEAEntreFechas")
	@WebResult(name = "consultarCAEAEntreFechasResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarCAEAEntreFechasResponseType consultarCAEAEntreFechas(
			@WebParam(name = "consultarCAEAEntreFechasRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarCAEAEntreFechasRequestType parameters)
			throws ExceptionFaultMsg;

	/**
	 * 
	 * @param parameters
	 * @return returns
	 *         ar.gov.afip.wsmtxca.service.impl.service.AutorizarAjusteIVAResponseType
	 * @throws ExceptionFaultMsg
	 */
	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/autorizarAjusteIVA")
	@WebResult(name = "autorizarAjusteIVAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	AutorizarAjusteIVAResponseType autorizarAjusteIVA(
			@WebParam(name = "autorizarAjusteIVARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") AutorizarAjusteIVARequestType parameters)
			throws ExceptionFaultMsg;

	/**
	 * 
	 * @param parameters
	 * @return returns
	 *         ar.gov.afip.wsmtxca.service.impl.service.InformarAjusteIVACAEAResponseType
	 * @throws ExceptionFaultMsg
	 */
	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/informarAjusteIVACAEA")
	@WebResult(name = "informarAjusteIVACAEAResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	InformarAjusteIVACAEAResponseType informarAjusteIVACAEA(
			@WebParam(name = "informarAjusteIVACAEARequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") InformarAjusteIVACAEARequestType parameters)
			throws ExceptionFaultMsg;

	/**
	 * 
	 * @param parameters
	 * @return returns
	 *         ar.gov.afip.wsmtxca.service.impl.service.ConsultarTiposDatosAdicionalesResponseType
	 * @throws ExceptionFaultMsg
	 */
	@WebMethod(action = "http://impl.service.wsmtxca.afip.gov.ar/service/consultarTiposDatosAdicionales")
	@WebResult(name = "consultarTiposDatosAdicionalesResponse", targetNamespace = SERVICE_NAMESPACE, partName = "parameters")
	ConsultarTiposDatosAdicionalesResponseType consultarTiposDatosAdicionales(
			@WebParam(name = "consultarTiposDatosAdicionalesRequest", targetNamespace = SERVICE_NAMESPACE, partName = "parameters") ConsultarTiposDatosAdicionalesRequestType parameters)
			throws ExceptionFaultMsg;

}
