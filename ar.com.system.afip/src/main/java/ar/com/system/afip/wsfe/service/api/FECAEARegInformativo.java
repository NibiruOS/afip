package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.*;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 *
 * Clase Java para anonymous complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.FEV1/}FEAuthRequest" minOccurs="0"/>
 *         &lt;element name="FeCAEARegInfReq" type="{http://ar.gov.afip.dif.FEV1/}FECAEARequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "feCAEARegInfReq"})
@XmlRootElement(name = "FECAEARegInformativo")
@Root(name = "FECAEARegInformativo")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FECAEARegInformativo {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;
    @XmlElement(name = "FeCAEARegInfReq")
    @Element(name = "FeCAEARegInfReq")
    protected FECAEARequest feCAEARegInfReq;

    public FECAEARegInformativo() {
    }

    public FECAEARegInformativo(@Nonnull FEAuthRequest auth,
                                @Nonnull FECAEARequest feCAEARegInfReq) {
        this.auth = checkNotNull(auth);
        this.feCAEARegInfReq = checkNotNull(feCAEARegInfReq);
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
     * Obtiene el valor de la propiedad feCAEARegInfReq.
     *
     * @return possible object is {@link FECAEARequest }
     */
    public FECAEARequest getFeCAEARegInfReq() {
        return feCAEARegInfReq;
    }

    /**
     * Define el valor de la propiedad feCAEARegInfReq.
     *
     * @param value allowed object is {@link FECAEARequest }
     */
    public void setFeCAEARegInfReq(FECAEARequest value) {
        this.feCAEARegInfReq = value;
    }

}
