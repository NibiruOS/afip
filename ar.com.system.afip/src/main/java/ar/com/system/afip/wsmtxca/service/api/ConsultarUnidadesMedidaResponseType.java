
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarUnidadesMedidaResponseType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ConsultarUnidadesMedidaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayUnidadesMedida" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesType"/>
 *         &lt;element name="evento" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CodigoDescripcionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarUnidadesMedidaResponseType", propOrder = {
        "arrayUnidadesMedida",
        "evento"
})
public class ConsultarUnidadesMedidaResponseType {

    @XmlElement(required = true)
    @Element
    protected ArrayCodigosDescripcionesType arrayUnidadesMedida;
    @Element
    protected CodigoDescripcionType evento;

    /**
     * Obtiene el valor de la propiedad arrayUnidadesMedida.
     *
     * @return possible object is
     * {@link ArrayCodigosDescripcionesType }
     */
    public ArrayCodigosDescripcionesType getArrayUnidadesMedida() {
        return arrayUnidadesMedida;
    }

    /**
     * Define el valor de la propiedad arrayUnidadesMedida.
     *
     * @param value allowed object is
     *              {@link ArrayCodigosDescripcionesType }
     */
    public void setArrayUnidadesMedida(ArrayCodigosDescripcionesType value) {
        this.arrayUnidadesMedida = value;
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
