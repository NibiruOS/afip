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
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Orden" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "periodo", "orden"})
@XmlRootElement(name = "FECAEAConsultar")
@Root(name = "FECAEAConsultar")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FECAEAConsultar {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;
    @XmlElement(name = "Periodo")
    @Element(name = "Periodo")
    protected int periodo;
    @XmlElement(name = "Orden")
    @Element(name = "Orden")
    protected short orden;

    public FECAEAConsultar() {
    }

    public FECAEAConsultar(@Nonnull FEAuthRequest auth,
                           int periodo,
                           short orden) {
        this.auth = checkNotNull(auth);
        this.periodo = periodo;
        this.orden = orden;
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
     * Obtiene el valor de la propiedad periodo.
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     */
    public void setPeriodo(int value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     */
    public short getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     */
    public void setOrden(short value) {
        this.orden = value;
    }

}
