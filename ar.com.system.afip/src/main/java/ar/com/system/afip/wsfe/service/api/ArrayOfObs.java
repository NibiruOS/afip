package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.ElementList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Clase Java para ArrayOfObs complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfObs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obs" type="{http://ar.gov.afip.dif.FEV1/}Obs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObs", propOrder = {"obs"})
public class ArrayOfObs {
    @XmlElement(name = "Obs", nillable = true)
    @ElementList(name = "Obss", entry = "Obs", type = Obs.class, inline = true)
    protected List<Obs> obs;
    
    public enum ObsNonExclusive {
        OBS_10017(10017),
        OBS_10041(10041),
        OBS_10063(10063),
        OBS_10188(10188),
        OBS_10209(10209),
        OBS_10217(10217),
        ;
        private int code;
        private ObsNonExclusive(int code) {
            this.code = code;
        }
        public int getCode() {
            return code;
        }
    }

    /**
     * Gets the value of the obs property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the obs property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getObs().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link Obs }
     */
    public List<Obs> getObs() {
        if (obs == null) {
            obs = new ArrayList<Obs>();
        }
        return this.obs;
    }
    
    public List<Obs> getObsExclusive() {
        List<Obs> obsExlusive = new ArrayList();
        if (obs != null) {
            obsExlusive = obs.stream()
                    .filter(obs1 -> !Arrays.asList(ObsNonExclusive.values()).stream().filter(a1 -> a1.getCode() == obs1.getCode())
                    .findFirst().isPresent())
                    .collect(Collectors.toList());
        }
        return obsExlusive;
    }

    public List<Obs> getObsNonExclusive() {
        List<Obs> obsNonExlusive = new ArrayList();
        if (obs != null) {
            obsNonExlusive = obs.stream()
                    .filter(obs1 -> Arrays.asList(ObsNonExclusive.values()).stream().filter(a1 -> a1.getCode() == obs1.getCode())
                    .findFirst().isPresent())
                    .collect(Collectors.toList());
        }
        return obsNonExlusive;
    }

}
