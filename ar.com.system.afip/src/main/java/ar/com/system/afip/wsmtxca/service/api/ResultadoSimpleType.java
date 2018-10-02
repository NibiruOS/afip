
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultadoSimpleType.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;simpleType name="ResultadoSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ResultadoSimpleType")
@XmlEnum
public enum ResultadoSimpleType {

    A,
    O,
    R;

    public String value() {
        return name();
    }

    public static ResultadoSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
