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
	FECAEResponse fecaeSolicitar(FECAERequest feCAEReq);

	/**
	 * Retorna la cantidad maxima de registros que puede tener una invocacion al
	 * metodo FECAESolicitar / FECAEARegInformativo
	 */
	int feCompTotXRequest();

	/**
	 * Retorna el ultimo comprobante autorizado para el tipo de comprobante /
	 * cuit / punto de venta ingresado / Tipo de Emision
	 */
	int feCompUltimoAutorizado(int ptoVta, int cbteTipo);

	/**
	 * Consulta Comprobante emitido y su codigo.
	 */
	FECompConsResponse feCompConsultar(FECompConsultaReq feCompConsReq);

	/**
	 * Rendicion de comprobantes asociados a un CAEA.
	 */
	FECAEAResponse fecaeaRegInformativo(FECAEARequest feCAEARegInfReq);

	/**
	 * Solicitud de Codigo de Autorizacion Electronico Anticipado (CAEA)
	 */
	FECAEAGet fecaeaSolicitar(int periodo, short orden);

	/**
	 * Consulta CAEA informado como sin movimientos.
	 */
	List<FECAEASinMov> fecaeaSinMovimientoConsultar(String caea, int ptoVta);

	/**
	 * Informa CAEA sin movimientos.
	 */
	FECAEASinMovResponse fecaeaSinMovimientoInformar(int ptoVta, String caea);

	/**
	 * Consultar CAEA emitidos.
	 */
	FECAEAGet fecaeaConsultar(int periodo, short orden);

	/**
	 * Recupera la cotizacion de la moneda consultada y su fecha
	 */
	Cotizacion feParamGetCotizacion(String monId);

	/**
	 * Recupera el listado de los diferente tributos que pueden ser utilizados
	 * en el servicio de autorizacion
	 * 
	 * @return returns prueba.ws.wsfe.FETributoResponse
	 */
	List<TributoTipo> feParamGetTiposTributos();

	/**
	 * Recupera el listado de monedas utilizables en servicio de autorizacion
	 */
	List<Moneda> feParamGetTiposMonedas();

	/**
	 * Recupera el listado de Tipos de Iva utilizables en servicio de
	 * autorizacion.
	 */
	List<IvaTipo> feParamGetTiposIva();

	/**
	 * Recupera el listado de identificadores para los campos Opcionales
	 * 
	 * @return returns prueba.ws.wsfe.OpcionalTipoResponse
	 */
	List<OpcionalTipo> feParamGetTiposOpcional();

	/**
	 * Recupera el listado de identificadores para el campo Concepto.
	 */
	List<ConceptoTipo> feParamGetTiposConcepto();

	/**
	 * Recupera el listado de puntos de venta registrados y su estado
	 */
	List<PtoVenta> feParamGetPtosVenta();

	/**
	 * Recupera el listado de Tipos de Comprobantes utilizables en servicio de
	 * autorizacion.
	 */
	List<CbteTipo> feParamGetTiposCbte();

	/**
	 * Recupera el listado de Tipos de Documentos utilizables en servicio de
	 * autorizacion.
	 */
	List<DocTipo> feParamGetTiposDoc();

	/**
	 * Recupera el listado de los diferente paises que pueden ser utilizados en
	 * el servicio de autorizacion
	 */
	List<PaisTipo> feParamGetTiposPaises();
}
