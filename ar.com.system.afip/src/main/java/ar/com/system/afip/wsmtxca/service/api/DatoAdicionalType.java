
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatoAdicionalType complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>
 * &lt;complexType name="DatoAdicionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="c1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatoAdicionalType", propOrder = {
    "t",
    "c1",
    "c2",
    "c3",
    "c4",
    "c5",
    "c6"
})
public class DatoAdicionalType {

    @Element
    protected short t;
    @Element
    protected String c1;
    @Element
    protected String c2;
    @Element
    protected String c3;
    @Element
    protected String c4;
    @Element
    protected String c5;
    @Element
    protected String c6;

    /**
     * Obtiene el valor de la propiedad t.
     * 
     */
    public short getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     */
    public void setT(short value) {
        this.t = value;
    }

    /**
     * Obtiene el valor de la propiedad c1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC1() {
        return c1;
    }

    /**
     * Define el valor de la propiedad c1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC1(String value) {
        this.c1 = value;
    }

    /**
     * Obtiene el valor de la propiedad c2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2() {
        return c2;
    }

    /**
     * Define el valor de la propiedad c2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2(String value) {
        this.c2 = value;
    }

    /**
     * Obtiene el valor de la propiedad c3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC3() {
        return c3;
    }

    /**
     * Define el valor de la propiedad c3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC3(String value) {
        this.c3 = value;
    }

    /**
     * Obtiene el valor de la propiedad c4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC4() {
        return c4;
    }

    /**
     * Define el valor de la propiedad c4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC4(String value) {
        this.c4 = value;
    }

    /**
     * Obtiene el valor de la propiedad c5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC5() {
        return c5;
    }

    /**
     * Define el valor de la propiedad c5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC5(String value) {
        this.c5 = value;
    }

    /**
     * Obtiene el valor de la propiedad c6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC6() {
        return c6;
    }

    /**
     * Define el valor de la propiedad c6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC6(String value) {
        this.c6 = value;
    }

}
