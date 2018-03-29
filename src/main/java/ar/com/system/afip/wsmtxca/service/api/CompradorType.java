
package ar.com.system.afip.wsmtxca.service.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CompradorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompradorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="porcentaje" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}PorcentajeSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompradorType", propOrder = {
    "codigoTipoDocumento",
    "numeroDocumento",
    "porcentaje"
})
public class CompradorType {

    protected short codigoTipoDocumento;
    protected long numeroDocumento;
    @XmlElement(required = true)
    protected BigDecimal porcentaje;

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     */
    public short getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     */
    public void setCodigoTipoDocumento(short value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     */
    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     */
    public void setNumeroDocumento(long value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

}
