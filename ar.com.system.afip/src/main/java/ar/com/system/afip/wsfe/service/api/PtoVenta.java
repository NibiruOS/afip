package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Clase Java para PtoVenta complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="PtoVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nro" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="EmisionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bloqueado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtoVenta", propOrder = {"nro", "emisionTipo", "bloqueado",
        "fchBaja"})
public class PtoVenta {
    @XmlElement(name = "Nro")
    @Element(name = "Nro")
    protected short nro;
    @XmlElement(name = "EmisionTipo")
    @Element(name = "EmisionTipo")
    protected String emisionTipo;
    @XmlElement(name = "Bloqueado")
    @Element(name = "Bloqueado")
    protected String bloqueado;
    @XmlElement(name = "FchBaja")
    @Element(name = "FchBaja")
    protected String fchBaja;

    /**
     * Obtiene el valor de la propiedad nro.
     */
    public short getNro() {
        return nro;
    }

    /**
     * Define el valor de la propiedad nro.
     */
    public void setNro(short value) {
        this.nro = value;
    }

    /**
     * Obtiene el valor de la propiedad emisionTipo.
     *
     * @return possible object is {@link String }
     */
    public String getEmisionTipo() {
        return emisionTipo;
    }

    /**
     * Define el valor de la propiedad emisionTipo.
     *
     * @param value allowed object is {@link String }
     */
    public void setEmisionTipo(String value) {
        this.emisionTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueado.
     *
     * @return possible object is {@link String }
     */
    public String getBloqueado() {
        return bloqueado;
    }

    /**
     * Define el valor de la propiedad bloqueado.
     *
     * @param value allowed object is {@link String }
     */
    public void setBloqueado(String value) {
        this.bloqueado = value;
    }

    /**
     * Obtiene el valor de la propiedad fchBaja.
     *
     * @return possible object is {@link String }
     */
    public String getFchBaja() {
        return fchBaja;
    }

    /**
     * Define el valor de la propiedad fchBaja.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchBaja(String value) {
        this.fchBaja = value;
    }

}
