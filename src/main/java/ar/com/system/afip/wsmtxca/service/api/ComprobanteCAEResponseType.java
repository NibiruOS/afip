
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ComprobanteCAEResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComprobanteCAEResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *         &lt;element name="numeroComprobante" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroComprobanteSimpleType"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CAE" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaVencimientoCAE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobanteCAEResponseType", propOrder = {
    "cuit",
    "codigoTipoComprobante",
    "numeroPuntoVenta",
    "numeroComprobante",
    "fechaEmision",
    "cae",
    "fechaVencimientoCAE"
})
public class ComprobanteCAEResponseType {

    protected long cuit;
    protected short codigoTipoComprobante;
    protected short numeroPuntoVenta;
    @XmlSchemaType(name = "long")
    protected int numeroComprobante;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "CAE")
    protected long cae;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoCAE;

    /**
     * Obtiene el valor de la propiedad cuit.
     * 
     */
    public long getCuit() {
        return cuit;
    }

    /**
     * Define el valor de la propiedad cuit.
     * 
     */
    public void setCuit(long value) {
        this.cuit = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoComprobante.
     * 
     */
    public short getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    /**
     * Define el valor de la propiedad codigoTipoComprobante.
     * 
     */
    public void setCodigoTipoComprobante(short value) {
        this.codigoTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuntoVenta.
     * 
     */
    public short getNumeroPuntoVenta() {
        return numeroPuntoVenta;
    }

    /**
     * Define el valor de la propiedad numeroPuntoVenta.
     * 
     */
    public void setNumeroPuntoVenta(short value) {
        this.numeroPuntoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     * 
     */
    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     * 
     */
    public void setNumeroComprobante(int value) {
        this.numeroComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad cae.
     * 
     */
    public long getCAE() {
        return cae;
    }

    /**
     * Define el valor de la propiedad cae.
     * 
     */
    public void setCAE(long value) {
        this.cae = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoCAE.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoCAE() {
        return fechaVencimientoCAE;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoCAE.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoCAE(XMLGregorianCalendar value) {
        this.fechaVencimientoCAE = value;
    }

}
