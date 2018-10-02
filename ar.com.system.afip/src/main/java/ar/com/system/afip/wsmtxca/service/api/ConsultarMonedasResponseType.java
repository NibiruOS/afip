
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarMonedasResponseType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ConsultarMonedasResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayMonedas" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesStringType"/>
 *         &lt;element name="evento" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CodigoDescripcionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarMonedasResponseType", propOrder = {
        "arrayMonedas",
        "evento"
})
public class ConsultarMonedasResponseType {

    @XmlElement(required = true)
    @Element
    protected ArrayCodigosDescripcionesStringType arrayMonedas;
    @Element
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad arrayMonedas.
     *
     * @return possible object is
     * {@link ArrayCodigosDescripcionesStringType }
     */
    public ArrayCodigosDescripcionesStringType getArrayMonedas() {
        return arrayMonedas;
    }

    /**
     * Define el valor de la propiedad arrayMonedas.
     *
     * @param value allowed object is
     *              {@link ArrayCodigosDescripcionesStringType }
     */
    public void setArrayMonedas(ArrayCodigosDescripcionesStringType value) {
        this.arrayMonedas = value;
    }

    /**
     * Obtiene el valor de la propiedad evento.
     *
     * @return possible object is
     * {@link CodigoDescripcionType }
     */
    public CodigoDescripcionType getEvento() {
        return evento;
    }

    /**
     * Define el valor de la propiedad evento.
     *
     * @param value allowed object is
     *              {@link CodigoDescripcionType }
     */
    public void setEvento(CodigoDescripcionType value) {
        this.evento = value;
    }

}
