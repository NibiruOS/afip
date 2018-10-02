package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Clase Java para FECabRequest complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FECabRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantReg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECabRequest", propOrder = {"cantReg", "ptoVta", "cbteTipo"})
@XmlSeeAlso({FECAECabRequest.class, FECAEACabRequest.class})
public class FECabRequest {
    @XmlElement(name = "CantReg")
    @Element(name = "CantReg")
    protected int cantReg;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "CbteTipo")
    @Element(name = "CbteTipo")
    protected int cbteTipo;

    /**
     * Obtiene el valor de la propiedad cantReg.
     */
    public int getCantReg() {
        return cantReg;
    }

    /**
     * Define el valor de la propiedad cantReg.
     */
    public void setCantReg(int value) {
        this.cantReg = value;
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

}
