package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.TypeConstraint;
import com.cs.tradevalidator.web.dto.Type;

@Component
public class TypeValidator implements
ConstraintValidator<TypeConstraint, String> {

  @Override
  public void initialize(TypeConstraint typeConstraint) {
  }

  @Override
  public boolean isValid(String type,
    ConstraintValidatorContext cxt) {
      return type != null && 
    		  (type.equalsIgnoreCase(Type.SPOT.getName()) 
    				  || type.equalsIgnoreCase(Type.FORWARD.getName())
    				  || type.equalsIgnoreCase(Type.VANILLA_OPTION.getName()));
  }

}