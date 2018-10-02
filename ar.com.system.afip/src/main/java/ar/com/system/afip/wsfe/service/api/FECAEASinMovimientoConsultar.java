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
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "caea", "ptoVta"})
@XmlRootElement(name = "FECAEASinMovimientoConsultar")
@Root(name = "FECAEASinMovimientoConsultar")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FECAEASinMovimientoConsultar {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;
    @XmlElement(name = "CAEA")
    @Element(name = "CAEA")
    protected String caea;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;

    public FECAEASinMovimientoConsultar() {
    }

    public FECAEASinMovimientoConsultar(@Nonnull FEAuthRequest auth,
                                        String caea,
                                        int ptoVta) {
        this.auth = checkNotNull(auth);
        this.caea = caea;
        this.ptoVta = ptoVta;
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
     * Obtiene el valor de la propiedad caea.
     *
     * @return possible object is {@link String }
     */
    public String getCAEA() {
        return caea;
    }

    /**
     * Define el valor de la propiedad caea.
     *
     * @param value allowed object is {@link String }
     */
    public void setCAEA(String value) {
        this.caea = value;
    }

    /**
     * Obtiene el valor de la propiedad ptoVta.
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Define el valor de la propiedad ptoVta.
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

}
