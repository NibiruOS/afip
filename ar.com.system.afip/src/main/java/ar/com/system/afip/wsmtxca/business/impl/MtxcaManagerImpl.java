package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsmtxca.business.api.MtxcaManager;
import ar.com.system.afip.wsmtxca.service.api.*;
import com.google.common.collect.ImmutableList;

import javax.inject.Inject;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class MtxcaManagerImpl implements MtxcaManager {
    private final WsaaTemplate wsaaTemplate;
    private final MTXCAServicePortType service;
    private final String cuit;

    @Inject
    public MtxcaManagerImpl(WsaaTemplate.Factory wsaaTemplateFacory,
                            MTXCAServicePortType service,
                            WsaaDao wsaaDao) {
        this.wsaaTemplate = checkNotNull(wsaaTemplateFacory).create(Service.WSMTXCA);
        this.service = checkNotNull(service);
        this.cuit = checkNotNull(wsaaDao).loadActiveCompanyInfo().getCuit();
    }

    @Override
    public DummyResponseType dummy() {
        return wsaaTemplate.runAuhtenticated(credentials -> exception(() -> service.dummy()));
    }

    @Override
    public ComprobanteCAEResponseType autorizarComprobante(ComprobanteType comprobanteCAERequest) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(() -> service.autorizarComprobante(
                        new AutorizarComprobanteRequestType(
                                AuthRequestType.fromCredentials(credentials, cuit), comprobanteCAERequest)
                ))
        ).getComprobanteResponse();
    }

    @Override
    public CAEAResponseType solicitarCAEA(int periodo, short orden) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.solicitarCAEA(
                                new SolicitarCAEARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), new SolicitudCAEAType(periodo, orden)))
                )
        ).getCAEAResponse();
    }

    @Override
    public int consultarUltimoComprobanteAutorizado(short ptoVta, short cbteTipo) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarUltimoComprobanteAutorizado(
                                new ConsultarUltimoComprobanteAutorizadoRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit),
                                        new ConsultaUltimoComprobanteAutorizadoRequestType(cbteTipo, ptoVta)))
                )
        ).getNumeroComprobante();
    }

    @Override
    public InformarComprobanteCAEAResponseType informarComprobanteCAEA(ComprobanteType parameters) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.informarComprobanteCAEA(
                                new InformarComprobanteCAEARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), parameters))
                )
        );
    }

    @Override
    public ConsultarComprobanteResponseType consultarComprobante(short codigoTipoComprobante, short numeroPuntoVenta, int numeroComprobante) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarComprobante(
                                new ConsultarComprobanteRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), new ConsultaComprobanteRequestType(codigoTipoComprobante, numeroPuntoVenta, numeroComprobante)))
                )
        );
    }

    @Override
    public List<CodigoDescripcionType> consultarTiposComprobante() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarTiposComprobante(
                                new ConsultarTiposComprobanteRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayTiposComprobante().getCodigoDescripcion();
    }

    @Override
    public List<CodigoDescripcionType> consultarTiposDocumento() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarTiposDocumento(
                                new ConsultarTiposDocumentoRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayTiposDocumento().getCodigoDescripcion();
    }

    @Override
    public List<CodigoDescripcionType> consultarAlicuotasIVA() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarAlicuotasIVA(
                                new ConsultarAlicuotasIVARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayAlicuotasIVA().getCodigoDescripcion();
    }

    @Override
    public List<CodigoDescripcionType> consultarCondicionesIVA() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarCondicionesIVA(
                                new ConsultarCondicionesIVARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayCondicionesIVA().getCodigoDescripcion();
    }

    @Override
    public List<CodigoDescripcionStringType> consultarMonedas() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarMonedas(
                                new ConsultarMonedasRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayMonedas().getCodigoDescripcion();
    }

    @Override
    public BigDecimal consultarCotizacionMoneda(String codigoMoneda) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarCotizacionMoneda(
                                new ConsultarCotizacionMonedaRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), codigoMoneda))
                )
        ).getCotizacionMoneda();
    }

    @Override
    public List<CodigoDescripcionType> consultarUnidadesMedida() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarUnidadesMedida(
                                new ConsultarUnidadesMedidaRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayUnidadesMedida().getCodigoDescripcion();
    }

    @Override
    public List<PuntoVentaType> consultarPuntosVenta() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarPuntosVenta(
                                new ConsultarPuntosVentaRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayPuntosVenta().getPuntoVenta();
    }

    @Override
    public List<PuntoVentaType> consultarPuntosVentaCAE() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarPuntosVentaCAE(
                                new ConsultarPuntosVentaCAERequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayPuntosVenta().getPuntoVenta();
    }

    @Override
    public List<PuntoVentaType> consultarPuntosVentaCAEA() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarPuntosVentaCAEA(
                                new ConsultarPuntosVentaCAEARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayPuntosVenta().getPuntoVenta();
    }

    @Override
    public ResultadoSimpleType informarCAEANoUtilizado(long caea) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.informarCAEANoUtilizado(
                                new InformarCAEANoUtilizadoRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), caea))
                )
        ).getResultado();
    }

    @Override
    public List<CodigoDescripcionType> consultarTiposTributo() {
        return wsaaTemplate.runAuhtenticated(
                credentials -> exception(
                        () -> service.consultarTiposTributo(
                                new ConsultarTiposTributoRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit)))
                )
        ).getArrayTiposTributo().getCodigoDescripcion();
    }

    @Override
    public ResultadoSimpleType informarCAEANoUtilizadoPtoVta(long caea, short numeroPuntoVenta) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.informarCAEANoUtilizadoPtoVta(
                                new InformarCAEANoUtilizadoPtoVtaRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), caea, numeroPuntoVenta))
                )
        ).getResultado();
    }

    @Override
    public CAEAResponseType consultarCAEA(long caea) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarCAEA(
                                new ConsultarCAEARequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), caea))
                )
        ).getCAEAResponse();
    }

    @Override
    public List<PuntoVentaType> consultarPtosVtaCAEANoInformados(long caea) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarPtosVtaCAEANoInformados(
                                new ConsultarPtosVtaCAEANoInformadosRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), caea))
                )
        ).getArrayPuntosVenta().getPuntoVenta();
    }

    @Override
    public List<CAEAResponseType> consultarCAEAEntreFechas(Date fechaDesde, Date fechaHasta) {
        return wsaaTemplate.runAuhtenticated(
                credentials -> checkErrors(
                        () -> service.consultarCAEAEntreFechas(
                                new ConsultarCAEAEntreFechasRequestType(
                                        AuthRequestType.fromCredentials(credentials, cuit), fechaDesde, fechaHasta))
                )
        ).getArrayCAEAResponse().getCAEAResponse();
    }

    private static <T> T exception(ExceptionCallback<T> callback) {
        try {
            return callback.run();
        } catch (SOAPFaultException e) {
            throw new MtxcaResponseException(ImmutableList.of(new SOAPFaultAdapter(e.getFault())));
        } catch (ExceptionFaultMsg e) {
            throw new MtxcaException(e);
        }
    }

    private interface ExceptionCallback<T> {
        T run() throws ExceptionFaultMsg;
    }

    private static <T extends HasErrors> T checkErrors(ExceptionCallback<T> callback) {
        T response = exception(callback);
        Collection<? extends WsmtxcaError> errors = getErrors(response);
        if (errors != null) {
            throw new MtxcaResponseException(errors);
        }
        return response;
    }

    private static Collection<? extends WsmtxcaError> getErrors(HasErrors response) {
        if (response.getErrors() != null
                && response.getErrors().getCodigoDescripcion() != null
                && !response.getErrors().getCodigoDescripcion().isEmpty()) {
            return response.getErrors().getCodigoDescripcion();
        } else {
            return null;
        }
    }

    private static class SOAPFaultAdapter implements WsmtxcaError {
        private final SOAPFault fault;

        public SOAPFaultAdapter(SOAPFault fault) {
            this.fault = fault;
        }

        @Override
        public int getCode() {
            try {
                return Integer.parseInt(fault.getFaultCode());
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        @Override
        public String getMsg() {
            return fault.getFaultString();
        }

    }

}
