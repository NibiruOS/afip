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
 *         &lt;element name="FEParamGetTiposPaisesResult" type="{http://ar.gov.afip.dif.FEV1/}FEPaisResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feParamGetTiposPaisesResult"})
@XmlRootElement(name = "FEParamGetTiposPaisesResponse")
public class FEParamGetTiposPaisesResponse {
    @XmlElement(name = "FEParamGetTiposPaisesResult")
    @Element(name = "FEParamGetTiposPaisesResult")
    protected FEPaisResponse feParamGetTiposPaisesResult;

    /**
     * Obtiene el valor de la propiedad feParamGetTiposPaisesResult.
     *
     * @return possible object is {@link FEPaisResponse }
     */
    public FEPaisResponse getFEParamGetTiposPaisesResult() {
        return feParamGetTiposPaisesResult;
    }

    /**
     * Define el valor de la propiedad feParamGetTiposPaisesResult.
     *
     * @param value allowed object is {@link FEPaisResponse }
     */
    public void setFEParamGetTiposPaisesResult(FEPaisResponse value) {
        this.feParamGetTiposPaisesResult = value;
    }

}
