package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEDetResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEDetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ar.gov.afip.dif.FEV1/}FEDetResponse">
 *       &lt;sequence>
 *         &lt;element name="CAE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAEFchVto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEDetResponse", propOrder = { "cae", "caeFchVto" })
public class FECAEDetResponse extends FEDetResponse {

	@XmlElement(name = "CAE")
	protected String cae;
	@XmlElement(name = "CAEFchVto")
	protected String caeFchVto;

	/**
	 * Obtiene el valor de la propiedad cae.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCAE() {
		return cae;
	}

	/**
	 * Define el valor de la propiedad cae.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCAE(String value) {
		this.cae = value;
	}

	/**
	 * Obtiene el valor de la propiedad caeFchVto.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCAEFchVto() {
		return caeFchVto;
	}

	/**
	 * Define el valor de la propiedad caeFchVto.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCAEFchVto(String value) {
		this.caeFchVto = value;
	}

}
