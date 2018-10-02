package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

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
 *         &lt;element name="FEParamGetTiposIvaResult" type="{http://ar.gov.afip.dif.FEV1/}IvaTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feParamGetTiposIvaResult"})
@XmlRootElement(name = "FEParamGetTiposIvaResponse")
@Root(name = "FEParamGetTiposIvaResponse")
public class FEParamGetTiposIvaResponse {
    @XmlElement(name = "FEParamGetTiposIvaResult")
    @Element(name = "FEParamGetTiposIvaResult")
    protected IvaTipoResponse feParamGetTiposIvaResult;

    /**
     * Obtiene el valor de la propiedad feParamGetTiposIvaResult.
     *
     * @return possible object is {@link IvaTipoResponse }
     */
    public IvaTipoResponse getFEParamGetTiposIvaResult() {
        return feParamGetTiposIvaResult;
    }

    /**
     * Define el valor de la propiedad feParamGetTiposIvaResult.
     *
     * @param value allowed object is {@link IvaTipoResponse }
     */
    public void setFEParamGetTiposIvaResult(IvaTipoResponse value) {
        this.feParamGetTiposIvaResult = value;
    }

}
