
package cis.bir.publ._2014._07;

import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cis.bir.publ._2014._07 package. 
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

    private final static QName _ZalogujPKluczUzytkownika_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pKluczUzytkownika");
    private final static QName _ZalogujResponseZalogujResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "ZalogujResult");
    private final static QName _WylogujPIdentyfikatorSesji_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pIdentyfikatorSesji");
    private final static QName _DaneSzukajPParametryWyszukiwania_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pParametryWyszukiwania");
    private final static QName _DaneSzukajResponseDaneSzukajResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DaneSzukajResult");
    private final static QName _DanePobierzPelnyRaportPRegon_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pRegon");
    private final static QName _DanePobierzPelnyRaportPNazwaRaportu_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pNazwaRaportu");
    private final static QName _DanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DanePobierzPelnyRaportResult");
    private final static QName _DaneKomunikatResponseDaneKomunikatResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DaneKomunikatResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cis.bir.publ._2014._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Zaloguj }
     * 
     */
    public Zaloguj createZaloguj() {
        return new Zaloguj();
    }

    /**
     * Create an instance of {@link ZalogujResponse }
     * 
     */
    public ZalogujResponse createZalogujResponse() {
        return new ZalogujResponse();
    }

    /**
     * Create an instance of {@link Wyloguj }
     * 
     */
    public Wyloguj createWyloguj() {
        return new Wyloguj();
    }

    /**
     * Create an instance of {@link WylogujResponse }
     * 
     */
    public WylogujResponse createWylogujResponse() {
        return new WylogujResponse();
    }

    /**
     * Create an instance of {@link DaneSzukaj }
     * 
     */
    public DaneSzukaj createDaneSzukaj() {
        return new DaneSzukaj();
    }

    /**
     * Create an instance of {@link DaneSzukajResponse }
     * 
     */
    public DaneSzukajResponse createDaneSzukajResponse() {
        return new DaneSzukajResponse();
    }

    /**
     * Create an instance of {@link DanePobierzPelnyRaport }
     * 
     */
    public DanePobierzPelnyRaport createDanePobierzPelnyRaport() {
        return new DanePobierzPelnyRaport();
    }

    /**
     * Create an instance of {@link DanePobierzPelnyRaportResponse }
     * 
     */
    public DanePobierzPelnyRaportResponse createDanePobierzPelnyRaportResponse() {
        return new DanePobierzPelnyRaportResponse();
    }

    /**
     * Create an instance of {@link DaneKomunikat }
     * 
     */
    public DaneKomunikat createDaneKomunikat() {
        return new DaneKomunikat();
    }

    /**
     * Create an instance of {@link DaneKomunikatResponse }
     * 
     */
    public DaneKomunikatResponse createDaneKomunikatResponse() {
        return new DaneKomunikatResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pKluczUzytkownika", scope = Zaloguj.class)
    public JAXBElement<String> createZalogujPKluczUzytkownika(String value) {
        return new JAXBElement<String>(_ZalogujPKluczUzytkownika_QNAME, String.class, Zaloguj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "ZalogujResult", scope = ZalogujResponse.class)
    public JAXBElement<String> createZalogujResponseZalogujResult(String value) {
        return new JAXBElement<String>(_ZalogujResponseZalogujResult_QNAME, String.class, ZalogujResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pIdentyfikatorSesji", scope = Wyloguj.class)
    public JAXBElement<String> createWylogujPIdentyfikatorSesji(String value) {
        return new JAXBElement<String>(_WylogujPIdentyfikatorSesji_QNAME, String.class, Wyloguj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametryWyszukiwania }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParametryWyszukiwania }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pParametryWyszukiwania", scope = DaneSzukaj.class)
    public JAXBElement<ParametryWyszukiwania> createDaneSzukajPParametryWyszukiwania(ParametryWyszukiwania value) {
        return new JAXBElement<ParametryWyszukiwania>(_DaneSzukajPParametryWyszukiwania_QNAME, ParametryWyszukiwania.class, DaneSzukaj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DaneSzukajResult", scope = DaneSzukajResponse.class)
    public JAXBElement<String> createDaneSzukajResponseDaneSzukajResult(String value) {
        return new JAXBElement<String>(_DaneSzukajResponseDaneSzukajResult_QNAME, String.class, DaneSzukajResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pRegon", scope = DanePobierzPelnyRaport.class)
    public JAXBElement<String> createDanePobierzPelnyRaportPRegon(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportPRegon_QNAME, String.class, DanePobierzPelnyRaport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pNazwaRaportu", scope = DanePobierzPelnyRaport.class)
    public JAXBElement<String> createDanePobierzPelnyRaportPNazwaRaportu(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportPNazwaRaportu_QNAME, String.class, DanePobierzPelnyRaport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DanePobierzPelnyRaportResult", scope = DanePobierzPelnyRaportResponse.class)
    public JAXBElement<String> createDanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult_QNAME, String.class, DanePobierzPelnyRaportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DaneKomunikatResult", scope = DaneKomunikatResponse.class)
    public JAXBElement<String> createDaneKomunikatResponseDaneKomunikatResult(String value) {
        return new JAXBElement<String>(_DaneKomunikatResponseDaneKomunikatResult_QNAME, String.class, DaneKomunikatResponse.class, value);
    }

}
