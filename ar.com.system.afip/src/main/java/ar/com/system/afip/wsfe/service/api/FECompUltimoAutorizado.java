package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

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
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "ptoVta", "cbteTipo"})
@XmlRootElement(name = "FECompUltimoAutorizado")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FECompUltimoAutorizado {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "CbteTipo")
    @Element(name = "CbteTipo")
    protected int cbteTipo;

    public FECompUltimoAutorizado() {
    }

    public FECompUltimoAutorizado(@Nonnull FEAuthRequest auth,
                                  int ptoVta,
                                  int cbteTipo) {
        this.auth = checkNotNull(auth);
        this.ptoVta = ptoVta;
        this.cbteTipo = cbteTipo;
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

    /**
     * Obtiene el valor de la propiedad cbteTipo.
     */
    public int getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Define el valor de la propiedad cbteTipo.
     */
    public void setCbteTipo(int value) {
        this.cbteTipo = value;
    }

}
