package ar.com.system.afip.wsmtxca.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.inject.Inject;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.service.api.AuthRequestType;
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
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoPtoVtaRequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoPtoVtaResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoRequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarCAEANoUtilizadoResponseType;
import ar.com.system.afip.wsmtxca.service.api.InformarComprobanteCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.InformarComprobanteCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.MTXCAServicePortType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEARequestType;
import ar.com.system.afip.wsmtxca.service.api.SolicitarCAEAResponseType;
import ar.com.system.afip.wsmtxca.service.api.SolicitudCAEAType;

public class MtxcaManagerImpl implements MtxcaManager {
	private final WsaaTemplate wsaaTemplate;
	private final MTXCAServicePortType service;
	private final String cuit;

	@Inject
	public MtxcaManagerImpl(WsaaTemplate.Factory wsaaTemplateFacory, MTXCAServicePortType service, WsaaDao wsaaDao) {
		this.wsaaTemplate = checkNotNull(wsaaTemplateFacory).create(Service.WSFE);
		this.service = checkNotNull(service);
		this.cuit = checkNotNull(wsaaDao).loadActiveCompanyInfo().getCuit();
	}

	@Override
	public DummyResponseType dummy() {
		return wsaaTemplate.runAuhtenticated(credentials -> exception(() -> service.dummy()));
	}

	@Override
	public AutorizarComprobanteResponseType autorizarComprobante(ComprobanteType comprobanteCAERequest) {
		return wsaaTemplate.runAuhtenticated(
				credentials -> exception(() -> service.autorizarComprobante(
						new AutorizarComprobanteRequestType(
								AuthRequestType.fromCredentials(credentials, cuit), comprobanteCAERequest)
						))
				);
	}

	@Override
	public SolicitarCAEAResponseType solicitarCAEA(SolicitudCAEAType parameters) {
		return wsaaTemplate.runAuhtenticated(
				credentials -> exception(
						() -> service.solicitarCAEA(
								new SolicitarCAEARequestType(
										AuthRequestType.fromCredentials(credentials, cuit), parameters))
						)
				);
	}

	@Override
	public ConsultarUltimoComprobanteAutorizadoResponseType consultarUltimoComprobanteAutorizado(
			ConsultaUltimoComprobanteAutorizadoRequestType parameters) {
		return wsaaTemplate.runAuhtenticated(
				credentials -> exception(
						() -> service.consultarUltimoComprobanteAutorizado(
								new ConsultarUltimoComprobanteAutorizadoRequestType(
										AuthRequestType.fromCredentials(credentials, cuit), parameters))
						)
				);
	}
	
	@Override
	public InformarComprobanteCAEAResponseType informarComprobanteCAEA(ComprobanteType parameters) {
		return wsaaTemplate.runAuhtenticated(
				credentials -> exception(
						() -> service.informarComprobanteCAEA(
								new InformarComprobanteCAEARequestType(
										AuthRequestType.fromCredentials(credentials, cuit), parameters))
						)
				);
	}

//	@Override
//	public ConsultarComprobanteResponseType consultarComprobante(ConsultarComprobanteRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarTiposComprobanteResponseType consultarTiposComprobante(
//			ConsultarTiposComprobanteRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarTiposDocumentoResponseType consultarTiposDocumento(ConsultarTiposDocumentoRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarAlicuotasIVAResponseType consultarAlicuotasIVA(ConsultarAlicuotasIVARequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarCondicionesIVAResponseType consultarCondicionesIVA(ConsultarCondicionesIVARequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarMonedasResponseType consultarMonedas(ConsultarMonedasRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarCotizacionMonedaResponseType consultarCotizacionMoneda(
//			ConsultarCotizacionMonedaRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarUnidadesMedidaResponseType consultarUnidadesMedida(ConsultarUnidadesMedidaRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarPuntosVentaResponseType consultarPuntosVenta(ConsultarPuntosVentaRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarPuntosVentaResponseType consultarPuntosVentaCAE(ConsultarPuntosVentaCAERequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarPuntosVentaResponseType consultarPuntosVentaCAEA(ConsultarPuntosVentaCAEARequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public InformarCAEANoUtilizadoResponseType informarCAEANoUtilizado(InformarCAEANoUtilizadoRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarTiposTributoResponseType consultarTiposTributo(ConsultarTiposTributoRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public InformarCAEANoUtilizadoPtoVtaResponseType informarCAEANoUtilizadoPtoVta(
//			InformarCAEANoUtilizadoPtoVtaRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarCAEAResponseType consultarCAEA(ConsultarCAEARequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarPtosVtaCAEANoInformadosResponseType consultarPtosVtaCAEANoInformados(
//			ConsultarPtosVtaCAEANoInformadosRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ConsultarCAEAEntreFechasResponseType consultarCAEAEntreFechas(
//			ConsultarCAEAEntreFechasRequestType parameters) {
//		// TODO Auto-generated method stub
//		return null;
//	}


	private static <T> T exception(ExceptionCallback<T> callback) {
		try {
			return callback.run();
		} catch (ExceptionFaultMsg e) {
			throw new MtxcaException(e);
		}
	}

	private interface ExceptionCallback<T> {
		T run() throws ExceptionFaultMsg;
	}


}
