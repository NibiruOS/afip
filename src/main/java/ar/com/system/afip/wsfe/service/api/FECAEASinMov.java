package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para FECAEASinMov complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FECAEASinMov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECAEASinMov", propOrder = { "caea", "fchProceso", "ptoVta" })
@XmlSeeAlso({ FECAEASinMovResponse.class })
public class FECAEASinMov {

	@XmlElement(name = "CAEA")
	protected String caea;
	@XmlElement(name = "FchProceso")
	protected String fchProceso;
	@XmlElement(name = "PtoVta")
	protected int ptoVta;

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

	/**
	 * Obtiene el valor de la propiedad fchProceso.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFchProceso() {
		return fchProceso;
	}

	/**
	 * Define el valor de la propiedad fchProceso.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFchProceso(String value) {
		this.fchProceso = value;
	}

	/**
	 * Obtiene el valor de la propiedad ptoVta.
	 * 
	 */
	public int getPtoVta() {
		return ptoVta;
	}

	/**
	 * Define el valor de la propiedad ptoVta.
	 * 
	 */
	public void setPtoVta(int value) {
		this.ptoVta = value;
	}

}
