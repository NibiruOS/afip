package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para PaisTipo complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="PaisTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaisTipo", propOrder = {"id", "desc"})
public class PaisTipo {
    @XmlElement(name = "Id")
    @Element(name = "Id")
    protected short id;
    @XmlElement(name = "Desc")
    @Element(name = "Desc")
    protected String desc;

    /**
     * Obtiene el valor de la propiedad id.
     */
    public short getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setId(short value) {
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

}
