
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * <p>Clase Java para ConsultarCAEAEntreFechasRequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ConsultarCAEAEntreFechasRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCAEAEntreFechasRequestType", propOrder = {
        "authRequest",
        "fechaDesde",
        "fechaHasta"
})
@Root(name = "consultarCAEAEntreFechasRequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class ConsultarCAEAEntreFechasRequestType {

    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected Date fechaDesde;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected Date fechaHasta;

    public ConsultarCAEAEntreFechasRequestType(AuthRequestType authRequest, Date fechaDesde, Date fechaHasta) {
        this.authRequest = checkNotNull(authRequest);
        this.fechaDesde = checkNotNull(fechaDesde);
        this.fechaHasta = checkNotNull(fechaHasta);
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
     * Obtiene el valor de la propiedad fechaDesde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public Date getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaDesde(Date value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public Date getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaHasta(Date value) {
        this.fechaHasta = value;
    }

}
