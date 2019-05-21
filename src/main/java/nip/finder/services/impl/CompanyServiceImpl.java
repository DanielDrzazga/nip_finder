package nip.finder.services.impl;

import lombok.AllArgsConstructor;
import lombok.Setter;

import nip.finder.model.Company;
import nip.finder.repositories.CompanyRepository;
import nip.finder.services.CompanyService;
import org.springframework.stereotype.Service;

@Service
@Setter
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public Company findBNip(String nip) {
         return companyRepository.findByNip(nip);
    }
}
