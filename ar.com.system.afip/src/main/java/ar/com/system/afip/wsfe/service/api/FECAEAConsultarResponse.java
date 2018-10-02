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
 *         &lt;element name="FECAEAConsultarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEAGetResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"fecaeaConsultarResult"})
@XmlRootElement(name = "FECAEAConsultarResponse")
public class FECAEAConsultarResponse {
    @XmlElement(name = "FECAEAConsultarResult")
    @Element(name = "FECAEAConsultarResult")
    protected FECAEAGetResponse fecaeaConsultarResult;

    /**
     * Obtiene el valor de la propiedad fecaeaConsultarResult.
     *
     * @return possible object is {@link FECAEAGetResponse }
     */
    public FECAEAGetResponse getFECAEAConsultarResult() {
        return fecaeaConsultarResult;
    }

    /**
     * Define el valor de la propiedad fecaeaConsultarResult.
     *
     * @param value allowed object is {@link FECAEAGetResponse }
     */
    public void setFECAEAConsultarResult(FECAEAGetResponse value) {
        this.fecaeaConsultarResult = value;
    }

}
