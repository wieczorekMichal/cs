package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Direction;
import com.cs.tradevalidator.web.dto.Strategy;

public class StrategyValidatorTest extends ValidatorTest{

	@Autowired
	private StrategyValidator strategyValidator;


	@Test
	public void shouldReturnTrueForValidStrategy_CALL () {
		//given
		
		//when
		boolean result = strategyValidator.isValid(Strategy.CALL.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	
	@Test
	public void shouldReturnFalseForInvalidStrategy () {
		//given
		
		//when
		boolean result = strategyValidator.isValid("Invalid", context);
		
		//then
		Assert.assertFalse(result);	
	}
	
	@Test
	public void shouldReturnFalseForNullStrategy () {
		//given
		
		//when
		boolean result = strategyValidator.isValid(null, context);
		
		//then
		Assert.assertFalse(result);	
	}
}
