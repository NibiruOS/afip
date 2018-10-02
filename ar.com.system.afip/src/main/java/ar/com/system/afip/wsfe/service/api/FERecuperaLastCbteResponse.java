package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FERecuperaLastCbteResponse complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FERecuperaLastCbteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfErr" minOccurs="0"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteNro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Events" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfEvt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FERecuperaLastCbteResponse", propOrder = {"errors", "ptoVta",
        "cbteTipo", "cbteNro", "events"})
public class FERecuperaLastCbteResponse implements HasErrors {
    @XmlElement(name = "Errors", required = false)
    @Element(name = "Errors", required = false)
    protected ArrayOfErr errors;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "CbteTipo")
    @Element(name = "CbteTipo")
    protected int cbteTipo;
    @XmlElement(name = "CbteNro")
    @Element(name = "CbteNro")
    protected int cbteNro;
    @XmlElement(name = "Events")
    @Element(name = "Events", required = false)
    protected ArrayOfEvt events;

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
     * Obtiene el valor de la propiedad ptoVta.
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Define el valor de la propiedad ptoVta.
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteTipo.
     */
    public int getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Define el valor de la propiedad cbteTipo.
     */
    public void setCbteTipo(int value) {
        this.cbteTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteNro.
     */
    public int getCbteNro() {
        return cbteNro;
    }

    /**
     * Define el valor de la propiedad cbteNro.
     */
    public void setCbteNro(int value) {
        this.cbteNro = value;
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
