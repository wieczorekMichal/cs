package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.LegalEntityValidator;

@Documented
@Constraint(validatedBy = LegalEntityValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LegalEntityConstraint {
    String message() default "LegalEntity value rejected";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}