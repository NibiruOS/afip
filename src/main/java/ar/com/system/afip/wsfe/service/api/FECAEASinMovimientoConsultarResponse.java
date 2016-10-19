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
 *         &lt;element name="FECAEASinMovimientoConsultarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEASinMovConsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fecaeaSinMovimientoConsultarResult" })
@XmlRootElement(name = "FECAEASinMovimientoConsultarResponse")
public class FECAEASinMovimientoConsultarResponse {

	@XmlElement(name = "FECAEASinMovimientoConsultarResult")
	protected FECAEASinMovConsResponse fecaeaSinMovimientoConsultarResult;

	/**
	 * Obtiene el valor de la propiedad fecaeaSinMovimientoConsultarResult.
	 * 
	 * @return possible object is {@link FECAEASinMovConsResponse }
	 * 
	 */
	public FECAEASinMovConsResponse getFECAEASinMovimientoConsultarResult() {
		return fecaeaSinMovimientoConsultarResult;
	}

	/**
	 * Define el valor de la propiedad fecaeaSinMovimientoConsultarResult.
	 * 
	 * @param value
	 *            allowed object is {@link FECAEASinMovConsResponse }
	 * 
	 */
	public void setFECAEASinMovimientoConsultarResult(
			FECAEASinMovConsResponse value) {
		this.fecaeaSinMovimientoConsultarResult = value;
	}

}
