package ar.com.system.afip.android.wsmtxca.service;

import ar.com.system.afip.wsmtxca.service.api.*;

import javax.inject.Inject;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkNotNull;

public class MtxcaServicePortTypeImpl
        implements MTXCAServicePortType {
    private final RetrofitMtxcaServicePortType service;

    @Inject
    public MtxcaServicePortTypeImpl(RetrofitMtxcaServicePortType service) {
        this.service = checkNotNull(service);
    }

    @Override
    public DummyResponseType dummy() {
        try {
            return service.dummy("")
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public AutorizarComprobanteResponseType autorizarComprobante(AutorizarComprobanteRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.autorizarComprobante(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public SolicitarCAEAResponseType solicitarCAEA(SolicitarCAEARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.solicitarCAEA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InformarComprobanteCAEAResponseType informarComprobanteCAEA(InformarComprobanteCAEARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.informarComprobanteCAEA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarUltimoComprobanteAutorizadoResponseType consultarUltimoComprobanteAutorizado(ConsultarUltimoComprobanteAutorizadoRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarUltimoComprobanteAutorizado(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarComprobanteResponseType consultarComprobante(ConsultarComprobanteRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarComprobante(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarTiposComprobanteResponseType consultarTiposComprobante(ConsultarTiposComprobanteRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarTiposComprobante(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarTiposDocumentoResponseType consultarTiposDocumento(ConsultarTiposDocumentoRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarTiposDocumento(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarAlicuotasIVAResponseType consultarAlicuotasIVA(ConsultarAlicuotasIVARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarAlicuotasIVA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarCondicionesIVAResponseType consultarCondicionesIVA(ConsultarCondicionesIVARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarCondicionesIVA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarMonedasResponseType consultarMonedas(ConsultarMonedasRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarMonedas(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarCotizacionMonedaResponseType consultarCotizacionMoneda(ConsultarCotizacionMonedaRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarCotizacionMoneda(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarUnidadesMedidaResponseType consultarUnidadesMedida(ConsultarUnidadesMedidaRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarUnidadesMedida(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarPuntosVentaResponseType consultarPuntosVenta(ConsultarPuntosVentaRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarPuntosVenta(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarPuntosVentaResponseType consultarPuntosVentaCAE(ConsultarPuntosVentaCAERequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarPuntosVentaCAE(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarPuntosVentaResponseType consultarPuntosVentaCAEA(ConsultarPuntosVentaCAEARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarPuntosVentaCAEA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InformarCAEANoUtilizadoResponseType informarCAEANoUtilizado(InformarCAEANoUtilizadoRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.informarCAEANoUtilizado(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarTiposTributoResponseType consultarTiposTributo(ConsultarTiposTributoRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarTiposTributo(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InformarCAEANoUtilizadoPtoVtaResponseType informarCAEANoUtilizadoPtoVta(InformarCAEANoUtilizadoPtoVtaRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.informarCAEANoUtilizadoPtoVta(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarCAEAResponseType consultarCAEA(ConsultarCAEARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarCAEA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarPtosVtaCAEANoInformadosResponseType consultarPtosVtaCAEANoInformados(ConsultarPtosVtaCAEANoInformadosRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarPtosVtaCAEANoInformados(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarCAEAEntreFechasResponseType consultarCAEAEntreFechas(ConsultarCAEAEntreFechasRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarCAEAEntreFechas(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public AutorizarAjusteIVAResponseType autorizarAjusteIVA(AutorizarAjusteIVARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.autorizarAjusteIVA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InformarAjusteIVACAEAResponseType informarAjusteIVACAEA(InformarAjusteIVACAEARequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.informarAjusteIVACAEA(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConsultarTiposDatosAdicionalesResponseType consultarTiposDatosAdicionales(ConsultarTiposDatosAdicionalesRequestType parameters) throws ExceptionFaultMsg {
        try {
            return service.consultarTiposDatosAdicionales(parameters)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
