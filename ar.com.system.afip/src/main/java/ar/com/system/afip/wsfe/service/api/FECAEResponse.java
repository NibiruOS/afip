package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEResponse complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FECAEResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeCabResp" type="{http://ar.gov.afip.dif.FEV1/}FECAECabResponse" minOccurs="0"/>
 *         &lt;element name="FeDetResp" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfFECAEDetResponse" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfEvt" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfErr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEResponse", propOrder = {"feCabResp", "feDetResp",
        "events", "errors"})
public class FECAEResponse implements HasErrors {
    @XmlElement(name = "FeCabResp")
    @Element(name = "FeCabResp")
    protected FECAECabResponse feCabResp;
    @XmlElement(name = "FeDetResp")
    @Element(name = "FeDetResp")
    protected ArrayOfFECAEDetResponse feDetResp;
    @XmlElement(name = "Events")
    @Element(name = "Events", required = false)
    protected ArrayOfEvt events;
    @XmlElement(name = "Errors")
    @Element(name = "Errors", required = false)
    protected ArrayOfErr errors;

    /**
     * Obtiene el valor de la propiedad feCabResp.
     *
     * @return possible object is {@link FECAECabResponse }
     */
    public FECAECabResponse getFeCabResp() {
        return feCabResp;
    }

    /**
     * Define el valor de la propiedad feCabResp.
     *
     * @param value allowed object is {@link FECAECabResponse }
     */
    public void setFeCabResp(FECAECabResponse value) {
        this.feCabResp = value;
    }

    /**
     * Obtiene el valor de la propiedad feDetResp.
     *
     * @return possible object is {@link ArrayOfFECAEDetResponse }
     */
    public ArrayOfFECAEDetResponse getFeDetResp() {
        return feDetResp;
    }

    /**
     * Define el valor de la propiedad feDetResp.
     *
     * @param value allowed object is {@link ArrayOfFECAEDetResponse }
     */
    public void setFeDetResp(ArrayOfFECAEDetResponse value) {
        this.feDetResp = value;
    }

    /**
     * Obtiene el valor de la propiedad events.
     *
     * @return possible object is {@link ArrayOfEvt }
     */
    public ArrayOfEvt getEvents() {
        return events;
    }

    /**
     * Define el valor de la propiedad events.
     *
     * @param value allowed object is {@link ArrayOfEvt }
     */
    public void setEvents(ArrayOfEvt value) {
        this.events = value;
    }

    /**
     * Obtiene el valor de la propiedad errors.
     *
     * @return possible object is {@link ArrayOfErr }
     */
    public ArrayOfErr getErrors() {
        return errors;
    }

    /**
     * Define el valor de la propiedad errors.
     *
     * @param value allowed object is {@link ArrayOfErr }
     */
    public void setErrors(ArrayOfErr value) {
        this.errors = value;
    }

}
