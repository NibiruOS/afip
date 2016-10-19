package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEADetResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEADetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ar.gov.afip.dif.FEV1/}FEDetResponse">
 *       &lt;sequence>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEADetResponse", propOrder = { "caea" })
public class FECAEADetResponse extends FEDetResponse {

	@XmlElement(name = "CAEA")
	protected String caea;

	/**
	 * Obtiene el valor de la propiedad caea.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCAEA() {
		return caea;
	}

	/**
	 * Define el valor de la propiedad caea.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCAEA(String value) {
		this.caea = value;
	}

}
