package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.CustomerValidator;

@Documented
@Constraint(validatedBy = CustomerValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerConstraint {
    String message() default "Customer value rejected";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}