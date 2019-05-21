
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
 *         &lt;element name="DaneKomunikatResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "daneKomunikatResult"
})
@XmlRootElement(name = "DaneKomunikatResponse")
public class DaneKomunikatResponse {

    @XmlElementRef(name = "DaneKomunikatResult", namespace = "http://CIS/BIR/PUBL/2014/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> daneKomunikatResult;

    /**
     * Gets the value of the daneKomunikatResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDaneKomunikatResult() {
        return daneKomunikatResult;
    }

    /**
     * Sets the value of the daneKomunikatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDaneKomunikatResult(JAXBElement<String> value) {
        this.daneKomunikatResult = value;
    }

}
