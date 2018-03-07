package ar.com.system.afip.wsfe.business.api;

import java.util.List;

import ar.com.system.afip.wsfe.service.api.CbteTipo;
import ar.com.system.afip.wsfe.service.api.ConceptoTipo;
import ar.com.system.afip.wsfe.service.api.Cotizacion;
import ar.com.system.afip.wsfe.service.api.DocTipo;
import ar.com.system.afip.wsfe.service.api.FECAEAGet;
import ar.com.system.afip.wsfe.service.api.FECAEARequest;
import ar.com.system.afip.wsfe.service.api.FECAEAResponse;
import ar.com.system.afip.wsfe.service.api.FECAEASinMov;
import ar.com.system.afip.wsfe.service.api.FECAEASinMovResponse;
import ar.com.system.afip.wsfe.service.api.FECAERequest;
import ar.com.system.afip.wsfe.service.api.FECAEResponse;
import ar.com.system.afip.wsfe.service.api.FECompConsResponse;
import ar.com.system.afip.wsfe.service.api.FECompConsultaReq;
import ar.com.system.afip.wsfe.service.api.IvaTipo;
import ar.com.system.afip.wsfe.service.api.Moneda;
import ar.com.system.afip.wsfe.service.api.OpcionalTipo;
import ar.com.system.afip.wsfe.service.api.PaisTipo;
import ar.com.system.afip.wsfe.service.api.PtoVenta;
import ar.com.system.afip.wsfe.service.api.TributoTipo;

public interface WsfeManager {
	/**
	 * Solicitud de Codigo de Autorizacion Electronico (CAE)
	 */
	public FECAEResponse fecaeSolicitar(FECAERequest feCAEReq);

	/**
	 * Retorna la cantidad maxima de registros que puede tener una invocacion al
	 * metodo FECAESolicitar / FECAEARegInformativo
	 */
	public int feCompTotXRequest();

	/**
	 * Retorna el ultimo comprobante autorizado para el tipo de comprobante /
	 * cuit / punto de venta ingresado / Tipo de Emision
	 */
	public int feCompUltimoAutorizado(int ptoVta, int cbteTipo);

	/**
	 * Consulta Comprobante emitido y su codigo.
	 */
	public FECompConsResponse feCompConsultar(FECompConsultaReq feCompConsReq);

	/**
	 * Rendicion de comprobantes asociados a un CAEA.
	 */
	public FECAEAResponse fecaeaRegInformativo(FECAEARequest feCAEARegInfReq);

	/**
	 * Solicitud de Codigo de Autorizacion Electronico Anticipado (CAEA)
	 */
	public FECAEAGet fecaeaSolicitar(int periodo, short orden);

	/**
	 * Consulta CAEA informado como sin movimientos.
	 */
	public List<FECAEASinMov> fecaeaSinMovimientoConsultar(String caea, int ptoVta);

	/**
	 * Informa CAEA sin movimientos.
	 */
	public FECAEASinMovResponse fecaeaSinMovimientoInformar(int ptoVta, String caea);

	/**
	 * Consultar CAEA emitidos.
	 */
	public FECAEAGet fecaeaConsultar(int periodo, short orden);

	/**
	 * Recupera la cotizacion de la moneda consultada y su fecha
	 */
	public Cotizacion feParamGetCotizacion(String monId);

	/**
	 * Recupera el listado de los diferente tributos que pueden ser utilizados
	 * en el servicio de autorizacion
	 * 
	 * @return returns prueba.ws.wsfe.FETributoResponse
	 */
	public List<TributoTipo> feParamGetTiposTributos();

	/**
	 * Recupera el listado de monedas utilizables en servicio de autorizacion
	 */
	public List<Moneda> feParamGetTiposMonedas();

	/**
	 * Recupera el listado de Tipos de Iva utilizables en servicio de
	 * autorizacion.
	 */
	public List<IvaTipo> feParamGetTiposIva();

	/**
	 * Recupera el listado de identificadores para los campos Opcionales
	 * 
	 * @return returns prueba.ws.wsfe.OpcionalTipoResponse
	 */
	public List<OpcionalTipo> feParamGetTiposOpcional();

	/**
	 * Recupera el listado de identificadores para el campo Concepto.
	 */
	public List<ConceptoTipo> feParamGetTiposConcepto();

	/**
	 * Recupera el listado de puntos de venta registrados y su estado
	 */
	public List<PtoVenta> feParamGetPtosVenta();

	/**
	 * Recupera el listado de Tipos de Comprobantes utilizables en servicio de
	 * autorizacion.
	 */
	public List<CbteTipo> feParamGetTiposCbte();

	/**
	 * Recupera el listado de Tipos de Documentos utilizables en servicio de
	 * autorizacion.
	 */
	public List<DocTipo> feParamGetTiposDoc();

	/**
	 * Recupera el listado de los diferente paises que pueden ser utilizados en
	 * el servicio de autorizacion
	 */
	public List<PaisTipo> feParamGetTiposPaises();
}
