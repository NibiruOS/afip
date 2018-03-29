
package ar.com.system.afip.wsmtxca.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayPuntosVentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayPuntosVentaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}PuntoVentaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayPuntosVentaType", propOrder = {
    "puntoVenta"
})
public class ArrayPuntosVentaType {

    protected List<PuntoVentaType> puntoVenta;

    /**
     * Gets the value of the puntoVenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the puntoVenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPuntoVenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PuntoVentaType }
     * 
     * 
     */
    public List<PuntoVentaType> getPuntoVenta() {
        if (puntoVenta == null) {
            puntoVenta = new ArrayList<PuntoVentaType>();
        }
        return this.puntoVenta;
    }

}
