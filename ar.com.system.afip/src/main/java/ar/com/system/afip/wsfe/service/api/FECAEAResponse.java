package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Clase Java para FECAEAResponse complex type.
 * 
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEAResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeCabResp" type="{http://ar.gov.afip.dif.FEV1/}FECAEACabResponse" minOccurs="0"/>
 *         &lt;element name="FeDetResp" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfFECAEADetResponse" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfEvt" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfErr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEAResponse", propOrder = { "feCabResp", "feDetResp", "events", "errors" })
public class FECAEAResponse implements HasErrors {
	@XmlElement(name = "FeCabResp")
	@Element(name = "FeCabResp")
	protected FECAEACabResponse feCabResp;
	@XmlElement(name = "FeDetResp")
	@Element(name = "FeDetResp")
	protected ArrayOfFECAEADetResponse feDetResp;
	@XmlElement(name = "Events")
	@Element(name = "Events", required = false)
	protected ArrayOfEvt events;
	@XmlElement(name = "Errors")
	@Element(name = "Errors", required = false)
	protected ArrayOfErr errors;

	/**
	 * Obtiene el valor de la propiedad feCabResp.
	 * 
	 * @return possible object is {@link FECAEACabResponse }
	 * 
	 */
	public FECAEACabResponse getFeCabResp() {
		return feCabResp;
	}

	/**
	 * Define el valor de la propiedad feCabResp.
	 * 
	 * @param value
	 *            allowed object is {@link FECAEACabResponse }
	 * 
	 */
	public void setFeCabResp(FECAEACabResponse value) {
		this.feCabResp = value;
	}

	/**
	 * Obtiene el valor de la propiedad feDetResp.
	 * 
	 * @return possible object is {@link ArrayOfFECAEADetResponse }
	 * 
	 */
	public ArrayOfFECAEADetResponse getFeDetResp() {
		return feDetResp;
	}

	/**
	 * Define el valor de la propiedad feDetResp.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfFECAEADetResponse }
	 * 
	 */
	public void setFeDetResp(ArrayOfFECAEADetResponse value) {
		this.feDetResp = value;
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

}
