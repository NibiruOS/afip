package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.*;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.FEV1/}FEAuthRequest" minOccurs="0"/>
 *         &lt;element name="FeCAEReq" type="{http://ar.gov.afip.dif.FEV1/}FECAERequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "feCAEReq"})
@XmlRootElement(name = "FECAESolicitar")
@Root(name = "FECAESolicitar")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FECAESolicitar {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;
    @XmlElement(name = "FeCAEReq")
    @Element(name = "FeCAEReq")
    protected FECAERequest feCAEReq;

    public FECAESolicitar() {
    }

    public FECAESolicitar(@Nonnull FEAuthRequest auth,
                          @Nonnull FECAERequest feCAEReq) {
        this.auth = checkNotNull(auth);
        this.feCAEReq = checkNotNull(feCAEReq);
    }

    /**
     * Obtiene el valor de la propiedad auth.
     *
     * @return possible object is {@link FEAuthRequest }
     */
    public FEAuthRequest getAuth() {
        return auth;
    }

    /**
     * Define el valor de la propiedad auth.
     *
     * @param value allowed object is {@link FEAuthRequest }
     */
    public void setAuth(FEAuthRequest value) {
        this.auth = value;
    }

    /**
     * Obtiene el valor de la propiedad feCAEReq.
     *
     * @return possible object is {@link FECAERequest }
     */
    public FECAERequest getFeCAEReq() {
        return feCAEReq;
    }

    /**
     * Define el valor de la propiedad feCAEReq.
     *
     * @param value allowed object is {@link FECAERequest }
     */
    public void setFeCAEReq(FECAERequest value) {
        this.feCAEReq = value;
    }
}
