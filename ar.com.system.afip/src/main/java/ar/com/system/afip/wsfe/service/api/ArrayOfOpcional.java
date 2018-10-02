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
 * Clase Java para ArrayOfOpcional complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfOpcional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opcional" type="{http://ar.gov.afip.dif.FEV1/}Opcional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpcional", propOrder = {"opcional"})
public class ArrayOfOpcional {
    @XmlElement(name = "Opcional", nillable = true)
    @ElementList(name = "Opcionales", entry = "Opcional", type = Opcional.class, inline = true)
    protected List<Opcional> opcional;

    /**
     * Gets the value of the opcional property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the opcional property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getOpcional().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link Opcional }
     */
    public List<Opcional> getOpcional() {
        if (opcional == null) {
            opcional = new ArrayList<Opcional>();
        }
        return this.opcional;
    }

}
