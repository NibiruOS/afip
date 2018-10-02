package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.util.Constants;
import ar.com.system.afip.util.Dependencies;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsfe.service.api.FEAuthRequest;
import ar.com.system.afip.wsfe.service.api.IvaTipoResponse;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;

import static org.junit.Assert.assertEquals;

public class WsaaTemplateImplTestImpl {
    public static void test() {
        WsaaTemplate wsaaTemplate = Dependencies.wsaaTemplate(Service.WSFE);
        ServiceSoap serviceSoap = Dependencies.serviceSoap();

        IvaTipoResponse response = wsaaTemplate
                .runAuhtenticated(credentials ->
                        serviceSoap.feParamGetTiposIva(FEAuthRequest
                                .fromCredentials(credentials,
                                        Constants.CUIT)));

        assertEquals(6, response.getResultGet().getIvaTipo().size());
    }
}
