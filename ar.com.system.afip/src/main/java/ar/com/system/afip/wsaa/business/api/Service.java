package ar.com.system.afip.wsaa.business.api;

public enum Service {

    WSFE("https://wswhomo.afip.gov.ar/wsfev1/service.asmx?WSDL",
            "https://servicios1.afip.gov.ar/wsfev1/service.asmx?WSDL"),
    WSMTXCA("https://fwshomo.afip.gov.ar/wsmtxca/services/MTXCAService?wsdl",
            "https://serviciosjava.afip.gob.ar/wsmtxca/services/MTXCAService?wsdl");

    private String homoWsdl;
    private String productionWsdl;

    Service(String homoWsdl, String productionWsdl) {
        this.homoWsdl = homoWsdl;
        this.productionWsdl = productionWsdl;
    }

    public String getHomoWsdl() {
        return homoWsdl;
    }

    public String getProductionWsdl() {
        return productionWsdl;
    }

}
