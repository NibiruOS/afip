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
 * Clase Java para ArrayOfEvt complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfEvt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Evt" type="{http://ar.gov.afip.dif.FEV1/}Evt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEvt", propOrder = {"evt"})
public class ArrayOfEvt {
    @XmlElement(name = "Evt", nillable = true)
    @ElementList(name = "Evts", entry = "Evt", type = Evt.class, inline = true)
    protected List<Evt> evt;

    /**
     * Gets the value of the evt property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the evt property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getEvt().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Evt }
     */
    public List<Evt> getEvt() {
        if (evt == null) {
            evt = new ArrayList<Evt>();
        }
        return this.evt;
    }

}
