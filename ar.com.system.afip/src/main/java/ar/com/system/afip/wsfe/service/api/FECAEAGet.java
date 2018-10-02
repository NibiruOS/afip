package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Clase Java para FECAEAGet complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="FECAEAGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Orden" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="FchVigDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchVigHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchTopeInf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEAGet", propOrder = {"caea", "periodo", "orden",
        "fchVigDesde", "fchVigHasta", "fchTopeInf", "fchProceso"})
public class FECAEAGet {
    @XmlElement(name = "CAEA")
    @Element(name = "CAEA")
    protected String caea;
    @XmlElement(name = "Periodo")
    @Element(name = "Periodo")
    protected int periodo;
    @XmlElement(name = "Orden")
    @Element(name = "Orden")
    protected short orden;
    @XmlElement(name = "FchVigDesde")
    @Element(name = "FchVigDesde")
    protected String fchVigDesde;
    @XmlElement(name = "FchVigHasta")
    @Element(name = "FchVigHasta")
    protected String fchVigHasta;
    @XmlElement(name = "FchTopeInf")
    @Element(name = "FchTopeInf")
    protected String fchTopeInf;
    @XmlElement(name = "FchProceso")
    @Element(name = "FchProceso")
    protected String fchProceso;

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

    /**
     * Obtiene el valor de la propiedad fchVigDesde.
     *
     * @return possible object is {@link String }
     */
    public String getFchVigDesde() {
        return fchVigDesde;
    }

    /**
     * Define el valor de la propiedad fchVigDesde.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchVigDesde(String value) {
        this.fchVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fchVigHasta.
     *
     * @return possible object is {@link String }
     */
    public String getFchVigHasta() {
        return fchVigHasta;
    }

    /**
     * Define el valor de la propiedad fchVigHasta.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchVigHasta(String value) {
        this.fchVigHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fchTopeInf.
     *
     * @return possible object is {@link String }
     */
    public String getFchTopeInf() {
        return fchTopeInf;
    }

    /**
     * Define el valor de la propiedad fchTopeInf.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchTopeInf(String value) {
        this.fchTopeInf = value;
    }

    /**
     * Obtiene el valor de la propiedad fchProceso.
     *
     * @return possible object is {@link String }
     */
    public String getFchProceso() {
        return fchProceso;
    }

    /**
     * Define el valor de la propiedad fchProceso.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchProceso(String value) {
        this.fchProceso = value;
    }

}
