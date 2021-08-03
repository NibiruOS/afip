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
 * Clase Java para Comprador complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="Comprador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocNro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comprador", propOrder = {"docTipo", "docNro", "porcentaje"})
public class Comprador {
    @XmlElement(name = "DocTipo")
    @Element(name = "DocTipo")
    protected int docTipo;
    @XmlElement(name = "DocNro")
    @Element(name = "DocNro")
    protected long docNro;
    @XmlElement(name = "Porcentaje")
    @Element(name = "Porcentaje")
    protected double porcentaje;

    /**
     * Obtiene el valor de la propiedad docTipo.
     *
     */
    public int getDocTipo() {
        return docTipo;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setDocTipo(int docTipo) {
        this.docTipo = docTipo;
    }

    /**
     * Obtiene el valor de la propiedad docNro.
     *
     */
    public long getDocNro() {
        return docNro;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setDocNro(long docNro) {
        this.docNro = docNro;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     *
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}