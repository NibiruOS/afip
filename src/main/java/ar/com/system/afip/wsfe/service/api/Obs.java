package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para Obs complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Obs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obs", propOrder = { "code", "msg" })
public class Obs implements WsfeError {

	@XmlElement(name = "Code")
	protected int code;
	@XmlElement(name = "Msg")
	protected String msg;

	/**
	 * Obtiene el valor de la propiedad code.
	 * 
	 */
	@Override
	public int getCode() {
		return code;
	}

	/**
	 * Define el valor de la propiedad code.
	 * 
	 */
	public void setCode(int value) {
		this.code = value;
	}

	/**
	 * Obtiene el valor de la propiedad msg.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	@Override
	public String getMsg() {
		return msg;
	}

	/**
	 * Define el valor de la propiedad msg.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsg(String value) {
		this.msg = value;
	}

}
