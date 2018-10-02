
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarTiposDocumentoResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarTiposDocumentoResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayTiposDocumento" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesType"/>
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
@XmlType(name = "ConsultarTiposDocumentoResponseType", propOrder = {
    "arrayTiposDocumento",
    "evento"
})
public class ConsultarTiposDocumentoResponseType {

    @XmlElement(required = true)
    protected ArrayCodigosDescripcionesType arrayTiposDocumento;
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad arrayTiposDocumento.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayTiposDocumento() {
        return arrayTiposDocumento;
    }

    /**
     * Define el valor de la propiedad arrayTiposDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayTiposDocumento(ArrayCodigosDescripcionesType value) {
        this.arrayTiposDocumento = value;
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
