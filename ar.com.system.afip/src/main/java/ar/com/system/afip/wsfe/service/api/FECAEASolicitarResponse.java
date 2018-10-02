package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;

/**
 *
 * Clase Java para anonymous complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECAEASolicitarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEAGetResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"fecaeaSolicitarResult"})
@XmlRootElement(name = "FECAEASolicitarResponse")
public class FECAEASolicitarResponse {
    @XmlElement(name = "FECAEASolicitarResult")
    @Element(name = "FECAEASolicitarResult")
    protected FECAEAGetResponse fecaeaSolicitarResult;

    /**
     * Obtiene el valor de la propiedad fecaeaSolicitarResult.
     *
     * @return possible object is {@link FECAEAGetResponse }
     */
    public FECAEAGetResponse getFECAEASolicitarResult() {
        return fecaeaSolicitarResult;
    }

    /**
     * Define el valor de la propiedad fecaeaSolicitarResult.
     *
     * @param value allowed object is {@link FECAEAGetResponse }
     */
    public void setFECAEASolicitarResult(FECAEAGetResponse value) {
        this.fecaeaSolicitarResult = value;
    }

}
