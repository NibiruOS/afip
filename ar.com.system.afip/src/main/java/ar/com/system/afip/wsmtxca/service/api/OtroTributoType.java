
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Clase Java para OtroTributoType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="OtroTributoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseImponible" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteTotalSimpleType"/>
 *         &lt;element name="importe" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteTotalSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtroTributoType", propOrder = {
        "codigo",
        "descripcion",
        "baseImponible",
        "importe"
})
public class OtroTributoType {

    @Element
    protected short codigo;
    @Element
    protected String descripcion;
    @XmlElement(required = true)
    @Element
    protected BigDecimal baseImponible;
    @XmlElement(required = true)
    @Element
    protected BigDecimal importe;

    /**
     * Obtiene el valor de la propiedad codigo.
     */
    public short getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     */
    public void setCodigo(short value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setBaseImponible(BigDecimal value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

}
