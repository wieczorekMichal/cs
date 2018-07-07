package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.LegalEntityConstraint;
import com.cs.tradevalidator.web.dto.LegalEntity;

@Component
public class LegalEntityValidator implements
ConstraintValidator<LegalEntityConstraint, String> {

  @Override
  public void initialize(LegalEntityConstraint legalEntityConstraint) {
  }

  @Override
  public boolean isValid(String legalEntity,
    ConstraintValidatorContext cxt) {
      return legalEntity != null && legalEntity.equalsIgnoreCase(LegalEntity.CS_ZURICH.getName());
  }

}