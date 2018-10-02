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
 *         &lt;element name="FEParamGetTiposCbteResult" type="{http://ar.gov.afip.dif.FEV1/}CbteTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feParamGetTiposCbteResult"})
@XmlRootElement(name = "FEParamGetTiposCbteResponse")
public class FEParamGetTiposCbteResponse {
    @XmlElement(name = "FEParamGetTiposCbteResult")
    @Element(name = "FEParamGetTiposCbteResult")
    protected CbteTipoResponse feParamGetTiposCbteResult;

    /**
     * Obtiene el valor de la propiedad feParamGetTiposCbteResult.
     *
     * @return possible object is {@link CbteTipoResponse }
     */
    public CbteTipoResponse getFEParamGetTiposCbteResult() {
        return feParamGetTiposCbteResult;
    }

    /**
     * Define el valor de la propiedad feParamGetTiposCbteResult.
     *
     * @param value allowed object is {@link CbteTipoResponse }
     */
    public void setFEParamGetTiposCbteResult(CbteTipoResponse value) {
        this.feParamGetTiposCbteResult = value;
    }

}
