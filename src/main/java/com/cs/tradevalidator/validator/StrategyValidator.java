package com.cs.tradevalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.StrategyConstraint;
import com.cs.tradevalidator.web.dto.Strategy;

@Component
public class StrategyValidator implements
ConstraintValidator<StrategyConstraint, String> {

  @Override
  public void initialize(StrategyConstraint strategyConstraint) {
  }

  @Override
  public boolean isValid(String strategy,
    ConstraintValidatorContext cxt) {
      return strategy != null && strategy.equalsIgnoreCase(Strategy.CALL.getName());
  }

}