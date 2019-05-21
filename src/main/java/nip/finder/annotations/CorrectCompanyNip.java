package nip.finder.annotations;

import nip.finder.validators.CorrectCompanyNipValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CorrectCompanyNipValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CorrectCompanyNip {

    String message() default "{error.companyNipIsNotMatch}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}