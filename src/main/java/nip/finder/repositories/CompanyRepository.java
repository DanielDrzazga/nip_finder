package nip.finder.repositories;

import cis.bir.publ._2014._07.datacontract.ObjectFactory;
import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import nip.finder.model.Company;
import nip.finder.model.CompanyRoot;
import org.springframework.stereotype.Repository;
import org.tempuri.IUslugaBIRzewnPubl;
import org.tempuri.UslugaBIRzewnPubl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.AddressingFeature;
import java.io.StringReader;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;

@Repository
public class CompanyRepository {

    private static final String GUS_API_KEY = "abcde12345abcde12345";
    private static final String GUS_API_URL = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc";
    private static final String GUS_API_SID = "sid";

    private final UslugaBIRzewnPubl service;
    private final IUslugaBIRzewnPubl port;

    public CompanyRepository() {
        this.service = new UslugaBIRzewnPubl();
        this.port = service.getE3(new AddressingFeature());
    }

    public Company findByNip(String nip) {
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<String> nipParam = objectFactory.createParametryWyszukiwaniaNip(nip);
        ParametryWyszukiwania parametryWyszukiwania = new ParametryWyszukiwania();
        parametryWyszukiwania.setNip(nipParam);

        String sessionKey = port.zaloguj(GUS_API_KEY);
        BindingProvider provider = (BindingProvider) port;
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, GUS_API_URL);
        provider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, singletonMap(GUS_API_SID, asList(sessionKey)));

        String searchedCompany = port.daneSzukaj(parametryWyszukiwania);
        Company company = null;

        if (!searchedCompany.isEmpty()) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(CompanyRoot.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                CompanyRoot companyRoot = (CompanyRoot) jaxbUnmarshaller.unmarshal(new StringReader(searchedCompany));
                company = companyRoot.getCompany();
                company.setNip(nip);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        port.wyloguj(sessionKey);

        return company;
    }

}