
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaComprobanteRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaComprobanteRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *         &lt;element name="numeroComprobante" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroComprobanteSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaComprobanteRequestType", propOrder = {
    "codigoTipoComprobante",
    "numeroPuntoVenta",
    "numeroComprobante"
})
public class ConsultaComprobanteRequestType {

    protected short codigoTipoComprobante;
    protected short numeroPuntoVenta;
    @XmlSchemaType(name = "long")
    protected int numeroComprobante;

    
    public ConsultaComprobanteRequestType(short codigoTipoComprobante, short numeroPuntoVenta, int numeroComprobante) {
		this.codigoTipoComprobante = codigoTipoComprobante;
		this.numeroPuntoVenta = numeroPuntoVenta;
		this.numeroComprobante = numeroComprobante;
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

}
