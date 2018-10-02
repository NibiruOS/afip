
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Clase Java para ComprobanteType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ComprobanteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *         &lt;element name="numeroComprobante" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroComprobanteSimpleType"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="codigoTipoAutorizacion" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}CodigoTipoAutorizacionSimpleType" minOccurs="0"/>
 *         &lt;element name="codigoAutorizacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="codigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importeGravado" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeNoGravado" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeExento" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeSubtotal" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteSubtotalSimpleType"/>
 *         &lt;element name="importeOtrosTributos" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteTotalSimpleType" minOccurs="0"/>
 *         &lt;element name="importeTotal" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ImporteTotalSimpleType"/>
 *         &lt;element name="codigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cotizacionMoneda" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoConcepto" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fechaServicioDesde" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fechaServicioHasta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fechaVencimientoPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="arrayComprobantesAsociados" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayComprobantesAsociadosType" minOccurs="0"/>
 *         &lt;element name="arrayOtrosTributos" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayOtrosTributosType" minOccurs="0"/>
 *         &lt;element name="arrayItems" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayItemsType"/>
 *         &lt;element name="arraySubtotalesIVA" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArraySubtotalesIVAType" minOccurs="0"/>
 *         &lt;element name="arrayDatosAdicionales" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayDatosAdicionalesType" minOccurs="0"/>
 *         &lt;element name="arrayCompradores" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCompradoresType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobanteType", propOrder = {
        "codigoTipoComprobante",
        "numeroPuntoVenta",
        "numeroComprobante",
        "fechaEmision",
        "codigoTipoAutorizacion",
        "codigoAutorizacion",
        "fechaVencimiento",
        "codigoTipoDocumento",
        "numeroDocumento",
        "importeGravado",
        "importeNoGravado",
        "importeExento",
        "importeSubtotal",
        "importeOtrosTributos",
        "importeTotal",
        "codigoMoneda",
        "cotizacionMoneda",
        "observaciones",
        "codigoConcepto",
        "fechaServicioDesde",
        "fechaServicioHasta",
        "fechaVencimientoPago",
        "arrayComprobantesAsociados",
        "arrayOtrosTributos",
        "arrayItems",
        "arraySubtotalesIVA",
        "arrayDatosAdicionales",
        "arrayCompradores"
})
public class ComprobanteType {

    @Element
    protected short codigoTipoComprobante;
    @Element
    protected short numeroPuntoVenta;
    @XmlSchemaType(name = "long")
    @Element
    protected int numeroComprobante;
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaEmision;
    @XmlSchemaType(name = "string")
    @Element
    protected CodigoTipoAutorizacionSimpleType codigoTipoAutorizacion;
    @Element
    protected Long codigoAutorizacion;
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaVencimiento;
    @Element
    protected Short codigoTipoDocumento;
    @Element
    protected Long numeroDocumento;
    @Element
    protected BigDecimal importeGravado;
    @Element
    protected BigDecimal importeNoGravado;
    @Element
    protected BigDecimal importeExento;
    @XmlElement(required = true)
    @Element
    protected BigDecimal importeSubtotal;
    @Element
    protected BigDecimal importeOtrosTributos;
    @XmlElement(required = true)
    @Element
    protected BigDecimal importeTotal;
    @XmlElement(required = true)
    @Element
    protected String codigoMoneda;
    @XmlElement(required = true)
    @Element
    protected BigDecimal cotizacionMoneda;
    @Element
    protected String observaciones;
    @Element
    protected short codigoConcepto;
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaServicioDesde;
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaServicioHasta;
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaVencimientoPago;
    @Element
    protected ArrayComprobantesAsociadosType arrayComprobantesAsociados;
    @Element
    protected ArrayOtrosTributosType arrayOtrosTributos;
    @XmlElement(required = true)
    @Element
    protected ArrayItemsType arrayItems;
    @Element
    protected ArraySubtotalesIVAType arraySubtotalesIVA;
    @Element
    protected ArrayDatosAdicionalesType arrayDatosAdicionales;
    @Element
    protected ArrayCompradoresType arrayCompradores;

    /**
     * Obtiene el valor de la propiedad codigoTipoComprobante.
     */
    public short getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    /**
     * Define el valor de la propiedad codigoTipoComprobante.
     */
    public void setCodigoTipoComprobante(short value) {
        this.codigoTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuntoVenta.
     */
    public short getNumeroPuntoVenta() {
        return numeroPuntoVenta;
    }

    /**
     * Define el valor de la propiedad numeroPuntoVenta.
     */
    public void setNumeroPuntoVenta(short value) {
        this.numeroPuntoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     */
    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     */
    public void setNumeroComprobante(int value) {
        this.numeroComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoAutorizacion.
     *
     * @return possible object is
     * {@link CodigoTipoAutorizacionSimpleType }
     */
    public CodigoTipoAutorizacionSimpleType getCodigoTipoAutorizacion() {
        return codigoTipoAutorizacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoAutorizacion.
     *
     * @param value allowed object is
     *              {@link CodigoTipoAutorizacionSimpleType }
     */
    public void setCodigoTipoAutorizacion(CodigoTipoAutorizacionSimpleType value) {
        this.codigoTipoAutorizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAutorizacion.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * Define el valor de la propiedad codigoAutorizacion.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCodigoAutorizacion(Long value) {
        this.codigoAutorizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setCodigoTipoDocumento(Short value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setNumeroDocumento(Long value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGravado.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteGravado() {
        return importeGravado;
    }

    /**
     * Define el valor de la propiedad importeGravado.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteGravado(BigDecimal value) {
        this.importeGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad importeNoGravado.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteNoGravado() {
        return importeNoGravado;
    }

    /**
     * Define el valor de la propiedad importeNoGravado.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteNoGravado(BigDecimal value) {
        this.importeNoGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad importeExento.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteExento() {
        return importeExento;
    }

    /**
     * Define el valor de la propiedad importeExento.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteExento(BigDecimal value) {
        this.importeExento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeSubtotal.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteSubtotal() {
        return importeSubtotal;
    }

    /**
     * Define el valor de la propiedad importeSubtotal.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteSubtotal(BigDecimal value) {
        this.importeSubtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad importeOtrosTributos.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteOtrosTributos() {
        return importeOtrosTributos;
    }

    /**
     * Define el valor de la propiedad importeOtrosTributos.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteOtrosTributos(BigDecimal value) {
        this.importeOtrosTributos = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setImporteTotal(BigDecimal value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacionMoneda.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getCotizacionMoneda() {
        return cotizacionMoneda;
    }

    /**
     * Define el valor de la propiedad cotizacionMoneda.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setCotizacionMoneda(BigDecimal value) {
        this.cotizacionMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConcepto.
     */
    public short getCodigoConcepto() {
        return codigoConcepto;
    }

    /**
     * Define el valor de la propiedad codigoConcepto.
     */
    public void setCodigoConcepto(short value) {
        this.codigoConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaServicioDesde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaServicioDesde() {
        return fechaServicioDesde;
    }

    /**
     * Define el valor de la propiedad fechaServicioDesde.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaServicioDesde(XMLGregorianCalendar value) {
        this.fechaServicioDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaServicioHasta.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaServicioHasta() {
        return fechaServicioHasta;
    }

    /**
     * Define el valor de la propiedad fechaServicioHasta.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaServicioHasta(XMLGregorianCalendar value) {
        this.fechaServicioHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoPago.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoPago.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaVencimientoPago(XMLGregorianCalendar value) {
        this.fechaVencimientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayComprobantesAsociados.
     *
     * @return possible object is
     * {@link ArrayComprobantesAsociadosType }
     */
    public ArrayComprobantesAsociadosType getArrayComprobantesAsociados() {
        return arrayComprobantesAsociados;
    }

    /**
     * Define el valor de la propiedad arrayComprobantesAsociados.
     *
     * @param value allowed object is
     *              {@link ArrayComprobantesAsociadosType }
     */
    public void setArrayComprobantesAsociados(ArrayComprobantesAsociadosType value) {
        this.arrayComprobantesAsociados = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayOtrosTributos.
     *
     * @return possible object is
     * {@link ArrayOtrosTributosType }
     */
    public ArrayOtrosTributosType getArrayOtrosTributos() {
        return arrayOtrosTributos;
    }

    /**
     * Define el valor de la propiedad arrayOtrosTributos.
     *
     * @param value allowed object is
     *              {@link ArrayOtrosTributosType }
     */
    public void setArrayOtrosTributos(ArrayOtrosTributosType value) {
        this.arrayOtrosTributos = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayItems.
     *
     * @return possible object is
     * {@link ArrayItemsType }
     */
    public ArrayItemsType getArrayItems() {
        return arrayItems;
    }

    /**
     * Define el valor de la propiedad arrayItems.
     *
     * @param value allowed object is
     *              {@link ArrayItemsType }
     */
    public void setArrayItems(ArrayItemsType value) {
        this.arrayItems = value;
    }

    /**
     * Obtiene el valor de la propiedad arraySubtotalesIVA.
     *
     * @return possible object is
     * {@link ArraySubtotalesIVAType }
     */
    public ArraySubtotalesIVAType getArraySubtotalesIVA() {
        return arraySubtotalesIVA;
    }

    /**
     * Define el valor de la propiedad arraySubtotalesIVA.
     *
     * @param value allowed object is
     *              {@link ArraySubtotalesIVAType }
     */
    public void setArraySubtotalesIVA(ArraySubtotalesIVAType value) {
        this.arraySubtotalesIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayDatosAdicionales.
     *
     * @return possible object is
     * {@link ArrayDatosAdicionalesType }
     */
    public ArrayDatosAdicionalesType getArrayDatosAdicionales() {
        return arrayDatosAdicionales;
    }

    /**
     * Define el valor de la propiedad arrayDatosAdicionales.
     *
     * @param value allowed object is
     *              {@link ArrayDatosAdicionalesType }
     */
    public void setArrayDatosAdicionales(ArrayDatosAdicionalesType value) {
        this.arrayDatosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayCompradores.
     *
     * @return possible object is
     * {@link ArrayCompradoresType }
     */
    public ArrayCompradoresType getArrayCompradores() {
        return arrayCompradores;
    }

    /**
     * Define el valor de la propiedad arrayCompradores.
     *
     * @param value allowed object is
     *              {@link ArrayCompradoresType }
     */
    public void setArrayCompradores(ArrayCompradoresType value) {
        this.arrayCompradores = value;
    }

}
