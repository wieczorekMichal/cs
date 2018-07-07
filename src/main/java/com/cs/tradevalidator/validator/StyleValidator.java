package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.StyleConstraint;
import com.cs.tradevalidator.web.dto.Style;

@Component
public class StyleValidator implements
ConstraintValidator<StyleConstraint, String> {

  @Override
  public void initialize(StyleConstraint styleConstraint) {
  }

  @Override
  public boolean isValid(String style,
    ConstraintValidatorContext cxt) {
      return style != null && 
    		  (style.equalsIgnoreCase(Style.AMERICAN.getName()) || style.equalsIgnoreCase(Style.EUROPEAN.getName()));
  }

}