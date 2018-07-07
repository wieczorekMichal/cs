package com.cs.tradevalidator.validator;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.WeekendConstraint;
import com.cs.tradevalidator.web.dto.Customer;

@Component
public class WeekendValidator implements
ConstraintValidator<WeekendConstraint, LocalDate> {

  @Override
  public void initialize(WeekendConstraint weekendConstraint) {
  }

  @Override
  public boolean isValid(LocalDate date, ConstraintValidatorContext cxt) {
	  String saturday  = "SATURDAY";
	  String sunday  = "SUNDAY";
	  
      return !(saturday.equalsIgnoreCase(date.getDayOfWeek().name()) || sunday.equalsIgnoreCase(date.getDayOfWeek().name()));
  }

}