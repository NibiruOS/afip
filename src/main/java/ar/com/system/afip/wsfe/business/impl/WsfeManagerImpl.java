package ar.com.system.afip.wsfe.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.service.api.CbteTipo;
import ar.com.system.afip.wsfe.service.api.CbteTipoResponse;
import ar.com.system.afip.wsfe.service.api.ConceptoTipo;
import ar.com.system.afip.wsfe.service.api.ConceptoTipoResponse;
import ar.com.system.afip.wsfe.service.api.Cotizacion;
import ar.com.system.afip.wsfe.service.api.DocTipo;
import ar.com.system.afip.wsfe.service.api.DocTipoResponse;
import ar.com.system.afip.wsfe.service.api.FEAuthRequest;
import ar.com.system.afip.wsfe.service.api.FECAEAGet;
import ar.com.system.afip.wsfe.service.api.FECAEAGetResponse;
import ar.com.system.afip.wsfe.service.api.FECAEARequest;
import ar.com.system.afip.wsfe.service.api.FECAEAResponse;
import ar.com.system.afip.wsfe.service.api.FECAEASinMov;
import ar.com.system.afip.wsfe.service.api.FECAEASinMovConsResponse;
import ar.com.system.afip.wsfe.service.api.FECAEASinMovResponse;
import ar.com.system.afip.wsfe.service.api.FECAEDetResponse;
import ar.com.system.afip.wsfe.service.api.FECAERequest;
import ar.com.system.afip.wsfe.service.api.FECAEResponse;
import ar.com.system.afip.wsfe.service.api.FECompConsResponse;
import ar.com.system.afip.wsfe.service.api.FECompConsultaReq;
import ar.com.system.afip.wsfe.service.api.FECompConsultaResponse;
import ar.com.system.afip.wsfe.service.api.FECotizacionResponse;
import ar.com.system.afip.wsfe.service.api.FEPaisResponse;
import ar.com.system.afip.wsfe.service.api.FEPtoVentaResponse;
import ar.com.system.afip.wsfe.service.api.FERecuperaLastCbteResponse;
import ar.com.system.afip.wsfe.service.api.FERegXReqResponse;
import ar.com.system.afip.wsfe.service.api.FETributoResponse;
import ar.com.system.afip.wsfe.service.api.HasErrors;
import ar.com.system.afip.wsfe.service.api.IvaTipo;
import ar.com.system.afip.wsfe.service.api.IvaTipoResponse;
import ar.com.system.afip.wsfe.service.api.Moneda;
import ar.com.system.afip.wsfe.service.api.MonedaResponse;
import ar.com.system.afip.wsfe.service.api.OpcionalTipo;
import ar.com.system.afip.wsfe.service.api.OpcionalTipoResponse;
import ar.com.system.afip.wsfe.service.api.PaisTipo;
import ar.com.system.afip.wsfe.service.api.PtoVenta;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import ar.com.system.afip.wsfe.service.api.TributoTipo;
import ar.com.system.afip.wsfe.service.api.WsfeError;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class WsfeManagerImpl implements WsfeManager {
	private final WsaaTemplate wsaaTemplate;
	private final ServiceSoap serviceSoap;
	private final String cuit;

	@Inject
	public WsfeManagerImpl(WsaaTemplate.Factory wsaaTemplateFacory,
			ServiceSoap serviceSoap,
			WsaaDao wsaaDao) {
		this.wsaaTemplate = checkNotNull(wsaaTemplateFacory).create(Service.WSFE);
		this.serviceSoap = checkNotNull(serviceSoap);
		this.cuit = checkNotNull(wsaaDao).loadActiveCompanyInfo().getCuit();
	}

	@Override
	public FECAEResponse fecaeSolicitar(final FECAERequest feCAEReq) {
		checkNotNull(feCAEReq);
		return checkFecaErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeSolicitar(FEAuthRequest.fromCredentials(credentials, cuit), feCAEReq)));
	}

	@Override
	public int feCompTotXRequest() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feCompTotXRequest(FEAuthRequest.fromCredentials(credentials, cuit)))).getRegXReq();
	}

	@Override
	public int feCompUltimoAutorizado(final int ptoVta, final int cbteTipo) {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feCompUltimoAutorizado(FEAuthRequest.fromCredentials(credentials, cuit), ptoVta,
                cbteTipo))).getCbteNro();
	}

	@Override
	public FECompConsResponse feCompConsultar(final FECompConsultaReq feCompConsReq) {
		checkNotNull(feCompConsReq);
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feCompConsultar(FEAuthRequest.fromCredentials(credentials, cuit), feCompConsReq))).getResultGet();
	}

	@Override
	public FECAEAResponse fecaeaRegInformativo(final FECAEARequest feCAEARegInfReq) {
		checkNotNull(feCAEARegInfReq);
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeaRegInformativo(FEAuthRequest.fromCredentials(credentials, cuit),
                feCAEARegInfReq)));
	}

	@Override
	public FECAEAGet fecaeaSolicitar(final int periodo, final short orden) {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeaSolicitar(FEAuthRequest.fromCredentials(credentials, cuit), periodo, orden))).getResultGet();
	}

	@Override
	public List<FECAEASinMov> fecaeaSinMovimientoConsultar(final String caea, final int ptoVta) {
		checkNotNull(caea);
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeaSinMovimientoConsultar(FEAuthRequest.fromCredentials(credentials, cuit), caea,
                ptoVta))).getResultGet().getFECAEASinMov();
	}

	@Override
	public FECAEASinMovResponse fecaeaSinMovimientoInformar(final int ptoVta, final String caea) {
		checkNotNull(caea);
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeaSinMovimientoInformar(FEAuthRequest.fromCredentials(credentials, cuit), ptoVta,
                caea)));
	}

	@Override
	public FECAEAGet fecaeaConsultar(final int periodo, final short orden) {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.fecaeaConsultar(FEAuthRequest.fromCredentials(credentials, cuit), periodo, orden))).getResultGet();
	}

	@Override
	public Cotizacion feParamGetCotizacion(final String monId) {
		checkNotNull(monId);
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetCotizacion(FEAuthRequest.fromCredentials(credentials, cuit), monId))).getResultGet();
	}

	@Override
	public List<TributoTipo> feParamGetTiposTributos() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposTributos(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getTributoTipo();
	}

	@Override
	public List<Moneda> feParamGetTiposMonedas() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposMonedas(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getMoneda();
	}

	@Override
	public List<IvaTipo> feParamGetTiposIva() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposIva(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getIvaTipo();
	}

	@Override
	public List<OpcionalTipo> feParamGetTiposOpcional() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposOpcional(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getOpcionalTipo();
	}

	@Override
	public List<ConceptoTipo> feParamGetTiposConcepto() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposConcepto(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getConceptoTipo();
	}

	@Override
	public List<PtoVenta> feParamGetPtosVenta() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetPtosVenta(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getPtoVenta();
	}

	@Override
	public List<CbteTipo> feParamGetTiposCbte() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposCbte(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getCbteTipo();
	}

	@Override
	public List<DocTipo> feParamGetTiposDoc() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposDoc(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getDocTipo();
	}

	@Override
	public List<PaisTipo> feParamGetTiposPaises() {
		return checkErrors(wsaaTemplate.runAuhtenticated(credentials -> serviceSoap.feParamGetTiposPaises(FEAuthRequest.fromCredentials(credentials, cuit)))).getResultGet().getPaisTipo();
	}

	private <T extends HasErrors> T checkErrors(T response) {
		Collection<? extends WsfeError> errors = getErrors(response);
		if (errors != null) {
			throw new WsfeException(errors);
		}
		return response;
	}

	private FECAEResponse checkFecaErrors(FECAEResponse response) {
		List<WsfeError> errors = Lists.newArrayList();
		Collection<? extends WsfeError> errs = getErrors(response);
		if (errs != null) {
			errors.addAll(errs);
		}
		Collection<? extends WsfeError> obs = getObservations(response);
		if (obs != null) {
			errors.addAll(obs);
		}
		if (!errors.isEmpty()) {
			throw new WsfeException(errors);
		}
		return response;
	}

	private Collection<? extends WsfeError> getErrors(HasErrors response) {
		if (response.getErrors() != null
				&& response.getErrors().getErr() != null
				&& !response.getErrors().getErr().isEmpty()) {
			return response.getErrors().getErr();
		} else {
			return null;
		}
	}

	private Collection<? extends WsfeError> getObservations(
			FECAEResponse response) {
		List<WsfeError> errors = Lists.newArrayList();
		for (FECAEDetResponse detResponse : response.getFeDetResp()
				.getFECAEDetResponse()) {
			Collection<? extends WsfeError> obs = getObservations(detResponse);
			if (obs != null) {
				errors.addAll(obs);
			}
		}
		return errors.isEmpty() ? null : errors;
	}

	private Collection<? extends WsfeError> getObservations(
			FECAEDetResponse detResponse) {
		return detResponse.getObservaciones() != null ? detResponse
				.getObservaciones().getObs() : null;
	}
}
