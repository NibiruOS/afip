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
 * Clase Java para ArrayOfAlicIva complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAlicIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlicIva" type="{http://ar.gov.afip.dif.FEV1/}AlicIva" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlicIva", propOrder = {"alicIva"})
public class ArrayOfAlicIva {
    @XmlElement(name = "AlicIva", nillable = true)
    @ElementList(name = "AlicIvas", entry = "AlicIva", type = AlicIva.class, inline = true)
    protected List<AlicIva> alicIva;

    /**
     * Gets the value of the alicIva property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the alicIva property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAlicIva().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link AlicIva }
     */
    public List<AlicIva> getAlicIva() {
        if (alicIva == null) {
            alicIva = new ArrayList<AlicIva>();
        }
        return this.alicIva;
    }

}
