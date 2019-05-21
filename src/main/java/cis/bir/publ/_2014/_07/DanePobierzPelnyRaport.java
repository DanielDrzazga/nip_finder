
package cis.bir.publ._2014._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pRegon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pNazwaRaportu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pRegon",
    "pNazwaRaportu"
})
@XmlRootElement(name = "DanePobierzPelnyRaport")
public class DanePobierzPelnyRaport {

    @XmlElementRef(name = "pRegon", namespace = "http://CIS/BIR/PUBL/2014/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pRegon;
    @XmlElementRef(name = "pNazwaRaportu", namespace = "http://CIS/BIR/PUBL/2014/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pNazwaRaportu;

    /**
     * Gets the value of the pRegon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRegon() {
        return pRegon;
    }

    /**
     * Sets the value of the pRegon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRegon(JAXBElement<String> value) {
        this.pRegon = value;
    }

    /**
     * Gets the value of the pNazwaRaportu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNazwaRaportu() {
        return pNazwaRaportu;
    }

    /**
     * Sets the value of the pNazwaRaportu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNazwaRaportu(JAXBElement<String> value) {
        this.pNazwaRaportu = value;
    }

}
