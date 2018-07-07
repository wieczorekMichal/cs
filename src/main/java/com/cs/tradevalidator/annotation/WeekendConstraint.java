package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.WeekendValidator;

@Documented
@Constraint(validatedBy = WeekendValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface WeekendConstraint {
    String message() default "Date cannot fall on weekend";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}