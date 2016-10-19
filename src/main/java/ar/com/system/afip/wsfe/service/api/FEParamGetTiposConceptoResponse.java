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
 *         &lt;element name="FEParamGetTiposConceptoResult" type="{http://ar.gov.afip.dif.FEV1/}ConceptoTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "feParamGetTiposConceptoResult" })
@XmlRootElement(name = "FEParamGetTiposConceptoResponse")
public class FEParamGetTiposConceptoResponse {

	@XmlElement(name = "FEParamGetTiposConceptoResult")
	protected ConceptoTipoResponse feParamGetTiposConceptoResult;

	/**
	 * Obtiene el valor de la propiedad feParamGetTiposConceptoResult.
	 * 
	 * @return possible object is {@link ConceptoTipoResponse }
	 * 
	 */
	public ConceptoTipoResponse getFEParamGetTiposConceptoResult() {
		return feParamGetTiposConceptoResult;
	}

	/**
	 * Define el valor de la propiedad feParamGetTiposConceptoResult.
	 * 
	 * @param value
	 *            allowed object is {@link ConceptoTipoResponse }
	 * 
	 */
	public void setFEParamGetTiposConceptoResult(ConceptoTipoResponse value) {
		this.feParamGetTiposConceptoResult = value;
	}

}
