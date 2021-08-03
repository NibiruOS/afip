/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.system.afip.wsfe.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.simpleframework.xml.ElementList;

/**
 *
 * Clase Java para ArrayOfComprador complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfComprador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comprador" type="{http://ar.gov.afip.dif.FEV1/}Comprador" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComprador", propOrder = {"compradores"})
public class ArrayOfComprador {
    @XmlElement(name = "Compradores", nillable = true)
    @ElementList(name = "Compradores", entry = "Compradores", type = Comprador.class, inline = true)
    protected List<Comprador> compradores;
  
    /**
     * Gets the value of the alicIva property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the alicIva property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getCompradores().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link AlicIva }
     */
    public List<Comprador> getCompradores() {
        if (compradores == null) {
            compradores = new ArrayList<>();
        }
        return this.compradores;
    }
}
