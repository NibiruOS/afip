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
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.FEV1/}FEAuthRequest" minOccurs="0"/>
 *         &lt;element name="FeCAEARegInfReq" type="{http://ar.gov.afip.dif.FEV1/}FECAEARequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "auth", "feCAEARegInfReq" })
@XmlRootElement(name = "FECAEARegInformativo")
public class FECAEARegInformativo {

	@XmlElement(name = "Auth")
	protected FEAuthRequest auth;
	@XmlElement(name = "FeCAEARegInfReq")
	protected FECAEARequest feCAEARegInfReq;

	/**
	 * Obtiene el valor de la propiedad auth.
	 * 
	 * @return possible object is {@link FEAuthRequest }
	 * 
	 */
	public FEAuthRequest getAuth() {
		return auth;
	}

	/**
	 * Define el valor de la propiedad auth.
	 * 
	 * @param value
	 *            allowed object is {@link FEAuthRequest }
	 * 
	 */
	public void setAuth(FEAuthRequest value) {
		this.auth = value;
	}

	/**
	 * Obtiene el valor de la propiedad feCAEARegInfReq.
	 * 
	 * @return possible object is {@link FECAEARequest }
	 * 
	 */
	public FECAEARequest getFeCAEARegInfReq() {
		return feCAEARegInfReq;
	}

	/**
	 * Define el valor de la propiedad feCAEARegInfReq.
	 * 
	 * @param value
	 *            allowed object is {@link FECAEARequest }
	 * 
	 */
	public void setFeCAEARegInfReq(FECAEARequest value) {
		this.feCAEARegInfReq = value;
	}

}
