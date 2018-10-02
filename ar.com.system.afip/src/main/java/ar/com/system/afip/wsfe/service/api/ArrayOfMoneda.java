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
 * Clase Java para ArrayOfMoneda complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfMoneda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Moneda" type="{http://ar.gov.afip.dif.FEV1/}Moneda" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMoneda", propOrder = {"moneda"})
public class ArrayOfMoneda {
    @XmlElement(name = "Moneda", nillable = true)
    @ElementList(name = "Monedas", entry = "Moneda", type = Moneda.class, inline = true)
    protected List<Moneda> moneda;

    /**
     * Gets the value of the moneda property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the moneda property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getMoneda().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link Moneda }
     */
    public List<Moneda> getMoneda() {
        if (moneda == null) {
            moneda = new ArrayList<Moneda>();
        }
        return this.moneda;
    }

}
