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
 * Clase Java para ArrayOfTributo complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTributo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tributo" type="{http://ar.gov.afip.dif.FEV1/}Tributo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTributo", propOrder = {"tributo"})
public class ArrayOfTributo {
    @XmlElement(name = "Tributo", nillable = true)
    @ElementList(name = "Tributos", entry = "Tributo", type = Tributo.class, inline = true)
    protected List<Tributo> tributo;

    /**
     * Gets the value of the tributo property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the tributo property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTributo().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link Tributo }
     */
    public List<Tributo> getTributo() {
        if (tributo == null) {
            tributo = new ArrayList<Tributo>();
        }
        return this.tributo;
    }

}
