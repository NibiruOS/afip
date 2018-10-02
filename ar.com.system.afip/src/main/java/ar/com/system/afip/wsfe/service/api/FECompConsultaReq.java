package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECompConsultaReq complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FECompConsultaReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteNro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECompConsultaReq", propOrder = {"cbteTipo", "cbteNro",
        "ptoVta"})
public class FECompConsultaReq {
    @XmlElement(name = "CbteTipo")
    @Element(name = "CbteTipo")
    protected int cbteTipo;
    @XmlElement(name = "CbteNro")
    @Element(name = "CbteNro")
    protected long cbteNro;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;

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
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Define el valor de la propiedad cbteNro.
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
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

}
