package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.CustomerConstraint;
import com.cs.tradevalidator.web.dto.Customer;

@Component
public class CustomerValidator implements
ConstraintValidator<CustomerConstraint, String> {

  @Override
  public void initialize(CustomerConstraint customerConstraint) {
  }

  @Override
  public boolean isValid(String customer,
    ConstraintValidatorContext cxt) {
      return customer != null && (customer.equalsIgnoreCase(Customer.PLUTO1.getName()) || customer.equalsIgnoreCase(Customer.PLUTO2.getName()));
  }

}