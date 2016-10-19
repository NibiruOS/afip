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
 *         &lt;element name="FECompConsultarResult" type="{http://ar.gov.afip.dif.FEV1/}FECompConsultaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feCompConsultarResult" })
@XmlRootElement(name = "FECompConsultarResponse")
public class FECompConsultarResponse {

	@XmlElement(name = "FECompConsultarResult")
	protected FECompConsultaResponse feCompConsultarResult;

	/**
	 * Obtiene el valor de la propiedad feCompConsultarResult.
	 * 
	 * @return possible object is {@link FECompConsultaResponse }
	 * 
	 */
	public FECompConsultaResponse getFECompConsultarResult() {
		return feCompConsultarResult;
	}

	/**
	 * Define el valor de la propiedad feCompConsultarResult.
	 * 
	 * @param value
	 *            allowed object is {@link FECompConsultaResponse }
	 * 
	 */
	public void setFECompConsultarResult(FECompConsultaResponse value) {
		this.feCompConsultarResult = value;
	}

}
