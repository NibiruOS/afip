
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DummyResponseType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="DummyResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appserver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authserver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbserver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DummyResponseType", propOrder = {
        "appserver",
        "authserver",
        "dbserver"
})
public class DummyResponseType {

    @XmlElement(required = true)
    @Element
    protected String appserver;
    @XmlElement(required = true)
    @Element
    protected String authserver;
    @XmlElement(required = true)
    @Element
    protected String dbserver;

    /**
     * Obtiene el valor de la propiedad appserver.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppserver() {
        return appserver;
    }

    /**
     * Define el valor de la propiedad appserver.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppserver(String value) {
        this.appserver = value;
    }

    /**
     * Obtiene el valor de la propiedad authserver.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuthserver() {
        return authserver;
    }

    /**
     * Define el valor de la propiedad authserver.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuthserver(String value) {
        this.authserver = value;
    }

    /**
     * Obtiene el valor de la propiedad dbserver.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDbserver() {
        return dbserver;
    }

    /**
     * Define el valor de la propiedad dbserver.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDbserver(String value) {
        this.dbserver = value;
    }

}
