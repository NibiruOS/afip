
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CodigoTipoAutorizacionSimpleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CodigoTipoAutorizacionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodigoTipoAutorizacionSimpleType")
@XmlEnum
public enum CodigoTipoAutorizacionSimpleType {

    A,// autorización para CAEA
    E;// autorización para CAE

    public String value() {
        return name();
    }

    public static CodigoTipoAutorizacionSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
