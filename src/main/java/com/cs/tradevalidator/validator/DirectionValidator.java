package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.DirectionConstraint;
import com.cs.tradevalidator.web.dto.Direction;

@Component
public class DirectionValidator implements
ConstraintValidator<DirectionConstraint, String> {

  @Override
  public void initialize(DirectionConstraint directionConstraint) {
  }

  @Override
  public boolean isValid(String direction,
    ConstraintValidatorContext cxt) {
      return direction != null && (direction.equalsIgnoreCase(Direction.BUY.getName()) || direction.equalsIgnoreCase(Direction.SELL.getName()));
  }

}