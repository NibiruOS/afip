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
 *         &lt;element name="FECAEARegInformativoResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEAResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"fecaeaRegInformativoResult"})
@XmlRootElement(name = "FECAEARegInformativoResponse")
public class FECAEARegInformativoResponse {
    @XmlElement(name = "FECAEARegInformativoResult")
    @Element(name = "FECAEARegInformativoResult")
    protected FECAEAResponse fecaeaRegInformativoResult;

    /**
     * Obtiene el valor de la propiedad fecaeaRegInformativoResult.
     *
     * @return possible object is {@link FECAEAResponse }
     */
    public FECAEAResponse getFECAEARegInformativoResult() {
        return fecaeaRegInformativoResult;
    }

    /**
     * Define el valor de la propiedad fecaeaRegInformativoResult.
     *
     * @param value allowed object is {@link FECAEAResponse }
     */
    public void setFECAEARegInformativoResult(FECAEAResponse value) {
        this.fecaeaRegInformativoResult = value;
    }

}
