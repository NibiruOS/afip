
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Clase Java para ItemType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unidadesMtx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoMtx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidad" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}DecimalSimpleType" minOccurs="0"/>
 *         &lt;element name="codigoUnidadMedida" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="precioUnitario" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}DecimalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeBonificacion" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}DecimalSimpleType" minOccurs="0"/>
 *         &lt;element name="codigoCondicionIVA" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="importeIVA" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeItem" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
        "unidadesMtx",
        "codigoMtx",
        "codigo",
        "descripcion",
        "cantidad",
        "codigoUnidadMedida",
        "precioUnitario",
        "importeBonificacion",
        "codigoCondicionIVA",
        "importeIVA",
        "importeItem"
})
public class ItemType {
    @Element
    protected Integer unidadesMtx;
    @Element
    protected String codigoMtx;
    @Element
    protected String codigo;
    @XmlElement(required = true)
    @Element
    protected String descripcion;
    @Element
    protected BigDecimal cantidad;
    @Element
    protected short codigoUnidadMedida;
    @Element
    protected BigDecimal precioUnitario;
    @Element
    protected BigDecimal importeBonificacion;
    @Element
    protected short codigoCondicionIVA;
    @Element
    protected BigDecimal importeIVA;
    @XmlElement(required = true)
    @Element
    protected BigDecimal importeItem;

    /**
     * Obtiene el valor de la propiedad unidadesMtx.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getUnidadesMtx() {
        return unidadesMtx;
    }

    /**
     * Define el valor de la propiedad unidadesMtx.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setUnidadesMtx(Integer value) {
        this.unidadesMtx = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMtx.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodigoMtx() {
        return codigoMtx;
    }

    /**
     * Define el valor de la propiedad codigoMtx.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodigoMtx(String value) {
        this.codigoMtx = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodigo(String value) {
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
     * Obtiene el valor de la propiedad cantidad.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnidadMedida.
     */
    public short getCodigoUnidadMedida() {
        return codigoUnidadMedida;
    }

    /**
     * Define el valor de la propiedad codigoUnidadMedida.
     */
    public void setCodigoUnidadMedida(short value) {
        this.codigoUnidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPrecioUnitario(BigDecimal value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad importeBonificacion.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteBonificacion() {
        return importeBonificacion;
    }

    /**
     * Define el valor de la propiedad importeBonificacion.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteBonificacion(BigDecimal value) {
        this.importeBonificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCondicionIVA.
     */
    public short getCodigoCondicionIVA() {
        return codigoCondicionIVA;
    }

    /**
     * Define el valor de la propiedad codigoCondicionIVA.
     */
    public void setCodigoCondicionIVA(short value) {
        this.codigoCondicionIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad importeIVA.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteIVA() {
        return importeIVA;
    }

    /**
     * Define el valor de la propiedad importeIVA.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteIVA(BigDecimal value) {
        this.importeIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad importeItem.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteItem() {
        return importeItem;
    }

    /**
     * Define el valor de la propiedad importeItem.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteItem(BigDecimal value) {
        this.importeItem = value;
    }

}
