package nip.finder.validators;

import nip.finder.annotations.CorrectCompanyNip;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectCompanyNipValidator implements ConstraintValidator <CorrectCompanyNip,String> {

    private final String nipRegex = "^\\d{10}$";

    @Override
    public void initialize(CorrectCompanyNip constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern p = Pattern.compile(nipRegex);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
