package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Clase Java para AlicIva complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="AlicIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaseImp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlicIva", propOrder = {"id", "baseImp", "importe"})
public class AlicIva {
    @XmlElement(name = "Id")
    @Element(name = "Id")
    protected int id;
    @XmlElement(name = "BaseImp")
    @Element(name = "BaseImp")
    protected double baseImp;
    @XmlElement(name = "Importe")
    @Element(name = "Importe")
    protected double importe;

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
     * Obtiene el valor de la propiedad baseImp.
     */
    public double getBaseImp() {
        return baseImp;
    }

    /**
     * Define el valor de la propiedad baseImp.
     */
    public void setBaseImp(double value) {
        this.baseImp = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     */
    public void setImporte(double value) {
        this.importe = value;
    }

}
