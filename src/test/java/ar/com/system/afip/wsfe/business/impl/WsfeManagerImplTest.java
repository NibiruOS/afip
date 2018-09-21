package ar.com.system.afip.wsfe.business.impl;

import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManagerTest;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsaa.business.impl.XmlPullParserProvider;
import ar.com.system.afip.wsaa.business.impl.XmlSerializerProvider;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.TaxCategory;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsaa.service.impl.RetrofitBuilderProvider;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.service.api.*;
import ar.com.system.afip.wsfe.service.impl.ServiceSoapProvider;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.WsdlParser;
import org.junit.Before;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParser;

import javax.inject.Provider;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class WsfeManagerImplTest {
    private static final int PTO_VTA = 1;
    private static final int CBTE_TIPO_FACTURA_B = 6;
    private static final int DOC_TIPO_CUIT = 80;
    private static final int IVA_21 = 5;
    private static final String MON_PESOS = "PES";
    private WsfeManager wsfeManager;

    @Before
    public void setup() {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        wsfeManager = new WsfeManagerImpl(
                new WsaaTemplateImpl.FactoryImpl(
                        BouncyCastleWsaaManagerTest.buildWsaaManager()),
                new ServiceSoapProvider(new HomoSetupDao(),
                        new ServiceFactory(
                                new WsdlParser(pullParserProvider),
                                new RetrofitBuilderProvider(new XmlSerializerProvider(),
                                        pullParserProvider)))
                        .get(),
                buildDao());
    }

    @Test
    public void testSolicitar() {
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
        feCAEDetRequest.setDocNro(20245922141l);
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
        assertEquals(Long.parseLong(BouncyCastleWsaaManagerTest.CUIT), response
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

    @Test
    public void testSolicitarEmptyParameters() {
        try {
            wsfeManager.fecaeSolicitar(new FECAERequest());
            fail("WsfeException expected");
        } catch (WsfeException expected) {
            assertTrue(expected.getErrors().iterator().hasNext());
            assertEquals(500, expected.getErrors().iterator().next().getCode());
            assertEquals(
                    "Error interno de aplicación: - Metodo FECAESolicitar - Object reference not set to an instance of an object.",
                    expected.getErrors().iterator().next().getMsg());
        }
    }

    @Test
    public void testParamGetTiposIva() {
        List<IvaTipo> ivaTipos = wsfeManager.feParamGetTiposIva();
        assertEquals(6, ivaTipos.size());
    }

    @Test
    public void testParamGetTiposCbte() {
        List<CbteTipo> cbteTipos = wsfeManager.feParamGetTiposCbte();
        assertEquals(27, cbteTipos.size());
    }

    private WsaaDao buildDao() {
        WsaaDao dao = new InMemoryWsaaDao();
        dao.saveCompanyInfo(new CompanyInfo(0,
                BouncyCastleWsaaManagerTest.COMPANY,
                true,
                BouncyCastleWsaaManagerTest.UNIT,
                BouncyCastleWsaaManagerTest.CUIT,
                BouncyCastleWsaaManagerTest.PUBLIC_KEY,
                BouncyCastleWsaaManagerTest.PRIVATE_KEY,
                BouncyCastleWsaaManagerTest.CERTIFICATE,
                "",
                new Date(),
                TaxCategory.MONOTRIBUTO,
                BouncyCastleWsaaManagerTest.ADDRESS,
                BouncyCastleWsaaManagerTest.LOCATION,
                BouncyCastleWsaaManagerTest.CN));
        return dao;
    }
}
