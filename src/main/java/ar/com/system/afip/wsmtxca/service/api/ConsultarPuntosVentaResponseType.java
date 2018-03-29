
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarPuntosVentaResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPuntosVentaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayPuntosVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayPuntosVentaType"/>
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
@XmlType(name = "ConsultarPuntosVentaResponseType", propOrder = {
    "arrayPuntosVenta",
    "evento"
})
public class ConsultarPuntosVentaResponseType {

    @XmlElement(required = true)
    protected ArrayPuntosVentaType arrayPuntosVenta;
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad arrayPuntosVenta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayPuntosVentaType }
     *     
     */
    public ArrayPuntosVentaType getArrayPuntosVenta() {
        return arrayPuntosVenta;
    }

    /**
     * Define el valor de la propiedad arrayPuntosVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayPuntosVentaType }
     *     
     */
    public void setArrayPuntosVenta(ArrayPuntosVentaType value) {
        this.arrayPuntosVenta = value;
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
