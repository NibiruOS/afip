
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutorizarAjusteIVAResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutorizarAjusteIVAResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ResultadoSimpleType"/>
 *         &lt;element name="comprobanteResponse" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ComprobanteCAEResponseType" minOccurs="0"/>
 *         &lt;element name="arrayObservaciones" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesType" minOccurs="0"/>
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
@XmlType(name = "AutorizarAjusteIVAResponseType", propOrder = {
    "resultado",
    "comprobanteResponse",
    "arrayObservaciones",
    "arrayErrores",
    "evento"
})
public class AutorizarAjusteIVAResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultadoSimpleType resultado;
    protected ComprobanteCAEResponseType comprobanteResponse;
    protected ArrayCodigosDescripcionesType arrayObservaciones;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoSimpleType }
     *     
     */
    public ResultadoSimpleType getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoSimpleType }
     *     
     */
    public void setResultado(ResultadoSimpleType value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteResponse.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteCAEResponseType }
     *     
     */
    public ComprobanteCAEResponseType getComprobanteResponse() {
        return comprobanteResponse;
    }

    /**
     * Define el valor de la propiedad comprobanteResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteCAEResponseType }
     *     
     */
    public void setComprobanteResponse(ComprobanteCAEResponseType value) {
        this.comprobanteResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayObservaciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayObservaciones() {
        return arrayObservaciones;
    }

    /**
     * Define el valor de la propiedad arrayObservaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayObservaciones(ArrayCodigosDescripcionesType value) {
        this.arrayObservaciones = value;
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
