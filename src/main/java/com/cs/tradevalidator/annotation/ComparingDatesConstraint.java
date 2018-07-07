package com.cs.tradevalidator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cs.tradevalidator.validator.ComparingDatesValidator;

@Documented
@Constraint(validatedBy = ComparingDatesValidator.class)
@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ComparingDatesConstraint {
	
	String earlierDate();
	String laterDate();
    String message() default "Date value rejected";
    
    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
    	ComparingDatesConstraint[] value();
    }
    
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}