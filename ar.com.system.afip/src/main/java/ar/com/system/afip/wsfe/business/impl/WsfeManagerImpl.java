package ar.com.system.afip.wsfe.business.impl;

import ar.com.system.afip.common.service.ExceptionConverter;
import ar.com.system.afip.wsaa.business.api.CredentialsException;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.service.api.*;
import com.google.common.collect.Lists;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

import static com.google.common.base.Preconditions.checkNotNull;

public class WsfeManagerImpl implements WsfeManager {
    private static final int CREDENTIALS_ERROR_CODE = 600;
    private final WsaaTemplate wsaaTemplate;
    private final ServiceSoap serviceSoap;
    private final String cuit;
    private final ExceptionConverter exceptionConverter;

    @Inject
    public WsfeManagerImpl(@Nonnull WsaaTemplate.Factory wsaaTemplateFacory,
                           @Nonnull ServiceSoap serviceSoap,
                           @Nonnull WsaaDao wsaaDao,
                           @Nonnull ExceptionConverter exceptionConverter) {
        this.wsaaTemplate = checkNotNull(wsaaTemplateFacory)
                .create(Service.WSFE);
        this.serviceSoap = checkNotNull(serviceSoap);
        this.cuit = checkNotNull(wsaaDao)
                .loadActiveCompanyInfo()
                .getCuit();
        this.exceptionConverter = checkNotNull(exceptionConverter);
    }

    @Override
    public FECAEResponse fecaeSolicitar(final FECAERequest feCAEReq) {
        checkNotNull(feCAEReq);
        return wsaaTemplate.runAuhtenticated(credentials -> checkFecaErrors(() -> serviceSoap
                .fecaeSolicitar(FEAuthRequest
                        .fromCredentials(credentials, cuit), feCAEReq)));
    }

    @Override
    public int feCompTotXRequest() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feCompTotXRequest(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getRegXReq();
    }

    @Override
    public int feCompUltimoAutorizado(final int ptoVta, final int cbteTipo) {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feCompUltimoAutorizado(FEAuthRequest
                        .fromCredentials(credentials, cuit), ptoVta, cbteTipo)))
                .getCbteNro();
    }

    @Override
    public FECompConsResponse feCompConsultar(final FECompConsultaReq feCompConsReq) {
        checkNotNull(feCompConsReq);
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feCompConsultar(FEAuthRequest
                        .fromCredentials(credentials, cuit), feCompConsReq)))
                .getResultGet();
    }

    @Override
    public FECAEAResponse fecaeaRegInformativo(final FECAEARequest feCAEARegInfReq) {
        checkNotNull(feCAEARegInfReq);
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .fecaeaRegInformativo(FEAuthRequest
                                .fromCredentials(credentials, cuit),
                        feCAEARegInfReq)));
    }

    @Override
    public FECAEAGet fecaeaSolicitar(final int periodo, final short orden) {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .fecaeaSolicitar(FEAuthRequest
                        .fromCredentials(credentials, cuit), periodo, orden)))
                .getResultGet();
    }

    @Override
    public List<FECAEASinMov> fecaeaSinMovimientoConsultar(final String caea, final int ptoVta) {
        checkNotNull(caea);
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .fecaeaSinMovimientoConsultar(FEAuthRequest
                        .fromCredentials(credentials, cuit), caea, ptoVta)))
                .getResultGet()
                .getFECAEASinMov();
    }

    @Override
    public FECAEASinMovResponse fecaeaSinMovimientoInformar(final int ptoVta, final String caea) {
        checkNotNull(caea);
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .fecaeaSinMovimientoInformar(FEAuthRequest
                        .fromCredentials(credentials, cuit), ptoVta, caea)));
    }

    @Override
    public FECAEAGet fecaeaConsultar(final int periodo, final short orden) {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .fecaeaConsultar(FEAuthRequest
                        .fromCredentials(credentials, cuit), periodo, orden)))
                .getResultGet();
    }

    @Override
    public Cotizacion feParamGetCotizacion(final String monId) {
        checkNotNull(monId);
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetCotizacion(FEAuthRequest
                        .fromCredentials(credentials, cuit), monId)))
                .getResultGet();
    }

    @Override
    public List<TributoTipo> feParamGetTiposTributos() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposTributos(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getTributoTipo();
    }

    @Override
    public List<Moneda> feParamGetTiposMonedas() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposMonedas(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getMoneda();
    }

    @Override
    public List<IvaTipo> feParamGetTiposIva() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposIva(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getIvaTipo();
    }

    @Override
    public List<OpcionalTipo> feParamGetTiposOpcional() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposOpcional(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getOpcionalTipo();
    }

    @Override
    public List<ConceptoTipo> feParamGetTiposConcepto() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposConcepto(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getConceptoTipo();
    }

    @Override
    public List<PtoVenta> feParamGetPtosVenta() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetPtosVenta(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getPtoVenta();
    }

    @Override
    public List<CbteTipo> feParamGetTiposCbte() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposCbte(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getCbteTipo();
    }

    @Override
    public List<DocTipo> feParamGetTiposDoc() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposDoc(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getDocTipo();
    }

    @Override
    public List<PaisTipo> feParamGetTiposPaises() {
        return wsaaTemplate.runAuhtenticated(credentials -> checkErrors(() -> serviceSoap
                .feParamGetTiposPaises(FEAuthRequest
                        .fromCredentials(credentials, cuit))))
                .getResultGet()
                .getPaisTipo();
    }

    private <T extends HasErrors> T checkErrors(Callable<T> callback) {
        return checkResponseErrors(exception(callback));
    }

    private FECAEResponse checkFecaErrors(Callable<FECAEResponse> callback) {
        return checkFecaResponseErrors(exception(callback));
    }

    private <T> T exception(Callable<T> callback) {
        try {
            return exceptionConverter.convert(() -> callback.call());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static <T extends HasErrors> T checkResponseErrors(T response) {
        throwErrors(getErrors(response));
        return response;
    }

    private static FECAEResponse checkFecaResponseErrors(FECAEResponse response) {
        List<WsfeError> errors = Lists.newArrayList();
        Collection<? extends WsfeError> errs = getErrors(response);
        if (errs != null) {
            errors.addAll(errs);
        }
        Collection<? extends WsfeError> obs = getObservations(response);
        if (obs != null) {
            errors.addAll(obs);
        }
        throwErrors(errors);
        return response;
    }

    private static void throwErrors(Collection<? extends WsfeError> errors) {
        if (errors != null && !errors.isEmpty()) {
            for (WsfeError error : errors) {
                if (error.getCode() == CREDENTIALS_ERROR_CODE) {
                    throw new CredentialsException(Service.WSFE
                            + " - "
                            + error.getCode()
                            + " - "
                            + error.getMsg());
                }
            }
            throw new WsfeException(errors);
        }
    }

    private static Collection<? extends WsfeError> getErrors(HasErrors response) {
        if (response.getErrors() != null
                && response.getErrors().getErr() != null
                && !response.getErrors().getErr().isEmpty()) {
            return response.getErrors().getErr();
        } else {
            return null;
        }
    }

    private static Collection<? extends WsfeError> getObservations(
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

    private static Collection<? extends WsfeError> getObservations(
            FECAEDetResponse detResponse) {
        return detResponse.getObservaciones() != null ? detResponse
                .getObservaciones().getObsExclusive() : null;
    }
}
