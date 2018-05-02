package ar.com.system.afip.wsmtxca.business.api;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ar.com.system.afip.wsmtxca.service.api.AutorizarAjusteIVARequestType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarAjusteIVAResponseType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarComprobanteRequestType;
import ar.com.system.afip.wsmtxca.service.api.AutorizarComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.CAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.CodigoDescripcionStringType;
import ar.com.system.afip.wsmtxca.service.api.CodigoDescripcionType;
import ar.com.system.afip.wsmtxca.service.api.ComprobanteCAEResponseType;
import ar.com.system.afip.wsmtxca.service.api.ComprobanteType;
import ar.com.system.afip.wsmtxca.service.api.ConsultaComprobanteRequestType;
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
import ar.com.system.afip.wsmtxca.service.api.PuntoVentaType;
import ar.com.system.afip.wsmtxca.service.api.ResultadoSimpleType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.SolicitudCAEAType;

public interface MtxcaManager {

	DummyResponseType dummy();

	/**
	 * Autorizar un Comprobante CAE.
	 * @param comprobanteCAERequest
	 * @return
	 */
	ComprobanteCAEResponseType autorizarComprobante(ComprobanteType comprobanteCAERequest);

	/**
	 * Solicitar CAEA.
	 * @param parameters
	 * @return
	 */
	CAEAResponseType solicitarCAEA(int periodo, short orden);

	/**
	 * Informar un Comprobante CAEA.
	 * Permite informar para cada CAEA otorgado, la totalidad de los comprobantes
     * emitidos y asociados a cada CAEA.
	 * @param parameters
	 * @return
	 */
	InformarComprobanteCAEAResponseType informarComprobanteCAEA(ComprobanteType parameters);

	/**
	 * Consultar el último comprobante autorizado.
	 * Permite consultar el último número de comprobante autorizado para un determinado punto de venta y tipo de comprobante, 
	 * tanto para comprobantes con código de autorización CAE como CAEA.
	 * @param ptoVta
	 * @param cbteTipo
	 * @return
	 */
	int consultarUltimoComprobanteAutorizado(short ptoVta, short cbteTipo);

	/**
	 * Consultar un comprobante autorizado.
	 * Permite consultar los datos de un comprobante previamente autorizado, ya sea del tipo Código de Autorización CAE ó CAEA.
	 * @param consultaComprobanteRequest
	 * @return
	 */
	ConsultarComprobanteResponseType consultarComprobante(short codigoTipoComprobante, short numeroPuntoVenta, int numeroComprobante);

	/**
	 * Consultar Tipos de Comprobantes.
	 * Permite consultar los tipos de comprobantes habilitados en este WS.
	 * @return
	 */
	List<CodigoDescripcionType> consultarTiposComprobante();

	/**
	 * Consultar Tipos de Documentos.
	 * Retorna el universo de tipos de documentos de identidad, aceptados en el presente WS.
	 * @return
	 */
	List<CodigoDescripcionType> consultarTiposDocumento();

	/**
	 * Consultar Alícuotas de IVA. 
	 * Proporciona las diferentes Alícuotas de IVA disponibles en este WS.
	 * @return
	 */
	List<CodigoDescripcionType> consultarAlicuotasIVA();

	/**
	 * Consultar Condiciones de IVA.
	 * Permite consultar las Condiciones de IVA que se pueden asociar a un item, tales como No Gravado, Exento, etc..
	 * @return
	 */
	List<CodigoDescripcionType> consultarCondicionesIVA();

	/**
	 * Consultar Monedas.
	 * Retorna el universo de Monedas disponibles en el presente WS, indicando código y descripción de cada una.
	 * @return
	 */
	List<CodigoDescripcionStringType> consultarMonedas();

	/**
	 * Consultar Cotización de Moneda.
	 * Permite consultar la última cotización disponible para un determinado código de Moneda. Pudiéndose dar las siguientes situaciones:
	 * <ul>
	 * <li>a) De existir la cotización devolverá el valor correspondiente.
     * <li>b) Si no existe cotización para la moneda indicada no retornará valor alguno.
     * <li>c) Si el código de moneda enviado es inválido devolverá un error.
     * </ul>
	 * @param codigoMoneda
	 * @return
	 */
	BigDecimal consultarCotizacionMoneda(String codigoMoneda);

	/**
	 * Consultar Unidades de Medida.
	 * Permite consultar las diferentes unidades de medida posibles de uso en este WS.
	 * @return
	 */
	List<CodigoDescripcionType> consultarUnidadesMedida();

	/**
	 * Consultar Puntos de Ventas.
	 * Permite consultar los puntos de venta para ambos tipos de Código de Autorización (CAE y CAEA) gestionados por la CUIT emisora.
	 * @return
	 */
	List<PuntoVentaType> consultarPuntosVenta();

	/**
	 * Consultar Puntos de Ventas CAE.
	 * Permite consultar los puntos de venta habilitados para generar comprobantes con tipo de Código de Autorización CAE
	 * @return
	 */
	List<PuntoVentaType> consultarPuntosVentaCAE();

	/**
	 * Consultar Puntos de Ventas CAEA.
	 * Permite consultar los puntos de venta habilitados para generar comprobantes con tipo de Código de Autorización CAEA.
	 * @return
	 */
	List<PuntoVentaType> consultarPuntosVentaCAEA();

	/**
	 * Informar un CAEA no utilizado.
	 * Permite informar un CAEA que no fue utilizado, es decir que ningún comprobante fue emitido con ese CAEA.
	 * @param caea
	 * @return
	 */
	ResultadoSimpleType informarCAEANoUtilizado(long caea);

	/**
	 * Consultar Tipos de Tributo.
	 * Devuelve los posibles códigos de tributos que puede contener un comprobante y su descripción.
	 * @return
	 */
	List<CodigoDescripcionType> consultarTiposTributo();

	/**
	 * Informar un CAEA no utilizado para un Punto de Venta.
	 * Permite informar un CAEA que no fue utilizado para un Punto de Venta, es decir que ningún comprobante fue emitido con ese CAEA y ese Punto de Venta.
	 * @param caea
	 * @param numeroPuntoVenta
	 * @return
	 */
	ResultadoSimpleType informarCAEANoUtilizadoPtoVta(long caea, short numeroPuntoVenta);

	/**
	 * Consultar un CAEA previamente otorgado.
	 * Permite consultar la información correspondiente a un CAEA previamente otorgado.
	 * @param caea
	 * @return
	 */
	CAEAResponseType consultarCAEA(long caea);

	/**
	 * Consultar Puntos de Venta aún no informados para un CAEA.
	 * Permite consultar que puntos de venta aún no fueron informados para un CAEA determinado.
	 * @param caea
	 * @return
	 */
	List<PuntoVentaType> consultarPtosVtaCAEANoInformados(long caea);

	/**
	 * Consultar CAEAs en un rango de fechas.
	 * Permite consultar la información correspondiente a CAEAs que hayan tenido vigencia en algún momento dentro de un rango de fechas determinado.
	 * @param fechaDesde
	 * @param fechaHasta
	 * @return
	 */
	List<CAEAResponseType> consultarCAEAEntreFechas(Date fechaDesde, Date fechaHasta);

}
