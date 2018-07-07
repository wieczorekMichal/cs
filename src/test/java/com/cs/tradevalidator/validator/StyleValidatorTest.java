package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Direction;
import com.cs.tradevalidator.web.dto.Strategy;
import com.cs.tradevalidator.web.dto.Style;

public class StyleValidatorTest extends ValidatorTest{

	@Autowired
	private StyleValidator styleValidator;


	@Test
	public void shouldReturnTrueForValidStyle_AMERICAN () {
		//given
		
		//when
		boolean result = styleValidator.isValid(Style.AMERICAN.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	
	@Test
	public void shouldReturnTrueForValidStyle_EUROPEAN () {
		//given
		
		//when
		boolean result = styleValidator.isValid(Style.EUROPEAN.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnFalseForInvalidStyle () {
		//given
		
		//when
		boolean result = styleValidator.isValid("Asian", context);
		
		//then
		Assert.assertFalse(result);	
	}
	
	@Test
	public void shouldReturnFalseForNullStyle () {
		//given
		
		//when
		boolean result = styleValidator.isValid(null, context);
		
		//then
		Assert.assertFalse(result);	
	}
}
