
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CAEAResponseType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="CAEAResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaProceso" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaTopeInforme" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="arrayObservaciones" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ArrayCodigosDescripcionesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAEAResponseType", propOrder = {
        "fechaProceso",
        "caea",
        "periodo",
        "orden",
        "fechaDesde",
        "fechaHasta",
        "fechaTopeInforme",
        "arrayObservaciones"
})
public class CAEAResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaProceso;
    @XmlElement(name = "CAEA")
    @Element(name = "CAEA")
    protected long caea;
    @Element
    protected int periodo;
    @Element
    protected short orden;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaDesde;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaHasta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Element
    protected XMLGregorianCalendar fechaTopeInforme;
    @Element
    protected ArrayCodigosDescripcionesType arrayObservaciones;

    /**
     * Obtiene el valor de la propiedad fechaProceso.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Define el valor de la propiedad fechaProceso.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaProceso(XMLGregorianCalendar value) {
        this.fechaProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad caea.
     */
    public long getCAEA() {
        return caea;
    }

    /**
     * Define el valor de la propiedad caea.
     */
    public void setCAEA(long value) {
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
     * Obtiene el valor de la propiedad fechaDesde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaDesde(XMLGregorianCalendar value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaHasta(XMLGregorianCalendar value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTopeInforme.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaTopeInforme() {
        return fechaTopeInforme;
    }

    /**
     * Define el valor de la propiedad fechaTopeInforme.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaTopeInforme(XMLGregorianCalendar value) {
        this.fechaTopeInforme = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayObservaciones.
     *
     * @return possible object is
     * {@link ArrayCodigosDescripcionesType }
     */
    public ArrayCodigosDescripcionesType getArrayObservaciones() {
        return arrayObservaciones;
    }

    /**
     * Define el valor de la propiedad arrayObservaciones.
     *
     * @param value allowed object is
     *              {@link ArrayCodigosDescripcionesType }
     */
    public void setArrayObservaciones(ArrayCodigosDescripcionesType value) {
        this.arrayObservaciones = value;
    }

}
