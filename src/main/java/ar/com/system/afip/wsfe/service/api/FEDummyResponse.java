package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEDummyResult" type="{http://ar.gov.afip.dif.FEV1/}DummyResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feDummyResult" })
@XmlRootElement(name = "FEDummyResponse")
public class FEDummyResponse {

	@XmlElement(name = "FEDummyResult")
	protected DummyResponse feDummyResult;

	/**
	 * Obtiene el valor de la propiedad feDummyResult.
	 * 
	 * @return possible object is {@link DummyResponse }
	 * 
	 */
	public DummyResponse getFEDummyResult() {
		return feDummyResult;
	}

	/**
	 * Define el valor de la propiedad feDummyResult.
	 * 
	 * @param value
	 *            allowed object is {@link DummyResponse }
	 * 
	 */
	public void setFEDummyResult(DummyResponse value) {
		this.feDummyResult = value;
	}

}
