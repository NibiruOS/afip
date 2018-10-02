
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.ElementList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para ArrayOtrosTributosType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ArrayOtrosTributosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otroTributo" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}OtroTributoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOtrosTributosType", propOrder = {
        "otroTributo"
})
public class ArrayOtrosTributosType {

    @XmlElement(required = true)
    @ElementList(name = "OtroTributos", entry = "otroTributo", type = OtroTributoType.class, inline = true)
    protected List<OtroTributoType> otroTributo;

    /**
     * Gets the value of the otroTributo property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otroTributo property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtroTributo().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link OtroTributoType }
     */
    public List<OtroTributoType> getOtroTributo() {
        if (otroTributo == null) {
            otroTributo = new ArrayList<OtroTributoType>();
        }
        return this.otroTributo;
    }

}
