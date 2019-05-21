
package cis.bir.publ._2014._07.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametryWyszukiwania complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametryWyszukiwania"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Krs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Krsy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nipy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Regon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Regony14zn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Regony9zn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametryWyszukiwania", propOrder = {
    "krs",
    "krsy",
    "nip",
    "nipy",
    "regon",
    "regony14Zn",
    "regony9Zn"
})
public class ParametryWyszukiwania {

    @XmlElementRef(name = "Krs", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> krs;
    @XmlElementRef(name = "Krsy", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> krsy;
    @XmlElementRef(name = "Nip", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nip;
    @XmlElementRef(name = "Nipy", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nipy;
    @XmlElementRef(name = "Regon", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regon;
    @XmlElementRef(name = "Regony14zn", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regony14Zn;
    @XmlElementRef(name = "Regony9zn", namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regony9Zn;

    /**
     * Gets the value of the krs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKrs() {
        return krs;
    }

    /**
     * Sets the value of the krs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKrs(JAXBElement<String> value) {
        this.krs = value;
    }

    /**
     * Gets the value of the krsy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKrsy() {
        return krsy;
    }

    /**
     * Sets the value of the krsy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKrsy(JAXBElement<String> value) {
        this.krsy = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNip(JAXBElement<String> value) {
        this.nip = value;
    }

    /**
     * Gets the value of the nipy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNipy() {
        return nipy;
    }

    /**
     * Sets the value of the nipy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNipy(JAXBElement<String> value) {
        this.nipy = value;
    }

    /**
     * Gets the value of the regon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegon() {
        return regon;
    }

    /**
     * Sets the value of the regon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegon(JAXBElement<String> value) {
        this.regon = value;
    }

    /**
     * Gets the value of the regony14Zn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegony14Zn() {
        return regony14Zn;
    }

    /**
     * Sets the value of the regony14Zn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegony14Zn(JAXBElement<String> value) {
        this.regony14Zn = value;
    }

    /**
     * Gets the value of the regony9Zn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegony9Zn() {
        return regony9Zn;
    }

    /**
     * Sets the value of the regony9Zn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegony9Zn(JAXBElement<String> value) {
        this.regony9Zn = value;
    }

}
