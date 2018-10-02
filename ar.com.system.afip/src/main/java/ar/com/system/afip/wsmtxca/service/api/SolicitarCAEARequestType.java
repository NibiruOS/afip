
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SolicitarCAEARequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="SolicitarCAEARequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="solicitudCAEA" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}SolicitudCAEAType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitarCAEARequestType", propOrder = {
        "authRequest",
        "solicitudCAEA"
})
@Root(name = "solicitarCAEARequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class SolicitarCAEARequestType {
    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    @Element
    protected SolicitudCAEAType solicitudCAEA;


    public SolicitarCAEARequestType(AuthRequestType authRequest, SolicitudCAEAType solicitudCAEA) {
        this.authRequest = authRequest;
        this.solicitudCAEA = solicitudCAEA;
    }

    /**
     * Obtiene el valor de la propiedad authRequest.
     *
     * @return possible object is
     * {@link AuthRequestType }
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     *
     * @param value allowed object is
     *              {@link AuthRequestType }
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitudCAEA.
     *
     * @return possible object is
     * {@link SolicitudCAEAType }
     */
    public SolicitudCAEAType getSolicitudCAEA() {
        return solicitudCAEA;
    }

    /**
     * Define el valor de la propiedad solicitudCAEA.
     *
     * @param value allowed object is
     *              {@link SolicitudCAEAType }
     */
    public void setSolicitudCAEA(SolicitudCAEAType value) {
        this.solicitudCAEA = value;
    }

}
