
package ar.com.system.afip.wsmtxca.service.api;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarUltimoComprobanteAutorizadoRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarUltimoComprobanteAutorizadoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="consultaUltimoComprobanteAutorizadoRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ConsultaUltimoComprobanteAutorizadoRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarUltimoComprobanteAutorizadoRequestType", propOrder = {
    "authRequest",
    "consultaUltimoComprobanteAutorizadoRequest"
})
public class ConsultarUltimoComprobanteAutorizadoRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected ConsultaUltimoComprobanteAutorizadoRequestType consultaUltimoComprobanteAutorizadoRequest;
    
	public ConsultarUltimoComprobanteAutorizadoRequestType(AuthRequestType authRequest,
			ConsultaUltimoComprobanteAutorizadoRequestType consultaUltimoComprobanteAutorizadoRequest) {
		this.authRequest = checkNotNull(authRequest);
		this.consultaUltimoComprobanteAutorizadoRequest = checkNotNull(consultaUltimoComprobanteAutorizadoRequest);
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
     * Obtiene el valor de la propiedad consultaUltimoComprobanteAutorizadoRequest.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaUltimoComprobanteAutorizadoRequestType }
     *     
     */
    public ConsultaUltimoComprobanteAutorizadoRequestType getConsultaUltimoComprobanteAutorizadoRequest() {
        return consultaUltimoComprobanteAutorizadoRequest;
    }

    /**
     * Define el valor de la propiedad consultaUltimoComprobanteAutorizadoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaUltimoComprobanteAutorizadoRequestType }
     *     
     */
    public void setConsultaUltimoComprobanteAutorizadoRequest(ConsultaUltimoComprobanteAutorizadoRequestType value) {
        this.consultaUltimoComprobanteAutorizadoRequest = value;
    }

}
