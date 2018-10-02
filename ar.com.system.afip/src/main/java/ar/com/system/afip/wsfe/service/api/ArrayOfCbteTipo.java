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
 * Clase Java para ArrayOfCbteTipo complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfCbteTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbteTipo" type="{http://ar.gov.afip.dif.FEV1/}CbteTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCbteTipo", propOrder = {"cbteTipo"})
public class ArrayOfCbteTipo {
    @XmlElement(name = "CbteTipo", nillable = true)
    @ElementList(name = "CbteTipos", entry = "CbteTipo", type = CbteTipo.class, inline = true)
    protected List<CbteTipo> cbteTipo;

    /**
     * Gets the value of the cbteTipo property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cbteTipo property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getCbteTipo().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CbteTipo }
     */
    public List<CbteTipo> getCbteTipo() {
        if (cbteTipo == null) {
            cbteTipo = new ArrayList<CbteTipo>();
        }
        return this.cbteTipo;
    }

}
