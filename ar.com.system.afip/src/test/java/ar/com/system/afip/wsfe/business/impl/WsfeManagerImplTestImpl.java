package ar.com.system.afip.wsfe.business.impl;

import ar.com.system.afip.util.Constants;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.service.api.*;

import java.util.Date;
import java.util.List;

import static ar.com.system.afip.wsfe.WsfeComponents.wsfeManager;
import static org.junit.Assert.*;

public class WsfeManagerImplTestImpl {
    private static final int PTO_VTA = 1;
    private static final int CBTE_TIPO_FACTURA_B = 6;
    private static final int DOC_TIPO_CUIT = 80;
    private static final int IVA_21 = 5;
    private static final String MON_PESOS = "PES";

    public static void testSolicitar() {
        WsfeManager wsfeManager = wsfeManager();

        // FECompUltimoAutorizado
        int nroComprobante = wsfeManager.feCompUltimoAutorizado(PTO_VTA,
                CBTE_TIPO_FACTURA_B) + 1;

        // Prueba de fecaeSolicitar
        FECAERequest feCAEReq = new FECAERequest();

        FECAECabRequest feCAECabRequest = new FECAECabRequest();
        feCAEReq.setFeCabReq(feCAECabRequest);
        feCAECabRequest.setCantReg(1);
        feCAECabRequest.setPtoVta(PTO_VTA);
        feCAECabRequest.setCbteTipo(CBTE_TIPO_FACTURA_B);

        ArrayOfFECAEDetRequest arrayOfFECAEDetRequest = new ArrayOfFECAEDetRequest();
        feCAEReq.setFeDetReq(arrayOfFECAEDetRequest);

        FECAEDetRequest feCAEDetRequest = new FECAEDetRequest();
        arrayOfFECAEDetRequest.getFECAEDetRequest().add(feCAEDetRequest);

        feCAEDetRequest.setConcepto(1);
        feCAEDetRequest.setDocTipo(DOC_TIPO_CUIT);
        feCAEDetRequest.setDocNro(30710969619l);
        feCAEDetRequest.setCbteDesde(nroComprobante);
        feCAEDetRequest.setCbteHasta(nroComprobante);
        feCAEDetRequest.setCbteFchDate(new Date());
        feCAEDetRequest.setImpTotal(121);
        feCAEDetRequest.setImpTotConc(0);
        feCAEDetRequest.setImpNeto(100);
        feCAEDetRequest.setImpOpEx(0);
        feCAEDetRequest.setImpIVA(21);
        feCAEDetRequest.setImpTrib(0);
        feCAEDetRequest.setMonId(MON_PESOS);
        feCAEDetRequest.setMonCotiz(1);

        ArrayOfAlicIva arrayOfAlicIva = new ArrayOfAlicIva();
        feCAEDetRequest.setIva(arrayOfAlicIva);
        AlicIva alicIva = new AlicIva();
        arrayOfAlicIva.getAlicIva().add(alicIva);
        alicIva.setId(IVA_21);
        alicIva.setBaseImp(100);
        alicIva.setImporte(21);

        FECAEResponse response = wsfeManager.fecaeSolicitar(feCAEReq);
        assertNull(response.getErrors());
        assertNull(response.getEvents());
        assertNotNull(response.getFeCabResp());
        assertNotNull(response.getFeDetResp());

        assertEquals(1, response.getFeCabResp().getCantReg());
        assertEquals(CBTE_TIPO_FACTURA_B, response.getFeCabResp().getCbteTipo());
        assertEquals(Long.parseLong(Constants.CUIT), response
                .getFeCabResp().getCuit());
        assertEquals(Reporceso.NO.getCode(), response.getFeCabResp()
                .getReproceso());
        assertEquals(Resultado.APROBADO.getCode(), response.getFeCabResp()
                .getResultado());

        assertEquals(1, response.getFeDetResp().getFECAEDetResponse().size());
        FECAEDetResponse detResponse = response.getFeDetResp()
                .getFECAEDetResponse().get(0);
        assertNotEquals("", detResponse.getCAE());
        assertEquals(Resultado.APROBADO.getCode(), detResponse.getResultado());
        assertNull(detResponse.getObservaciones());
    }

    public static void testParamGetTiposIva() {
        WsfeManager wsfeManager = wsfeManager();
        List<IvaTipo> ivaTipos = wsfeManager.feParamGetTiposIva();
        assertEquals(6, ivaTipos.size());
    }

    public static void testParamGetTiposCbte() {
        WsfeManager wsfeManager = wsfeManager();
        List<CbteTipo> cbteTipos = wsfeManager.feParamGetTiposCbte();
        assertEquals(27, cbteTipos.size());
    }

    public static void testParamGetTiposConcepto() {
        WsfeManager wsfeManager = wsfeManager();
        List<ConceptoTipo> conceptoTipos = wsfeManager.feParamGetTiposConcepto();
        assertEquals(3, conceptoTipos.size());
    }

    public static void testParamGetTiposDoc() {
        WsfeManager wsfeManager = wsfeManager();
        List<DocTipo> docTipos = wsfeManager.feParamGetTiposDoc();
        assertEquals(36, docTipos.size());
    }

    public static void testParamGetTiposMonedas() {
        WsfeManager wsfeManager = wsfeManager();
        List<Moneda> monedas = wsfeManager.feParamGetTiposMonedas();
        assertEquals(50, monedas.size());
    }

    public static void testParamGetTiposOpcional() {
        WsfeManager wsfeManager = wsfeManager();
        List<OpcionalTipo> opcionalTipos = wsfeManager.feParamGetTiposOpcional();
        assertEquals(19, opcionalTipos.size());
    }

    public static void testParamGetTiposPaises() {
        WsfeManager wsfeManager = wsfeManager();
        List<PaisTipo> paisTipos = wsfeManager.feParamGetTiposPaises();
        assertEquals(296, paisTipos.size());
    }

    public static void testParamGetTiposTributos() {
        WsfeManager wsfeManager = wsfeManager();
        List<TributoTipo> tributoTipos = wsfeManager.feParamGetTiposTributos();
        assertEquals(11, tributoTipos.size());
    }

    public static void testParamGetCotizacion() {
        WsfeManager wsfeManager = wsfeManager();
        try {
            wsfeManager.feParamGetCotizacion("PES");
            fail("WsfeException expected");
        } catch (WsfeException expected) {
        }
    }

    public static void testParamGetPtosVenta() {
        WsfeManager wsfeManager = wsfeManager();
        try {
            wsfeManager.feParamGetPtosVenta();
            fail("WsfeException expected");
        } catch (WsfeException expected) {
        }
    }
}
