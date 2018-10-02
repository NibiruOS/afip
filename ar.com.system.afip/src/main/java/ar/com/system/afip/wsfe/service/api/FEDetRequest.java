package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * <p>
 * Clase Java para FEDetRequest complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FEDetRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocNro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CbteDesde" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CbteHasta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CbteFch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImpTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImpTotConc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImpNeto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImpOpEx" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImpTrib" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImpIVA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FchServDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchServHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchVtoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonCotiz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CbtesAsoc" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfCbteAsoc" minOccurs="0"/>
 *         &lt;element name="Tributos" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfTributo" minOccurs="0"/>
 *         &lt;element name="Iva" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfAlicIva" minOccurs="0"/>
 *         &lt;element name="Opcionales" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfOpcional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEDetRequest", propOrder = {"concepto", "docTipo", "docNro",
        "cbteDesde", "cbteHasta", "cbteFch", "impTotal", "impTotConc",
        "impNeto", "impOpEx", "impTrib", "impIVA", "fchServDesde",
        "fchServHasta", "fchVtoPago", "monId", "monCotiz", "cbtesAsoc",
        "tributos", "iva", "opcionales"})
@XmlSeeAlso({FECAEADetRequest.class, FECAEDetRequest.class})
public class FEDetRequest {
    @XmlElement(name = "Concepto")
    @Element(name = "Concepto")
    protected int concepto;
    @XmlElement(name = "DocTipo")
    @Element(name = "DocTipo")
    protected int docTipo;
    @XmlElement(name = "DocNro")
    @Element(name = "DocNro")
    protected long docNro;
    @XmlElement(name = "CbteDesde")
    @Element(name = "CbteDesde")
    protected long cbteDesde;
    @XmlElement(name = "CbteHasta")
    @Element(name = "CbteHasta")
    protected long cbteHasta;
    @XmlElement(name = "CbteFch")
    @Element(name = "CbteFch")
    protected String cbteFch;
    @XmlElement(name = "ImpTotal")
    @Element(name = "ImpTotal")
    protected double impTotal;
    @XmlElement(name = "ImpTotConc")
    @Element(name = "ImpTotConc")
    protected double impTotConc;
    @XmlElement(name = "ImpNeto")
    @Element(name = "ImpNeto")
    protected double impNeto;
    @XmlElement(name = "ImpOpEx")
    @Element(name = "ImpOpEx")
    protected double impOpEx;
    @XmlElement(name = "ImpTrib")
    @Element(name = "ImpTrib")
    protected double impTrib;
    @XmlElement(name = "ImpIVA")
    @Element(name = "ImpIVA")
    protected double impIVA;
    @XmlElement(name = "FchServDesde")
    @Element(name = "FchServDesde", required = false)
    protected String fchServDesde;
    @XmlElement(name = "FchServHasta")
    @Element(name = "FchServHasta", required = false)
    protected String fchServHasta;
    @XmlElement(name = "FchVtoPago")
    @Element(name = "FchVtoPago", required = false)
    protected String fchVtoPago;
    @XmlElement(name = "MonId")
    @Element(name = "MonId")
    protected String monId;
    @XmlElement(name = "MonCotiz")
    @Element(name = "MonCotiz")
    protected double monCotiz;
    @XmlElement(name = "CbtesAsoc")
    @Element(name = "CbtesAsoc", required = false)
    protected ArrayOfCbteAsoc cbtesAsoc;
    @XmlElement(name = "Tributos")
    @Element(name = "Tributos", required = false)
    protected ArrayOfTributo tributos;
    @XmlElement(name = "Iva")
    @Element(name = "Iva")
    protected ArrayOfAlicIva iva;
    @XmlElement(name = "Opcionales")
    @Element(name = "Opcionales", required = false)
    protected ArrayOfOpcional opcionales;

    /**
     * Obtiene el valor de la propiedad concepto.
     */
    public int getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     */
    public void setConcepto(int value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad docTipo.
     */
    public int getDocTipo() {
        return docTipo;
    }

    /**
     * Define el valor de la propiedad docTipo.
     */
    public void setDocTipo(int value) {
        this.docTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad docNro.
     */
    public long getDocNro() {
        return docNro;
    }

    /**
     * Define el valor de la propiedad docNro.
     */
    public void setDocNro(long value) {
        this.docNro = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteDesde.
     */
    public long getCbteDesde() {
        return cbteDesde;
    }

    /**
     * Define el valor de la propiedad cbteDesde.
     */
    public void setCbteDesde(long value) {
        this.cbteDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteHasta.
     */
    public long getCbteHasta() {
        return cbteHasta;
    }

    /**
     * Define el valor de la propiedad cbteHasta.
     */
    public void setCbteHasta(long value) {
        this.cbteHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteFch.
     *
     * @return possible object is {@link String }
     */
    public String getCbteFch() {
        return cbteFch;
    }

    public Date getCbteFchDate() {
        return DateUtil.TO_DATE.apply(getCbteFch());
    }

    /**
     * Define el valor de la propiedad cbteFch.
     *
     * @param value allowed object is {@link String }
     */
    public void setCbteFch(String value) {
        this.cbteFch = value;
    }

    public void setCbteFchDate(Date cbteFch) {
        setCbteFch(DateUtil.TO_STRING.apply(cbteFch));
    }

    /**
     * Obtiene el valor de la propiedad impTotal.
     */
    public double getImpTotal() {
        return impTotal;
    }

    /**
     * Define el valor de la propiedad impTotal.
     */
    public void setImpTotal(double value) {
        this.impTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad impTotConc.
     */
    public double getImpTotConc() {
        return impTotConc;
    }

    /**
     * Define el valor de la propiedad impTotConc.
     */
    public void setImpTotConc(double value) {
        this.impTotConc = value;
    }

    /**
     * Obtiene el valor de la propiedad impNeto.
     */
    public double getImpNeto() {
        return impNeto;
    }

    /**
     * Define el valor de la propiedad impNeto.
     */
    public void setImpNeto(double value) {
        this.impNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad impOpEx.
     */
    public double getImpOpEx() {
        return impOpEx;
    }

    /**
     * Define el valor de la propiedad impOpEx.
     */
    public void setImpOpEx(double value) {
        this.impOpEx = value;
    }

    /**
     * Obtiene el valor de la propiedad impTrib.
     */
    public double getImpTrib() {
        return impTrib;
    }

    /**
     * Define el valor de la propiedad impTrib.
     */
    public void setImpTrib(double value) {
        this.impTrib = value;
    }

    /**
     * Obtiene el valor de la propiedad impIVA.
     */
    public double getImpIVA() {
        return impIVA;
    }

    /**
     * Define el valor de la propiedad impIVA.
     */
    public void setImpIVA(double value) {
        this.impIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad fchServDesde.
     *
     * @return possible object is {@link String }
     */
    public String getFchServDesde() {
        return fchServDesde;
    }

    /**
     * Define el valor de la propiedad fchServDesde.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchServDesde(String value) {
        this.fchServDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fchServHasta.
     *
     * @return possible object is {@link String }
     */
    public String getFchServHasta() {
        return fchServHasta;
    }

    /**
     * Define el valor de la propiedad fchServHasta.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchServHasta(String value) {
        this.fchServHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fchVtoPago.
     *
     * @return possible object is {@link String }
     */
    public String getFchVtoPago() {
        return fchVtoPago;
    }

    /**
     * Define el valor de la propiedad fchVtoPago.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchVtoPago(String value) {
        this.fchVtoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad monId.
     *
     * @return possible object is {@link String }
     */
    public String getMonId() {
        return monId;
    }

    /**
     * Define el valor de la propiedad monId.
     *
     * @param value allowed object is {@link String }
     */
    public void setMonId(String value) {
        this.monId = value;
    }

    /**
     * Obtiene el valor de la propiedad monCotiz.
     */
    public double getMonCotiz() {
        return monCotiz;
    }

    /**
     * Define el valor de la propiedad monCotiz.
     */
    public void setMonCotiz(double value) {
        this.monCotiz = value;
    }

    /**
     * Obtiene el valor de la propiedad cbtesAsoc.
     *
     * @return possible object is {@link ArrayOfCbteAsoc }
     */
    public ArrayOfCbteAsoc getCbtesAsoc() {
        return cbtesAsoc;
    }

    /**
     * Define el valor de la propiedad cbtesAsoc.
     *
     * @param value allowed object is {@link ArrayOfCbteAsoc }
     */
    public void setCbtesAsoc(ArrayOfCbteAsoc value) {
        this.cbtesAsoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tributos.
     *
     * @return possible object is {@link ArrayOfTributo }
     */
    public ArrayOfTributo getTributos() {
        return tributos;
    }

    /**
     * Define el valor de la propiedad tributos.
     *
     * @param value allowed object is {@link ArrayOfTributo }
     */
    public void setTributos(ArrayOfTributo value) {
        this.tributos = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     *
     * @return possible object is {@link ArrayOfAlicIva }
     */
    public ArrayOfAlicIva getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     *
     * @param value allowed object is {@link ArrayOfAlicIva }
     */
    public void setIva(ArrayOfAlicIva value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionales.
     *
     * @return possible object is {@link ArrayOfOpcional }
     */
    public ArrayOfOpcional getOpcionales() {
        return opcionales;
    }

    /**
     * Define el valor de la propiedad opcionales.
     *
     * @param value allowed object is {@link ArrayOfOpcional }
     */
    public void setOpcionales(ArrayOfOpcional value) {
        this.opcionales = value;
    }

}
