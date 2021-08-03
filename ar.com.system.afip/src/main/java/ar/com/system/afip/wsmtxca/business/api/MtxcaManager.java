package ar.com.system.afip.wsmtxca.business.api;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ar.com.system.afip.wsmtxca.service.api.AutorizarComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.CAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.CodigoDescripcionStringType;
import ar.com.system.afip.wsmtxca.service.api.CodigoDescripcionType;
import ar.com.system.afip.wsmtxca.service.api.ComprobanteType;
import ar.com.system.afip.wsmtxca.service.api.ConsultarComprobanteResponseType;
import ar.com.system.afip.wsmtxca.service.api.DummyResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoPtoVtaResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarComprobanteCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.PuntoVentaType;

public interface MtxcaManager {

	DummyResponseType dummy();

	/**
	 * Autorizar un Comprobante CAE.
	 * @param comprobanteCAERequest
	 * @return
	 */
	AutorizarComprobanteResponseType autorizarComprobante(ComprobanteType comprobanteCAERequest);

	/**
	 * Solicitar CAEA.
	 */
	CAEAResponseType solicitarCAEA(int periodo, short orden);

	/**
	 * Informar un Comprobante CAEA.
	 * Permite informar para cada CAEA otorgado, la totalidad de los comprobantes
     * emitidos y asociados a cada CAEA.
	 */
	InformarComprobanteCAEAResponseType informarComprobanteCAEA(ComprobanteType parameters);

	/**
	 * Consultar el ultimo comprobante autorizado.
	 * Permite consultar el ultimo numero de comprobante autorizado para un determinado punto de venta y tipo de comprobante,
	 * tanto para comprobantes con codigo de autorizacion CAE como CAEA.
	 */
	int consultarUltimoComprobanteAutorizado(short ptoVta, short cbteTipo);

	/**
	 * Consultar un comprobante autorizado.
	 * Permite consultar los datos de un comprobante previamente autorizado, ya sea del tipo Codigo de Autorizacion CAE o CAEA.
	 */
	ConsultarComprobanteResponseType consultarComprobante(short codigoTipoComprobante, short numeroPuntoVenta, int numeroComprobante);

	/**
	 * Consultar Tipos de Comprobantes.
	 * Permite consultar los tipos de comprobantes habilitados en este WS.
	 */
	List<CodigoDescripcionType> consultarTiposComprobante();

	/**
	 * Consultar Tipos de Documentos.
	 * Retorna el universo de tipos de documentos de identidad, aceptados en el presente WS.
	 */
	List<CodigoDescripcionType> consultarTiposDocumento();

	/**
	 * Consultar Alicuotas de IVA.
	 * Proporciona las diferentes Alicuotas de IVA disponibles en este WS.
	 */
	List<CodigoDescripcionType> consultarAlicuotasIVA();

	/**
	 * Consultar Condiciones de IVA.
	 * Permite consultar las Condiciones de IVA que se pueden asociar a un item, tales como No Gravado, Exento, etc..
	 */
	List<CodigoDescripcionType> consultarCondicionesIVA();

	/**
	 * Consultar Monedas.
	 * Retorna el universo de Monedas disponibles en el presente WS, indicando codigo y descripcion de cada una.
	 */
	List<CodigoDescripcionStringType> consultarMonedas();

	/**
	 * Consultar Cotizacion de Moneda.
	 * Permite consultar la ultima cotizacion disponible para un determinado codigo de Moneda. Pudiendose dar las siguientes situaciones:
	 * <ul>
	 * <li>a) De existir la cotizacion devolvera el valor correspondiente.
     * <li>b) Si no existe cotizacion para la moneda indicada no retornara valor alguno.
     * <li>c) Si el codigo de moneda enviado es invalido devolvera un error.
     * </ul>
	 */
	BigDecimal consultarCotizacionMoneda(String codigoMoneda);

	/**
	 * Consultar Unidades de Medida.
	 * Permite consultar las diferentes unidades de medida posibles de uso en este WS.
	 */
	List<CodigoDescripcionType> consultarUnidadesMedida();

	/**
	 * Consultar Puntos de Ventas.
	 * Permite consultar los puntos de venta para ambos tipos de Codigo de Autorizacion (CAE y CAEA) gestionados por la CUIT emisora.
	 */
	List<PuntoVentaType> consultarPuntosVenta();

	/**
	 * Consultar Puntos de Ventas CAE.
	 * Permite consultar los puntos de venta habilitados para generar comprobantes con tipo de Codigo de Autorizacion CAE
	 */
	List<PuntoVentaType> consultarPuntosVentaCAE();

	/**
	 * Consultar Puntos de Ventas CAEA.
	 * Permite consultar los puntos de venta habilitados para generar comprobantes con tipo de Codigo de Autorizacion CAEA.
	 */
	List<PuntoVentaType> consultarPuntosVentaCAEA();

	/**
	 * Informar un CAEA no utilizado.
	 * Permite informar un CAEA que no fue utilizado, es decir que ningun comprobante fue emitido con ese CAEA.
	 */
	InformarCAEANoUtilizadoResponseType informarCAEANoUtilizado(long caea);

	/**
	 * Consultar Tipos de Tributo.
	 * Devuelve los posibles codigos de tributos que puede contener un comprobante y su descripcion.
	 */
	List<CodigoDescripcionType> consultarTiposTributo();

	/**
	 * Informar un CAEA no utilizado para un Punto de Venta.
	 * Permite informar un CAEA que no fue utilizado para un Punto de Venta, es decir que ningun comprobante fue emitido con ese CAEA y ese Punto de Venta.
	 */
	InformarCAEANoUtilizadoPtoVtaResponseType informarCAEANoUtilizadoPtoVta(long caea, short numeroPuntoVenta);

	/**
	 * Consultar un CAEA previamente otorgado.
	 * Permite consultar la informacion correspondiente a un CAEA previamente otorgado.
	 */
	CAEAResponseType consultarCAEA(long caea);

	/**
	 * Consultar Puntos de Venta aun no informados para un CAEA.
	 * Permite consultar que puntos de venta aun no fueron informados para un CAEA determinado.
	 */
	List<PuntoVentaType> consultarPtosVtaCAEANoInformados(long caea);

	/**
	 * Consultar CAEAs en un rango de fechas.
	 * Permite consultar la informacion correspondiente a CAEAs que hayan tenido vigencia en algun momento dentro de un rango de fechas determinado.
	 */
	List<CAEAResponseType> consultarCAEAEntreFechas(Date fechaDesde, Date fechaHasta);

}
