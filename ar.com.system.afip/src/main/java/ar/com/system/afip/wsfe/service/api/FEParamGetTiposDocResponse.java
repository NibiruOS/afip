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
 *         &lt;element name="FEParamGetTiposDocResult" type="{http://ar.gov.afip.dif.FEV1/}DocTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feParamGetTiposDocResult"})
@XmlRootElement(name = "FEParamGetTiposDocResponse")
public class FEParamGetTiposDocResponse {
    @XmlElement(name = "FEParamGetTiposDocResult")
    @Element(name = "FEParamGetTiposDocResult")
    protected DocTipoResponse feParamGetTiposDocResult;

    /**
     * Obtiene el valor de la propiedad feParamGetTiposDocResult.
     *
     * @return possible object is {@link DocTipoResponse }
     */
    public DocTipoResponse getFEParamGetTiposDocResult() {
        return feParamGetTiposDocResult;
    }

    /**
     * Define el valor de la propiedad feParamGetTiposDocResult.
     *
     * @param value allowed object is {@link DocTipoResponse }
     */
    public void setFEParamGetTiposDocResult(DocTipoResponse value) {
        this.feParamGetTiposDocResult = value;
    }

}
