package ar.com.system.afip.wsfe.service.api;

import ar.com.system.afip.wsaa.service.api.Credentials;
import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 *
 * Clase Java para FEAuthRequest complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="FEAuthRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEAuthRequest", propOrder = {"token", "sign", "cuit"})
public class FEAuthRequest {
    @XmlElement(name = "Token")
    @Element(name = "Token")
    protected String token;
    @XmlElement(name = "Sign")
    @Element(name = "Sign")
    protected String sign;
    @XmlElement(name = "Cuit")
    @Element(name = "Cuit")
    protected long cuit;

    public static FEAuthRequest fromCredentials(Credentials credentials,
                                                String cuit) {
        checkNotNull(credentials);
        checkNotNull(cuit);
        return new FEAuthRequest(credentials.getToken(), credentials.getSign(),
                Long.parseLong(cuit));
    }

    private FEAuthRequest(String token, String sign, long cuit) {
        this.token = checkNotNull(token);
        this.sign = checkNotNull(sign);
        this.cuit = cuit;
    }

    /**
     * Obtiene el valor de la propiedad token.
     *
     * @return possible object is {@link String }
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     *
     * @param value allowed object is {@link String }
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad sign.
     *
     * @return possible object is {@link String }
     */
    public String getSign() {
        return sign;
    }

    /**
     * Define el valor de la propiedad sign.
     *
     * @param value allowed object is {@link String }
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Obtiene el valor de la propiedad cuit.
     */
    public long getCuit() {
        return cuit;
    }

    /**
     * Define el valor de la propiedad cuit.
     */
    public void setCuit(long value) {
        this.cuit = value;
    }

}
