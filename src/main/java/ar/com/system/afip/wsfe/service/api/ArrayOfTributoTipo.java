package ar.com.system.afip.wsfe.service.api;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para ArrayOfTributoTipo complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTributoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TributoTipo" type="{http://ar.gov.afip.dif.FEV1/}TributoTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTributoTipo", propOrder = { "tributoTipo" })
public class ArrayOfTributoTipo {

	@XmlElement(name = "TributoTipo", nillable = true)
	protected List<TributoTipo> tributoTipo;

	/**
	 * Gets the value of the tributoTipo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the tributoTipo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTributoTipo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TributoTipo }
	 * 
	 * 
	 */
	public List<TributoTipo> getTributoTipo() {
		if (tributoTipo == null) {
			tributoTipo = new ArrayList<TributoTipo>();
		}
		return this.tributoTipo;
	}

}
