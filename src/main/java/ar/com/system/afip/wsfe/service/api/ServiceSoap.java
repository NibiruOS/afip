package ar.com.system.afip.wsfe.service.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ServiceSoap")
public interface ServiceSoap {
	static final String SERVICE_NAME = "Service";
	static final String PORT_NAME = "ServiceSoap";
	static final String SERVICE_NAMESPACE = "http://ar.gov.afip.dif.FEV1/";

	/**
	 * Solicitud de C�digo de Autorizaci�n Electr�nico (CAE)
	 */
	@WebMethod(operationName = "FECAESolicitar", action = "http://ar.gov.afip.dif.FEV1/FECAESolicitar")
	@WebResult(name = "FECAESolicitarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAESolicitar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAESolicitarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEResponse fecaeSolicitar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "FeCAEReq", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FECAERequest feCAEReq);

	/**
	 * Retorna la cantidad maxima de registros que puede tener una invocacion al
	 * metodo FECAESolicitar / FECAEARegInformativo
	 */
	@WebMethod(operationName = "FECompTotXRequest", action = "http://ar.gov.afip.dif.FEV1/FECompTotXRequest")
	@WebResult(name = "FECompTotXRequestResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECompTotXRequest", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECompTotXRequestResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FERegXReqResponse feCompTotXRequest(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Metodo dummy para verificacion de funcionamiento
	 */
	@WebMethod(operationName = "FEDummy", action = "http://ar.gov.afip.dif.FEV1/FEDummy")
	@WebResult(name = "FEDummyResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEDummy", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEDummyResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public DummyResponse feDummy();

	/**
	 * Retorna el ultimo comprobante autorizado para el tipo de comprobante /
	 * cuit / punto de venta ingresado / Tipo de Emisi�n
	 */
	@WebMethod(operationName = "FECompUltimoAutorizado", action = "http://ar.gov.afip.dif.FEV1/FECompUltimoAutorizado")
	@WebResult(name = "FECompUltimoAutorizadoResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECompUltimoAutorizado", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECompUltimoAutorizadoResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FERecuperaLastCbteResponse feCompUltimoAutorizado(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "PtoVta", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int ptoVta,
			@WebParam(name = "CbteTipo", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int cbteTipo);

	/**
	 * Consulta Comprobante emitido y su c�digo.
	 */
	@WebMethod(operationName = "FECompConsultar", action = "http://ar.gov.afip.dif.FEV1/FECompConsultar")
	@WebResult(name = "FECompConsultarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECompConsultar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECompConsultarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECompConsultaResponse feCompConsultar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "FeCompConsReq", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FECompConsultaReq feCompConsReq);

	/**
	 * Rendici�n de comprobantes asociados a un CAEA.
	 */
	@WebMethod(operationName = "FECAEARegInformativo", action = "http://ar.gov.afip.dif.FEV1/FECAEARegInformativo")
	@WebResult(name = "FECAEARegInformativoResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAEARegInformativo", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAEARegInformativoResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEAResponse fecaeaRegInformativo(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "FeCAEARegInfReq", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FECAEARequest feCAEARegInfReq);

	/**
	 * Solicitud de C�digo de Autorizaci�n Electr�nico Anticipado (CAEA)
	 */
	@WebMethod(operationName = "FECAEASolicitar", action = "http://ar.gov.afip.dif.FEV1/FECAEASolicitar")
	@WebResult(name = "FECAEASolicitarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAEASolicitar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAEASolicitarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEAGetResponse fecaeaSolicitar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "Periodo", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int periodo,
			@WebParam(name = "Orden", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) short orden);

	/**
	 * Consulta CAEA informado como sin movimientos.
	 */
	@WebMethod(operationName = "FECAEASinMovimientoConsultar", action = "http://ar.gov.afip.dif.FEV1/FECAEASinMovimientoConsultar")
	@WebResult(name = "FECAEASinMovimientoConsultarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAEASinMovimientoConsultar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAEASinMovimientoConsultarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEASinMovConsResponse fecaeaSinMovimientoConsultar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "CAEA", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) String caea,
			@WebParam(name = "PtoVta", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int ptoVta);

	/**
	 * Informa CAEA sin movimientos.
	 */
	@WebMethod(operationName = "FECAEASinMovimientoInformar", action = "http://ar.gov.afip.dif.FEV1/FECAEASinMovimientoInformar")
	@WebResult(name = "FECAEASinMovimientoInformarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAEASinMovimientoInformar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAEASinMovimientoInformarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEASinMovResponse fecaeaSinMovimientoInformar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "PtoVta", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int ptoVta,
			@WebParam(name = "CAEA", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) String caea);

	/**
	 * Consultar CAEA emitidos.
	 */
	@WebMethod(operationName = "FECAEAConsultar", action = "http://ar.gov.afip.dif.FEV1/FECAEAConsultar")
	@WebResult(name = "FECAEAConsultarResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FECAEAConsultar", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FECAEAConsultarResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECAEAGetResponse fecaeaConsultar(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "Periodo", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) int periodo,
			@WebParam(name = "Orden", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) short orden);

	/**
	 * Recupera la cotizacion de la moneda consultada y su fecha
	 */
	@WebMethod(operationName = "FEParamGetCotizacion", action = "http://ar.gov.afip.dif.FEV1/FEParamGetCotizacion")
	@WebResult(name = "FEParamGetCotizacionResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetCotizacion", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetCotizacionResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FECotizacionResponse feParamGetCotizacion(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth,
			@WebParam(name = "MonId", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) String monId);

	/**
	 * Recupera el listado de los diferente tributos que pueden ser utilizados
	 * en el servicio de autorizacion
	 * 
	 * @param auth
	 * @return returns prueba.ws.wsfe.FETributoResponse
	 */
	@WebMethod(operationName = "FEParamGetTiposTributos", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposTributos")
	@WebResult(name = "FEParamGetTiposTributosResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposTributos", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposTributosResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FETributoResponse feParamGetTiposTributos(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de monedas utilizables en servicio de autorizaci�n
	 */
	@WebMethod(operationName = "FEParamGetTiposMonedas", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposMonedas")
	@WebResult(name = "FEParamGetTiposMonedasResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposMonedas", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposMonedasResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public MonedaResponse feParamGetTiposMonedas(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de Tipos de Iva utilizables en servicio de
	 * autorizaci�n.
	 */
	@WebMethod(operationName = "FEParamGetTiposIva", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposIva")
	@WebResult(name = "FEParamGetTiposIvaResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposIva", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposIvaResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public IvaTipoResponse feParamGetTiposIva(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de identificadores para los campos Opcionales
	 * 
	 * @param auth
	 * @return returns prueba.ws.wsfe.OpcionalTipoResponse
	 */
	@WebMethod(operationName = "FEParamGetTiposOpcional", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposOpcional")
	@WebResult(name = "FEParamGetTiposOpcionalResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposOpcional", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposOpcionalResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public OpcionalTipoResponse feParamGetTiposOpcional(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de identificadores para el campo Concepto.
	 */
	@WebMethod(operationName = "FEParamGetTiposConcepto", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposConcepto")
	@WebResult(name = "FEParamGetTiposConceptoResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposConcepto", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposConceptoResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public ConceptoTipoResponse feParamGetTiposConcepto(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de puntos de venta registrados y su estado
	 */
	@WebMethod(operationName = "FEParamGetPtosVenta", action = "http://ar.gov.afip.dif.FEV1/FEParamGetPtosVenta")
	@WebResult(name = "FEParamGetPtosVentaResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetPtosVenta", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetPtosVentaResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FEPtoVentaResponse feParamGetPtosVenta(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de Tipos de Comprobantes utilizables en servicio de
	 * autorizaci�n.
	 */
	@WebMethod(operationName = "FEParamGetTiposCbte", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposCbte")
	@WebResult(name = "FEParamGetTiposCbteResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposCbte", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposCbteResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public CbteTipoResponse feParamGetTiposCbte(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de Tipos de Documentos utilizables en servicio de
	 * autorizaci�n.
	 */
	@WebMethod(operationName = "FEParamGetTiposDoc", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposDoc")
	@WebResult(name = "FEParamGetTiposDocResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposDoc", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposDocResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public DocTipoResponse feParamGetTiposDoc(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

	/**
	 * Recupera el listado de los diferente paises que pueden ser utilizados en
	 * el servicio de autorizacion
	 */
	@WebMethod(operationName = "FEParamGetTiposPaises", action = "http://ar.gov.afip.dif.FEV1/FEParamGetTiposPaises")
	@WebResult(name = "FEParamGetTiposPaisesResult", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@RequestWrapper(localName = "FEParamGetTiposPaises", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	@ResponseWrapper(localName = "FEParamGetTiposPaisesResponse", targetNamespace = ServiceSoap.SERVICE_NAMESPACE)
	public FEPaisResponse feParamGetTiposPaises(
			@WebParam(name = "Auth", targetNamespace = ServiceSoap.SERVICE_NAMESPACE) FEAuthRequest auth);

}
