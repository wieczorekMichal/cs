package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Direction;

public class DirectionValidatorTest extends ValidatorTest{

	@Autowired
	private DirectionValidator directionValidator;


	@Test
	public void shouldReturnTrueForValidDirection_BUY () {
		//given
		
		//when
		boolean result = directionValidator.isValid(Direction.BUY.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnTrueForValidDirection_SELL () {
		//given
		
		//when
		boolean result = directionValidator.isValid(Direction.SELL.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnFalseForInvalidDirection () {
		//given
		
		//when
		boolean result = directionValidator.isValid("Invalid", context);
		
		//then
		Assert.assertFalse(result);	
	}
	
	@Test
	public void shouldReturnFalseForNullDirection () {
		//given
		
		//when
		boolean result = directionValidator.isValid(null, context);
		
		//then
		Assert.assertFalse(result);	
	}
}
