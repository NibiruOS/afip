package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para CbteTipo complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="CbteTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbteTipo", propOrder = {"id", "desc", "fchDesde", "fchHasta"})
public class CbteTipo {
    @XmlElement(name = "Id")
    @Element(name = "Id")
    protected int id;
    @XmlElement(name = "Desc")
    @Element(name = "Desc")
    protected String desc;
    @XmlElement(name = "FchDesde")
    @Element(name = "FchDesde")
    protected String fchDesde;
    @XmlElement(name = "FchHasta")
    @Element(name = "FchHasta")
    protected String fchHasta;

    /**
     * Obtiene el valor de la propiedad id.
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     *
     * @return possible object is {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     *
     * @param value allowed object is {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad fchDesde.
     *
     * @return possible object is {@link String }
     */
    public String getFchDesde() {
        return fchDesde;
    }

    /**
     * Define el valor de la propiedad fchDesde.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchDesde(String value) {
        this.fchDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fchHasta.
     *
     * @return possible object is {@link String }
     */
    public String getFchHasta() {
        return fchHasta;
    }

    /**
     * Define el valor de la propiedad fchHasta.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchHasta(String value) {
        this.fchHasta = value;
    }

}
