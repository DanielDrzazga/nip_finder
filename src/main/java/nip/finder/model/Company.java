package nip.finder.model;

import nip.finder.annotations.CorrectCompanyNip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dane")
public class Company {

    private String regon;

    @CorrectCompanyNip
    private String nip;

    private String type;
    private String name;
    private String woj;
    private String pow;
    private String gm;
    private String postCode;
    private String city;
    private String street;
    private String silosID;

    @XmlElement(name = "Regon")
    public String getRegon() {
        return regon;
    }

    public String getNip() {
        return nip;
    }

    @XmlElement(name = "Typ")
    public String getType() {
        return type;
    }

    @XmlElement(name = "Nazwa")
    public String getName() {
        return name;
    }

    @XmlElement(name = "Wojewodztwo")
    public String getWoj() {
        return woj;
    }

    @XmlElement(name = "Powiat")
    public String getPow() {
        return pow;
    }

    @XmlElement(name = "Gmina")
    public String getGm() {
        return gm;
    }

    @XmlElement(name = "KodPocztowy")
    public String getPostCode() {
        return postCode;
    }

    @XmlElement(name = "Miejscowosc")
    public String getCity() {
        return city;
    }

    @XmlElement(name = "Ulica")
    public String getStreet() {
        return street;
    }

    @XmlElement(name = "SilosID")
    public String getSilosID() {
        return silosID;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWoj(String woj) {
        this.woj = woj;
    }

    public void setPow(String pow) {
        this.pow = pow;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSilosID(String silosID) {
        this.silosID = silosID;
    }
}
