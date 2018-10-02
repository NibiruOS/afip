package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECAESolicitarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"fecaeSolicitarResult"})
@XmlRootElement(name = "FECAESolicitarResponse")
public class FECAESolicitarResponse {
    @XmlElement(name = "FECAESolicitarResult")
    @Element(name = "FECAESolicitarResult")
    protected FECAEResponse fecaeSolicitarResult;

    /**
     * Obtiene el valor de la propiedad fecaeSolicitarResult.
     *
     * @return possible object is {@link FECAEResponse }
     */
    public FECAEResponse getFECAESolicitarResult() {
        return fecaeSolicitarResult;
    }

    /**
     * Define el valor de la propiedad fecaeSolicitarResult.
     *
     * @param value allowed object is {@link FECAEResponse }
     */
    public void setFECAESolicitarResult(FECAEResponse value) {
        this.fecaeSolicitarResult = value;
    }

}
