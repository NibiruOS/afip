package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para Cotizacion complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonCotiz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FchCotiz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizacion", propOrder = { "monId", "monCotiz", "fchCotiz" })
public class Cotizacion {
	@XmlElement(name = "MonId")
	@Element(name = "MonId")
	protected String monId;
	@XmlElement(name = "MonCotiz")
	@Element(name = "MonCotiz")
	protected double monCotiz;
	@XmlElement(name = "FchCotiz")
	@Element(name = "FchCotiz")
	protected String fchCotiz;

	/**
	 * Obtiene el valor de la propiedad monId.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMonId() {
		return monId;
	}

	/**
	 * Define el valor de la propiedad monId.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMonId(String value) {
		this.monId = value;
	}

	/**
	 * Obtiene el valor de la propiedad monCotiz.
	 * 
	 */
	public double getMonCotiz() {
		return monCotiz;
	}

	/**
	 * Define el valor de la propiedad monCotiz.
	 * 
	 */
	public void setMonCotiz(double value) {
		this.monCotiz = value;
	}

	/**
	 * Obtiene el valor de la propiedad fchCotiz.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFchCotiz() {
		return fchCotiz;
	}

	/**
	 * Define el valor de la propiedad fchCotiz.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFchCotiz(String value) {
		this.fchCotiz = value;
	}

}
