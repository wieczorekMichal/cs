package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.StrategyValidator;

@Documented
@Constraint(validatedBy = StrategyValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface StrategyConstraint {
    String message() default "Strategy value rejected";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}