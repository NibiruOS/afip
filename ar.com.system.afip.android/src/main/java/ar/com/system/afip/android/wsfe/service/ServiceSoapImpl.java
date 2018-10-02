package ar.com.system.afip.android.wsfe.service;

import ar.com.system.afip.wsfe.service.api.*;

import javax.inject.Inject;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkNotNull;

public class ServiceSoapImpl implements ServiceSoap {
    private final RetrofitServiceSoap service;

    @Inject
    public ServiceSoapImpl(RetrofitServiceSoap service) {
        this.service = checkNotNull(service);
    }

    @Override
    public FECAEResponse fecaeSolicitar(FEAuthRequest auth,
                                        FECAERequest feCAEReq) {
        checkNotNull(auth);
        checkNotNull(feCAEReq);
        try {
            return service.fecaeSolicitar(new FECAESolicitar(auth,
                    feCAEReq))
                    .execute()
                    .body()
                    .getFECAESolicitarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FERegXReqResponse feCompTotXRequest(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feCompTotXRequest(new FECompTotXRequest(auth))
                    .execute()
                    .body()
                    .getFECompTotXRequestResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DummyResponse feDummy() {
        try {
            return service.feDummy(new FEDummy())
                    .execute()
                    .body()
                    .getFEDummyResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FERecuperaLastCbteResponse feCompUltimoAutorizado(FEAuthRequest auth,
                                                             int ptoVta,
                                                             int cbteTipo) {
        checkNotNull(auth);
        try {
            return service.feCompUltimoAutorizado(new FECompUltimoAutorizado(auth,
                    ptoVta,
                    cbteTipo))
                    .execute()
                    .body()
                    .getFECompUltimoAutorizadoResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECompConsultaResponse feCompConsultar(FEAuthRequest auth,
                                                  FECompConsultaReq feCompConsReq) {
        checkNotNull(auth);
        checkNotNull(feCompConsReq);
        try {
            return service.feCompConsultar(new FECompConsultar(auth,
                    feCompConsReq))
                    .execute()
                    .body()
                    .getFECompConsultarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECAEAResponse fecaeaRegInformativo(FEAuthRequest auth,
                                               FECAEARequest feCAEARegInfReq) {
        checkNotNull(auth);
        checkNotNull(feCAEARegInfReq);
        try {
            return service.fecaeaRegInformativo(new FECAEARegInformativo(auth,
                    feCAEARegInfReq))
                    .execute()
                    .body()
                    .getFECAEARegInformativoResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECAEAGetResponse fecaeaSolicitar(FEAuthRequest auth,
                                             int periodo,
                                             short orden) {
        checkNotNull(auth);
        try {
            return service.fecaeaSolicitar(new FECAEASolicitar(auth,
                    periodo,
                    orden))
                    .execute()
                    .body()
                    .getFECAEASolicitarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECAEASinMovConsResponse fecaeaSinMovimientoConsultar(FEAuthRequest auth,
                                                                 String caea,
                                                                 int ptoVta) {
        checkNotNull(auth);
        checkNotNull(caea);
        try {
            return service.fecaeaSinMovimientoConsultar(new FECAEASinMovimientoConsultar(auth,
                    caea,
                    ptoVta))
                    .execute()
                    .body()
                    .getFECAEASinMovimientoConsultarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECAEASinMovResponse fecaeaSinMovimientoInformar(FEAuthRequest auth,
                                                            int ptoVta,
                                                            String caea) {
        checkNotNull(auth);
        checkNotNull(caea);
        try {
            return service.fecaeaSinMovimientoInformar(new FECAEASinMovimientoInformar(auth,
                    ptoVta,
                    caea))
                    .execute()
                    .body()
                    .getFECAEASinMovimientoInformarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECAEAGetResponse fecaeaConsultar(FEAuthRequest auth,
                                             int periodo,
                                             short orden) {
        checkNotNull(auth);
        try {
            return service.fecaeaConsultar(new FECAEAConsultar(auth,
                    periodo,
                    orden))
                    .execute()
                    .body()
                    .getFECAEAConsultarResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FECotizacionResponse feParamGetCotizacion(FEAuthRequest auth,
                                                     String monId) {
        checkNotNull(auth);
        checkNotNull(monId);
        try {
            return service.feParamGetCotizacion(new FEParamGetCotizacion(auth,
                    monId))
                    .execute()
                    .body()
                    .getFEParamGetCotizacionResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FETributoResponse feParamGetTiposTributos(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposTributos(new FEParamGetTiposTributos(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposTributosResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MonedaResponse feParamGetTiposMonedas(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposMonedas(new FEParamGetTiposMonedas(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposMonedasResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IvaTipoResponse feParamGetTiposIva(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposIva(new FEParamGetTiposIva(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposIvaResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OpcionalTipoResponse feParamGetTiposOpcional(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposOpcional(new FEParamGetTiposOpcional(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposOpcionalResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConceptoTipoResponse feParamGetTiposConcepto(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposConcepto(new FEParamGetTiposConcepto(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposConceptoResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FEPtoVentaResponse feParamGetPtosVenta(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetPtosVenta(new FEParamGetPtosVenta(auth))
                    .execute()
                    .body()
                    .getFEParamGetPtosVentaResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CbteTipoResponse feParamGetTiposCbte(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposCbte(new FEParamGetTiposCbte(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposCbteResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DocTipoResponse feParamGetTiposDoc(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposDoc(new FEParamGetTiposDoc(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposDocResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FEPaisResponse feParamGetTiposPaises(FEAuthRequest auth) {
        checkNotNull(auth);
        try {
            return service.feParamGetTiposPaises(new FEParamGetTiposPaises(auth))
                    .execute()
                    .body()
                    .getFEParamGetTiposPaisesResult();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
