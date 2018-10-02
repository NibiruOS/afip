package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para DummyResponse complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="DummyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DbServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DummyResponse", propOrder = {"appServer", "dbServer",
        "authServer"})
public class DummyResponse {
    @XmlElement(name = "AppServer")
    @Element(name = "AppServer")
    protected String appServer;
    @XmlElement(name = "DbServer")
    @Element(name = "DbServer")
    protected String dbServer;
    @XmlElement(name = "AuthServer")
    @Element(name = "AuthServer")
    protected String authServer;

    /**
     * Obtiene el valor de la propiedad appServer.
     *
     * @return possible object is {@link String }
     */
    public String getAppServer() {
        return appServer;
    }

    /**
     * Define el valor de la propiedad appServer.
     *
     * @param value allowed object is {@link String }
     */
    public void setAppServer(String value) {
        this.appServer = value;
    }

    /**
     * Obtiene el valor de la propiedad dbServer.
     *
     * @return possible object is {@link String }
     */
    public String getDbServer() {
        return dbServer;
    }

    /**
     * Define el valor de la propiedad dbServer.
     *
     * @param value allowed object is {@link String }
     */
    public void setDbServer(String value) {
        this.dbServer = value;
    }

    /**
     * Obtiene el valor de la propiedad authServer.
     *
     * @return possible object is {@link String }
     */
    public String getAuthServer() {
        return authServer;
    }

    /**
     * Define el valor de la propiedad authServer.
     *
     * @param value allowed object is {@link String }
     */
    public void setAuthServer(String value) {
        this.authServer = value;
    }

}
