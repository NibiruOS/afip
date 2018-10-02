package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.ElementList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Clase Java para ArrayOfCbteAsoc complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfCbteAsoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbteAsoc" type="{http://ar.gov.afip.dif.FEV1/}CbteAsoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCbteAsoc", propOrder = {"cbteAsoc"})
public class ArrayOfCbteAsoc {
    @XmlElement(name = "CbteAsoc", nillable = true)
    @ElementList(name = "CbteAsocs", entry = "CbteAsoc", type = CbteAsoc.class, inline = true)
    protected List<CbteAsoc> cbteAsoc;

    /**
     * Gets the value of the cbteAsoc property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cbteAsoc property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getCbteAsoc().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CbteAsoc }
     */
    public List<CbteAsoc> getCbteAsoc() {
        if (cbteAsoc == null) {
            cbteAsoc = new ArrayList<CbteAsoc>();
        }
        return this.cbteAsoc;
    }

}
