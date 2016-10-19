package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEARequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEARequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeCabReq" type="{http://ar.gov.afip.dif.FEV1/}FECAEACabRequest" minOccurs="0"/>
 *         &lt;element name="FeDetReq" type="{http://ar.gov.afip.dif.FEV1/}ArrayOfFECAEADetRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEARequest", propOrder = { "feCabReq", "feDetReq" })
public class FECAEARequest {

	@XmlElement(name = "FeCabReq")
	protected FECAEACabRequest feCabReq;
	@XmlElement(name = "FeDetReq")
	protected ArrayOfFECAEADetRequest feDetReq;

	/**
	 * Obtiene el valor de la propiedad feCabReq.
	 * 
	 * @return possible object is {@link FECAEACabRequest }
	 * 
	 */
	public FECAEACabRequest getFeCabReq() {
		return feCabReq;
	}

	/**
	 * Define el valor de la propiedad feCabReq.
	 * 
	 * @param value
	 *            allowed object is {@link FECAEACabRequest }
	 * 
	 */
	public void setFeCabReq(FECAEACabRequest value) {
		this.feCabReq = value;
	}

	/**
	 * Obtiene el valor de la propiedad feDetReq.
	 * 
	 * @return possible object is {@link ArrayOfFECAEADetRequest }
	 * 
	 */
	public ArrayOfFECAEADetRequest getFeDetReq() {
		return feDetReq;
	}

	/**
	 * Define el valor de la propiedad feDetReq.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfFECAEADetRequest }
	 * 
	 */
	public void setFeDetReq(ArrayOfFECAEADetRequest value) {
		this.feDetReq = value;
	}

}
