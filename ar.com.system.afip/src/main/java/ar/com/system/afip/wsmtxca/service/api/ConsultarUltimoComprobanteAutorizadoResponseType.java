
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarUltimoComprobanteAutorizadoResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarUltimoComprobanteAutorizadoResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroComprobante" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroComprobanteSimpleType" minOccurs="0"/>
 *         &lt;element name="arrayErrores" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesType" minOccurs="0"/>
 *         &lt;element name="evento" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CodigoDescripcionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarUltimoComprobanteAutorizadoResponseType", propOrder = {
    "numeroComprobante",
    "arrayErrores",
    "evento"
})
public class ConsultarUltimoComprobanteAutorizadoResponseType extends AbstractHashError {

    @XmlSchemaType(name = "long")
    protected Integer numeroComprobante;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroComprobante(Integer value) {
        this.numeroComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayErrores.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayErrores() {
        return arrayErrores;
    }

    /**
     * Define el valor de la propiedad arrayErrores.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayErrores(ArrayCodigosDescripcionesType value) {
        this.arrayErrores = value;
    }

    /**
     * Obtiene el valor de la propiedad evento.
     * 
     * @return
     *     possible object is
     *     {@link CodigoDescripcionType }
     *     
     */
    public CodigoDescripcionType getEvento() {
        return evento;
    }

    /**
     * Define el valor de la propiedad evento.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoDescripcionType }
     *     
     */
    public void setEvento(CodigoDescripcionType value) {
        this.evento = value;
    }

}
