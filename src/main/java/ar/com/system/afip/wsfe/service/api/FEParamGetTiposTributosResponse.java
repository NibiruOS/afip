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
 *         &lt;element name="FEParamGetTiposTributosResult" type="{http://ar.gov.afip.dif.FEV1/}FETributoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feParamGetTiposTributosResult" })
@XmlRootElement(name = "FEParamGetTiposTributosResponse")
public class FEParamGetTiposTributosResponse {

	@XmlElement(name = "FEParamGetTiposTributosResult")
	protected FETributoResponse feParamGetTiposTributosResult;

	/**
	 * Obtiene el valor de la propiedad feParamGetTiposTributosResult.
	 * 
	 * @return possible object is {@link FETributoResponse }
	 * 
	 */
	public FETributoResponse getFEParamGetTiposTributosResult() {
		return feParamGetTiposTributosResult;
	}

	/**
	 * Define el valor de la propiedad feParamGetTiposTributosResult.
	 * 
	 * @param value
	 *            allowed object is {@link FETributoResponse }
	 * 
	 */
	public void setFEParamGetTiposTributosResult(FETributoResponse value) {
		this.feParamGetTiposTributosResult = value;
	}

}
