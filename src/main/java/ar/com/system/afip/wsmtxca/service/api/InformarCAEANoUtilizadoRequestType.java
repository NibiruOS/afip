
package ar.com.system.afip.wsmtxca.service.api;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformarCAEANoUtilizadoRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformarCAEANoUtilizadoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarCAEANoUtilizadoRequestType", propOrder = {
    "authRequest",
    "caea"
})
public class InformarCAEANoUtilizadoRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(name = "CAEA")
    protected long caea;
    
    public InformarCAEANoUtilizadoRequestType(AuthRequestType authRequest, long caea) {
		this.authRequest = checkNotNull(authRequest);
		this.caea = checkNotNull(caea);
	}

	/**
     * Obtiene el valor de la propiedad authRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuthRequestType }
     *     
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRequestType }
     *     
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad caea.
     * 
     */
    public long getCAEA() {
        return caea;
    }

    /**
     * Define el valor de la propiedad caea.
     * 
     */
    public void setCAEA(long value) {
        this.caea = value;
    }

}
