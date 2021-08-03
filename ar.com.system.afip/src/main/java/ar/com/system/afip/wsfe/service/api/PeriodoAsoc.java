/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.system.afip.wsfe.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.simpleframework.xml.Element;

/**
 *
 * Clase Java para Periodo complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="PeriodoAsoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FchDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FchHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

/**
 *
 * @author IVAN
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodoAsoc", propOrder = {"fchDesde", "fchHasta"})
public class PeriodoAsoc {
    @XmlElement(name = "FchDesde")
    @Element(name = "FchDesde")
    protected String fchDesde;
    @XmlElement(name = "FchHasta")
    @Element(name = "FchHasta")
    protected String fchHasta;
    
    /**
     * Obtiene el valor de la propiedad fchDesde.
     *
     * @return possible object is {@link String }
     */
    public String getFchDesde() {
        return fchDesde;
    }

    /**
     * Define el valor de la propiedad fchDesde.
     *
     * @param fchDesde allowed object is {@link String }
     */
    public void setFchDesde(String fchDesde) {
        this.fchDesde = fchDesde;
    }

    /**
     * Obtiene el valor de la propiedad fchHasta.
     *
     * @return possible object is {@link String }
     */
    public String getFchHasta() {
        return fchHasta;
    }
    
    /**
     * Define el valor de la propiedad fchHasta.
     *
     * @param fchHasta allowed object is {@link String }
     */
    public void setFchHasta(String fchHasta) {
        this.fchHasta = fchHasta;
    }
    
    
}
