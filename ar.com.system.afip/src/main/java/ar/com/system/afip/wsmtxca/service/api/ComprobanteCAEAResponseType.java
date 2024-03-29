
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para ComprobanteCAEAResponseType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ComprobanteCAEAResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *         &lt;element name="numeroComprobante" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroComprobanteSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobanteCAEAResponseType", propOrder = {
        "caea",
        "codigoTipoComprobante",
        "numeroPuntoVenta",
        "numeroComprobante"
})
public class ComprobanteCAEAResponseType {

    @XmlElement(name = "CAEA")
    @Element(name = "CAEA")
    protected long caea;
    @Element
    protected short codigoTipoComprobante;
    @Element
    protected short numeroPuntoVenta;
    @XmlSchemaType(name = "long")
    @Element
    protected int numeroComprobante;

    public ComprobanteCAEAResponseType() {
        
    }

    public ComprobanteCAEAResponseType(long caea, short codigoTipoComprobante, short numeroPuntoVenta,
                                       int numeroComprobante) {
        this.caea = caea;
        this.codigoTipoComprobante = codigoTipoComprobante;
        this.numeroPuntoVenta = numeroPuntoVenta;
        this.numeroComprobante = numeroComprobante;
    }

    /**
     * Obtiene el valor de la propiedad caea.
     */
    public long getCAEA() {
        return caea;
    }

    /**
     * Define el valor de la propiedad caea.
     */
    public void setCAEA(long value) {
        this.caea = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoComprobante.
     */
    public short getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    /**
     * Define el valor de la propiedad codigoTipoComprobante.
     */
    public void setCodigoTipoComprobante(short value) {
        this.codigoTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuntoVenta.
     */
    public short getNumeroPuntoVenta() {
        return numeroPuntoVenta;
    }

    /**
     * Define el valor de la propiedad numeroPuntoVenta.
     */
    public void setNumeroPuntoVenta(short value) {
        this.numeroPuntoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     */
    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     */
    public void setNumeroComprobante(int value) {
        this.numeroComprobante = value;
    }

}
