package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEASinMovResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEASinMovResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ar.gov.afip.dif.FEV1/}FECAEASinMov">
 *       &lt;sequence>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfErr" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfEvt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEASinMovResponse", propOrder = { "resultado", "errors", "events" })
public class FECAEASinMovResponse extends FECAEASinMov implements HasErrors {

	@XmlElement(name = "Resultado")
	protected String resultado;
	@XmlElement(name = "Errors")
	protected ArrayOfErr errors;
	@XmlElement(name = "Events")
	protected ArrayOfEvt events;

	/**
	 * Obtiene el valor de la propiedad resultado.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResultado() {
		return resultado;
	}

	/**
	 * Define el valor de la propiedad resultado.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResultado(String value) {
		this.resultado = value;
	}

	/**
	 * Obtiene el valor de la propiedad errors.
	 * 
	 * @return possible object is {@link ArrayOfErr }
	 * 
	 */
	public ArrayOfErr getErrors() {
		return errors;
	}

	/**
	 * Define el valor de la propiedad errors.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfErr }
	 * 
	 */
	public void setErrors(ArrayOfErr value) {
		this.errors = value;
	}

	/**
	 * Obtiene el valor de la propiedad events.
	 * 
	 * @return possible object is {@link ArrayOfEvt }
	 * 
	 */
	public ArrayOfEvt getEvents() {
		return events;
	}

	/**
	 * Define el valor de la propiedad events.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfEvt }
	 * 
	 */
	public void setEvents(ArrayOfEvt value) {
		this.events = value;
	}

}
