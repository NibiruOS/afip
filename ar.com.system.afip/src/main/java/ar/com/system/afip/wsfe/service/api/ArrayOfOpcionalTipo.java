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
 * Clase Java para ArrayOfOpcionalTipo complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfOpcionalTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpcionalTipo" type="{http://ar.gov.afip.dif.FEV1/}OpcionalTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpcionalTipo", propOrder = {"opcionalTipo"})
public class ArrayOfOpcionalTipo {
    @XmlElement(name = "OpcionalTipo", nillable = true)
    @ElementList(name = "OpcionalTipos", entry = "OpcionalTipo", type = OpcionalTipo.class, inline = true)
    protected List<OpcionalTipo> opcionalTipo;

    /**
     * Gets the value of the opcionalTipo property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the opcionalTipo property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getOpcionalTipo().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link OpcionalTipo }
     */
    public List<OpcionalTipo> getOpcionalTipo() {
        if (opcionalTipo == null) {
            opcionalTipo = new ArrayList<OpcionalTipo>();
        }
        return this.opcionalTipo;
    }

}
