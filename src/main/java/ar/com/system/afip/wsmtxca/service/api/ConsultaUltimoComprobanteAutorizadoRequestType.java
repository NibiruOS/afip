
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaUltimoComprobanteAutorizadoRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaUltimoComprobanteAutorizadoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaUltimoComprobanteAutorizadoRequestType", propOrder = {
    "codigoTipoComprobante",
    "numeroPuntoVenta"
})
public class ConsultaUltimoComprobanteAutorizadoRequestType {

    protected short codigoTipoComprobante;
    protected short numeroPuntoVenta;
    
    public ConsultaUltimoComprobanteAutorizadoRequestType(short codigoTipoComprobante, short numeroPuntoVenta) {
		this.codigoTipoComprobante = codigoTipoComprobante;
		this.numeroPuntoVenta = numeroPuntoVenta;
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

}
