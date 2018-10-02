package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.ElementList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase Java para ArrayOfFECAEASinMov complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfFECAEASinMov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECAEASinMov" type="{http://ar.gov.afip.dif.FEV1/}FECAEASinMov" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFECAEASinMov", propOrder = {"fecaeaSinMov"})
public class ArrayOfFECAEASinMov {
    @XmlElement(name = "FECAEASinMov", nillable = true)
    @ElementList(name = "FECAEASinMovs", entry = "FECAEASinMov", type = FECAEASinMov.class, inline = true)
    protected List<FECAEASinMov> fecaeaSinMov;

    /**
     * Gets the value of the fecaeaSinMov property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the fecaeaSinMov property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getFECAEASinMov().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link FECAEASinMov }
     */
    public List<FECAEASinMov> getFECAEASinMov() {
        if (fecaeaSinMov == null) {
            fecaeaSinMov = new ArrayList<FECAEASinMov>();
        }
        return this.fecaeaSinMov;
    }

}
