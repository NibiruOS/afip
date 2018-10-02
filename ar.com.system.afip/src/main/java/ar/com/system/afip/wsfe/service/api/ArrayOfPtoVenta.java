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
 * Clase Java para ArrayOfPtoVenta complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfPtoVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PtoVenta" type="{http://ar.gov.afip.dif.FEV1/}PtoVenta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPtoVenta", propOrder = {"ptoVenta"})
public class ArrayOfPtoVenta {
    @XmlElement(name = "PtoVenta", nillable = true)
    @ElementList(name = "PtoVentas", entry = "PtoVenta", type = PtoVenta.class, inline = true)
    protected List<PtoVenta> ptoVenta;

    /**
     * Gets the value of the ptoVenta property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ptoVenta property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getPtoVenta().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PtoVenta }
     */
    public List<PtoVenta> getPtoVenta() {
        if (ptoVenta == null) {
            ptoVenta = new ArrayList<PtoVenta>();
        }
        return this.ptoVenta;
    }

}
