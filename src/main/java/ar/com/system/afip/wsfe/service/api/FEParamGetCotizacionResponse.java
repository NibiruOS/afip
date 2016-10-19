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
 *         &lt;element name="FEParamGetCotizacionResult" type="{http://ar.gov.afip.dif.FEV1/}FECotizacionResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feParamGetCotizacionResult" })
@XmlRootElement(name = "FEParamGetCotizacionResponse")
public class FEParamGetCotizacionResponse {

	@XmlElement(name = "FEParamGetCotizacionResult")
	protected FECotizacionResponse feParamGetCotizacionResult;

	/**
	 * Obtiene el valor de la propiedad feParamGetCotizacionResult.
	 * 
	 * @return possible object is {@link FECotizacionResponse }
	 * 
	 */
	public FECotizacionResponse getFEParamGetCotizacionResult() {
		return feParamGetCotizacionResult;
	}

	/**
	 * Define el valor de la propiedad feParamGetCotizacionResult.
	 * 
	 * @param value
	 *            allowed object is {@link FECotizacionResponse }
	 * 
	 */
	public void setFEParamGetCotizacionResult(FECotizacionResponse value) {
		this.feParamGetCotizacionResult = value;
	}

}
