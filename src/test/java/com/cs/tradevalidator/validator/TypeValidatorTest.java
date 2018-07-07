package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Type;

public class TypeValidatorTest extends ValidatorTest{

	@Autowired
	private TypeValidator typeValidator;


	@Test
	public void shouldReturnTrueForValidType_FORWARD () {
		//given
		
		//when
		boolean result = typeValidator.isValid(Type.FORWARD.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnTrueForValidType_SPOT () {
		//given
		
		//when
		boolean result = typeValidator.isValid(Type.SPOT.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnTrueForValidType_VANILLA_OPTION () {
		//given
		
		//when
		boolean result = typeValidator.isValid(Type.VANILLA_OPTION.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}
	
	@Test
	public void shouldReturnFalseForInvalidType () {
		//given
		
		//when
		boolean result = typeValidator.isValid("Invalid", context);
		
		//then
		Assert.assertFalse(result);	
	}
	
	@Test
	public void shouldReturnFalseForNullType () {
		//given
		
		//when
		boolean result = typeValidator.isValid(null, context);
		
		//then
		Assert.assertFalse(result);	
	}
}
