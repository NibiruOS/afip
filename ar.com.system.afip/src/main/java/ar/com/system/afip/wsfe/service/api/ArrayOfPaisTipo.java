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
 * Clase Java para ArrayOfPaisTipo complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfPaisTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaisTipo" type="{http://ar.gov.afip.dif.FEV1/}PaisTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaisTipo", propOrder = {"paisTipo"})
public class ArrayOfPaisTipo {
    @XmlElement(name = "PaisTipo", nillable = true)
    @ElementList(name = "PaisTipos", entry = "PaisTipo", type = PaisTipo.class, inline = true)
    protected List<PaisTipo> paisTipo;

    /**
     * Gets the value of the paisTipo property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the paisTipo property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getPaisTipo().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PaisTipo }
     */
    public List<PaisTipo> getPaisTipo() {
        if (paisTipo == null) {
            paisTipo = new ArrayList<PaisTipo>();
        }
        return this.paisTipo;
    }

}
