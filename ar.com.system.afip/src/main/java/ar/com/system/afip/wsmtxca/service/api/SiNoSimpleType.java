
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SiNoSimpleType.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;simpleType name="SiNoSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SiNoSimpleType")
@XmlEnum
public enum SiNoSimpleType {

    S,
    N;

    public String value() {
        return name();
    }

    public static SiNoSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
