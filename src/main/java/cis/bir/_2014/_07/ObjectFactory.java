
package cis.bir._2014._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cis.bir._2014._07 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PobierzCaptchaResponsePobierzCaptchaResult_QNAME = new QName("http://CIS/BIR/2014/07", "PobierzCaptchaResult");
    private final static QName _SprawdzCaptchaPCaptcha_QNAME = new QName("http://CIS/BIR/2014/07", "pCaptcha");
    private final static QName _GetValuePNazwaParametru_QNAME = new QName("http://CIS/BIR/2014/07", "pNazwaParametru");
    private final static QName _SetValuePWartoscParametru_QNAME = new QName("http://CIS/BIR/2014/07", "pWartoscParametru");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cis.bir._2014._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PobierzCaptcha }
     * 
     */
    public PobierzCaptcha createPobierzCaptcha() {
        return new PobierzCaptcha();
    }

    /**
     * Create an instance of {@link PobierzCaptchaResponse }
     * 
     */
    public PobierzCaptchaResponse createPobierzCaptchaResponse() {
        return new PobierzCaptchaResponse();
    }

    /**
     * Create an instance of {@link SprawdzCaptcha }
     * 
     */
    public SprawdzCaptcha createSprawdzCaptcha() {
        return new SprawdzCaptcha();
    }

    /**
     * Create an instance of {@link SprawdzCaptchaResponse }
     * 
     */
    public SprawdzCaptchaResponse createSprawdzCaptchaResponse() {
        return new SprawdzCaptchaResponse();
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link SetValue }
     * 
     */
    public SetValue createSetValue() {
        return new SetValue();
    }

    /**
     * Create an instance of {@link SetValueResponse }
     * 
     */
    public SetValueResponse createSetValueResponse() {
        return new SetValueResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "PobierzCaptchaResult", scope = PobierzCaptchaResponse.class)
    public JAXBElement<String> createPobierzCaptchaResponsePobierzCaptchaResult(String value) {
        return new JAXBElement<String>(_PobierzCaptchaResponsePobierzCaptchaResult_QNAME, String.class, PobierzCaptchaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pCaptcha", scope = SprawdzCaptcha.class)
    public JAXBElement<String> createSprawdzCaptchaPCaptcha(String value) {
        return new JAXBElement<String>(_SprawdzCaptchaPCaptcha_QNAME, String.class, SprawdzCaptcha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pNazwaParametru", scope = GetValue.class)
    public JAXBElement<String> createGetValuePNazwaParametru(String value) {
        return new JAXBElement<String>(_GetValuePNazwaParametru_QNAME, String.class, GetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pNazwaParametru", scope = SetValue.class)
    public JAXBElement<String> createSetValuePNazwaParametru(String value) {
        return new JAXBElement<String>(_GetValuePNazwaParametru_QNAME, String.class, SetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pWartoscParametru", scope = SetValue.class)
    public JAXBElement<String> createSetValuePWartoscParametru(String value) {
        return new JAXBElement<String>(_SetValuePWartoscParametru_QNAME, String.class, SetValue.class, value);
    }

}
