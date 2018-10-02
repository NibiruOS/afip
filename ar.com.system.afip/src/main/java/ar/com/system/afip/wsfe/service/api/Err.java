package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para Err complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="Err">
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Err", propOrder = {"code", "msg"})
public class Err implements WsfeError {
    @XmlElement(name = "Code")
    @Element(name = "Code")
    protected int code;
    @XmlElement(name = "Msg")
    @Element(name = "Msg")
    protected String msg;

    /**
     * Obtiene el valor de la propiedad code.
     */
    @Override
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad msg.
     *
     * @return possible object is {@link String }
     */
    @Override
    public String getMsg() {
        return msg;
    }

    /**
     * Define el valor de la propiedad msg.
     *
     * @param value allowed object is {@link String }
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    @Override
    public String toString() {
        return "Err [code=" + code + ", msg=" + msg + "]";
    }
}
