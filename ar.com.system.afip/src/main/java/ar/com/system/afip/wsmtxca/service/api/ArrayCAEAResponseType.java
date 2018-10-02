
package ar.com.system.afip.wsmtxca.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayCAEAResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayCAEAResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAEAResponse" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CAEAResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCAEAResponseType", propOrder = {
    "caeaResponse"
})
public class ArrayCAEAResponseType {

    @XmlElement(name = "CAEAResponse")
    protected List<CAEAResponseType> caeaResponse;

    /**
     * Gets the value of the caeaResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caeaResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAEAResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAEAResponseType }
     * 
     * 
     */
    public List<CAEAResponseType> getCAEAResponse() {
        if (caeaResponse == null) {
            caeaResponse = new ArrayList<CAEAResponseType>();
        }
        return this.caeaResponse;
    }

}
