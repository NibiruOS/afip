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
 *         &lt;element name="FECompTotXRequestResult" type="{http://ar.gov.afip.dif.FEV1/}FERegXReqResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feCompTotXRequestResult"})
@XmlRootElement(name = "FECompTotXRequestResponse")
public class FECompTotXRequestResponse {
    @XmlElement(name = "FECompTotXRequestResult")
    @Element(name = "FECompTotXRequestResult")
    protected FERegXReqResponse feCompTotXRequestResult;

    /**
     * Obtiene el valor de la propiedad feCompTotXRequestResult.
     *
     * @return possible object is {@link FERegXReqResponse }
     */
    public FERegXReqResponse getFECompTotXRequestResult() {
        return feCompTotXRequestResult;
    }

    /**
     * Define el valor de la propiedad feCompTotXRequestResult.
     *
     * @param value allowed object is {@link FERegXReqResponse }
     */
    public void setFECompTotXRequestResult(FERegXReqResponse value) {
        this.feCompTotXRequestResult = value;
    }

}
