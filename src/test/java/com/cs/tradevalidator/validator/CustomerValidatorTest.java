package com.cs.tradevalidator.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.web.dto.Customer;


public class CustomerValidatorTest extends ValidatorTest{
	
@Autowired
private CustomerValidator customerValidator;


@Test
public void shouldReturnTrueForValidCustomer_PLUTO1 () {
	//given
	
	//when
	boolean result = customerValidator.isValid(Customer.PLUTO1.getName(), context);
	
	//then
	Assert.assertTrue(result);	
}

@Test
public void shouldReturnTrueForValidCustomer_PLUTO2 () {
	//given
	
	//when
	boolean result = customerValidator.isValid(Customer.PLUTO2.getName(), context);
	
	//then
	Assert.assertTrue(result);	
}

@Test
public void shouldReturnFalseForInvalidCustomer () {
	//given
	
	//when
	boolean result = customerValidator.isValid("InvalidCustomer", context);
	
	//then
	Assert.assertFalse(result);	
}

@Test
public void shouldReturnFalseForNullCustomer () {
	//given
	
	//when
	boolean result = customerValidator.isValid(null, context);
	
	//then
	Assert.assertFalse(result);	
}

}

