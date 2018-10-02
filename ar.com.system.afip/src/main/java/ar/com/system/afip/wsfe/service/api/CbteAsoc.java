package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para CbteAsoc complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="CbteAsoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbteAsoc", propOrder = {"tipo", "ptoVta", "nro"})
public class CbteAsoc {
    @XmlElement(name = "Tipo")
    @Element(name = "Tipo")
    protected int tipo;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "Nro")
    @Element(name = "Nro")
    protected long nro;

    /**
     * Obtiene el valor de la propiedad tipo.
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     */
    public void setTipo(int value) {
        this.tipo = value;
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
     * Obtiene el valor de la propiedad nro.
     */
    public long getNro() {
        return nro;
    }

    /**
     * Define el valor de la propiedad nro.
     */
    public void setNro(long value) {
        this.nro = value;
    }

}
