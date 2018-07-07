package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.StyleValidator;

@Documented
@Constraint(validatedBy = StyleValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface StyleConstraint {
    String message() default "Style value rejected";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}