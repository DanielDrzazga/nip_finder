package nip.finder.controllers;

import lombok.AllArgsConstructor;
import lombok.Setter;
import nip.finder.model.Company;
import nip.finder.services.CompanyService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;

@Controller
@Setter
@AllArgsConstructor
public class CompanySearchController {

    private final CompanyService companyService;
    private MessageSource messageSource;


    @GetMapping({"/", "/index"})
    public String companyNipSearchForm(Model model) {
        model.addAttribute("company", new Company());
        return "index";
    }

    @PostMapping({"/", "/index"})
    public String openSearchCompanyNipPage(@Valid @ModelAttribute Company company,
                                           BindingResult result,
                                           Model model,
                                           Locale locale) {
        if (!result.hasErrors()) {
            Company searchedCompany = companyService.findBNip(company.getNip());

            if (searchedCompany == null) {
                model.addAttribute("message", messageSource.getMessage("error.companyDoesNotExist", null, locale));
                model.addAttribute("company", new Company());
            } else {
                model.addAttribute("company", searchedCompany);
            }
            return "index";
        }
        return "index";
    }

}
