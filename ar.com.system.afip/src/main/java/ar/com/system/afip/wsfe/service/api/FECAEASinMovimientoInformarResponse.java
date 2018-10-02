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
 *         &lt;element name="FECAEASinMovimientoInformarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEASinMovResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"fecaeaSinMovimientoInformarResult"})
@XmlRootElement(name = "FECAEASinMovimientoInformarResponse")
public class FECAEASinMovimientoInformarResponse {
    @XmlElement(name = "FECAEASinMovimientoInformarResult")
    @Element(name = "FECAEASinMovimientoInformarResult")
    protected FECAEASinMovResponse fecaeaSinMovimientoInformarResult;

    /**
     * Obtiene el valor de la propiedad fecaeaSinMovimientoInformarResult.
     *
     * @return possible object is {@link FECAEASinMovResponse }
     */
    public FECAEASinMovResponse getFECAEASinMovimientoInformarResult() {
        return fecaeaSinMovimientoInformarResult;
    }

    /**
     * Define el valor de la propiedad fecaeaSinMovimientoInformarResult.
     *
     * @param value allowed object is {@link FECAEASinMovResponse }
     */
    public void setFECAEASinMovimientoInformarResult(FECAEASinMovResponse value) {
        this.fecaeaSinMovimientoInformarResult = value;
    }

}
