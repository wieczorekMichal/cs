package com.cs.tradevalidator.validator;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.ComparingDatesConstraint;

@Component
public class ComparingDatesValidator implements
ConstraintValidator<ComparingDatesConstraint, Object> {
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	 private String earlierDate;
	 private String laterDate;
	
  @Override
  public void initialize(ComparingDatesConstraint dateConstraint) {
	  this.earlierDate = dateConstraint.earlierDate();
	  this.laterDate = dateConstraint.laterDate();
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext cxt) {
	 
	  LocalDate earlierValue = getPropertyValueFor(earlierDate, value);
	  
	  LocalDate laterValue = getPropertyValueFor(laterDate, value);  
	 
	  if(earlierValue !=null && laterValue != null) {
	  
	  return laterValue.isAfter(earlierValue);
	  } 
	  logger.warn("One of the given dates is null: {} {} ", earlierDate, laterDate);
	  return false;
  }

	 protected LocalDate getPropertyValueFor(String propertyName, Object value) {
		return (LocalDate) new BeanWrapperImpl(value)
		          .getPropertyValue(propertyName);
	}

}