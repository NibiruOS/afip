package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Clase Java para CbteTipoResponse complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="CbteTipoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultGet" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfCbteTipo" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfErr" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfEvt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbteTipoResponse", propOrder = {"resultGet", "errors",
        "events"})
public class CbteTipoResponse implements HasErrors {
    @XmlElement(name = "ResultGet")
    @Element(name = "ResultGet", required = false)
    protected ArrayOfCbteTipo resultGet;
    @XmlElement(name = "Errors")
    @Element(name = "Errors", required = false)
    protected ArrayOfErr errors;
    @XmlElement(name = "Events")
    @Element(name = "Events", required = false)
    protected ArrayOfEvt events;

    /**
     * Obtiene el valor de la propiedad resultGet.
     *
     * @return possible object is {@link ArrayOfCbteTipo }
     */
    public ArrayOfCbteTipo getResultGet() {
        return resultGet;
    }

    /**
     * Define el valor de la propiedad resultGet.
     *
     * @param value allowed object is {@link ArrayOfCbteTipo }
     */
    public void setResultGet(ArrayOfCbteTipo value) {
        this.resultGet = value;
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

}
