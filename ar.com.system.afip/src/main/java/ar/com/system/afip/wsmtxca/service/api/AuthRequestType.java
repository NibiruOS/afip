
package ar.com.system.afip.wsmtxca.service.api;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ar.com.system.afip.wsaa.service.api.Credentials;
import org.simpleframework.xml.Element;


/**
 * <p>Clase Java para AuthRequestType complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>
 * &lt;complexType name="AuthRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuitRepresentada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthRequestType", propOrder = {
    "token",
    "sign",
    "cuitRepresentada"
})
public class AuthRequestType {

    @XmlElement(required = true)
    @Element
    protected String token;
    @XmlElement(required = true)
    @Element
    protected String sign;
    @Element
    protected long cuitRepresentada;

	public static AuthRequestType fromCredentials(Credentials credentials,
			String cuit) {
		checkNotNull(credentials);
		checkNotNull(cuit);
		return new AuthRequestType(credentials.getToken(), credentials.getSign(),
				Long.parseLong(cuit));
	}

	private AuthRequestType(String token, String sign, long cuit) {
		this.token = checkNotNull(token);
		this.sign = checkNotNull(sign);
		this.cuitRepresentada = cuit;
	}

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad sign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Define el valor de la propiedad sign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitRepresentada.
     * 
     */
    public long getCuitRepresentada() {
        return cuitRepresentada;
    }

    /**
     * Define el valor de la propiedad cuitRepresentada.
     * 
     */
    public void setCuitRepresentada(long value) {
        this.cuitRepresentada = value;
    }

}
