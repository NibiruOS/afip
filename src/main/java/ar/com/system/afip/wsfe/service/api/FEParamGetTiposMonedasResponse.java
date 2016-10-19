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
 *         &lt;element name="FEParamGetTiposMonedasResult" type="{http://ar.gov.afip.dif.FEV1/}MonedaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feParamGetTiposMonedasResult" })
@XmlRootElement(name = "FEParamGetTiposMonedasResponse")
public class FEParamGetTiposMonedasResponse {

	@XmlElement(name = "FEParamGetTiposMonedasResult")
	protected MonedaResponse feParamGetTiposMonedasResult;

	/**
	 * Obtiene el valor de la propiedad feParamGetTiposMonedasResult.
	 * 
	 * @return possible object is {@link MonedaResponse }
	 * 
	 */
	public MonedaResponse getFEParamGetTiposMonedasResult() {
		return feParamGetTiposMonedasResult;
	}

	/**
	 * Define el valor de la propiedad feParamGetTiposMonedasResult.
	 * 
	 * @param value
	 *            allowed object is {@link MonedaResponse }
	 * 
	 */
	public void setFEParamGetTiposMonedasResult(MonedaResponse value) {
		this.feParamGetTiposMonedasResult = value;
	}

}
