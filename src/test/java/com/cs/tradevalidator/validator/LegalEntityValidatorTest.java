package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Customer;
import com.cs.tradevalidator.web.dto.LegalEntity;


public class LegalEntityValidatorTest extends ValidatorTest{
	
@Autowired
private LegalEntityValidator legalEntityValidator;


	@Test
	public void shouldReturnTrueForValidLegalEntity_CS_ZURICH () {
		//given
		
		//when
		boolean result = legalEntityValidator.isValid(LegalEntity.CS_ZURICH.getName(), context);
		
		//then
		Assert.assertTrue(result);	
	}

	@Test
	public void shouldReturnFalseForInvalidLegalEntity () {
		//given
		
			//when
			boolean result = legalEntityValidator.isValid("Invalid", context);
			
			//then
			Assert.assertFalse(result);	
	}
	
	@Test
	public void shouldReturnFalseForNullLegalEntity () {
		//given
		
		//when
		boolean result = legalEntityValidator.isValid(null, context);
		
		//then
		Assert.assertFalse(result);	
	}

}

