
package ar.com.system.afip.wsmtxca.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayCompradoresType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayCompradoresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprador" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CompradorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCompradoresType", propOrder = {
    "comprador"
})
public class ArrayCompradoresType {

    @XmlElement(required = true)
    protected List<CompradorType> comprador;

    /**
     * Gets the value of the comprador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comprador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComprador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompradorType }
     * 
     * 
     */
    public List<CompradorType> getComprador() {
        if (comprador == null) {
            comprador = new ArrayList<CompradorType>();
        }
        return this.comprador;
    }

}
