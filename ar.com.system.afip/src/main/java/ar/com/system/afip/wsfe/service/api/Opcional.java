package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para Opcional complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="Opcional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opcional", propOrder = {"id", "valor"})
public class Opcional {
    @XmlElement(name = "Id")
    @Element(name = "Id")
    protected String id;
    @XmlElement(name = "Valor")
    @Element(name = "Valor")
    protected String valor;

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     *
     * @return possible object is {@link String }
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     *
     * @param value allowed object is {@link String }
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
