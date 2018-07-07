package com.cs.tradevalidator.validator;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.cs.tradevalidator.ValidatorTest;
import com.cs.tradevalidator.annotation.ComparingDatesConstraint;
import com.cs.tradevalidator.web.dto.Trade;


public class ComparingDatesValidatorTest extends ValidatorTest{
	
//@Autowired
//private ComparingDatesValidator comparingDatesValidator;

private ComparingDatesValidator comparingDatesValidator = Mockito.spy( new ComparingDatesValidator()); 

@Test
public void shouldReturnTrue_WhenEarlierDateIsBeforeLaterDate () {
	//given
	LocalDate earlierDate = LocalDate.of(2016, 10, 1);
	LocalDate laterDate = LocalDate.of(2017, 10, 1);
	Trade trade = Trade.builder().tradeDate(earlierDate).deliveryDate(laterDate).build();
	
	ComparingDatesConstraint comparingDatesConstraintMock = Mockito.mock(ComparingDatesConstraint.class);
	
	Mockito.doReturn("tradeDate")
    .when(comparingDatesConstraintMock)
    .earlierDate();
	
	Mockito.doReturn("deliveryDate")
    .when(comparingDatesConstraintMock)
    .laterDate();

	comparingDatesValidator.initialize(comparingDatesConstraintMock);
	
	//when
	boolean result = comparingDatesValidator.isValid(trade, context);
	
	//then
	Assert.assertTrue(result);	
}

@Test
public void shouldReturnFalse_WhenEarlierDateIsAfterLaterDate () {
	//given
	LocalDate earlierDate = LocalDate.of(2018, 10, 1);
	LocalDate laterDate = LocalDate.of(2017, 10, 1);
	Trade trade = Trade.builder().tradeDate(earlierDate).deliveryDate(laterDate).build();
	
	ComparingDatesConstraint comparingDatesConstraintMock = Mockito.mock(ComparingDatesConstraint.class);
	
	Mockito.doReturn("tradeDate")
    .when(comparingDatesConstraintMock)
    .earlierDate();
	
	Mockito.doReturn("deliveryDate")
    .when(comparingDatesConstraintMock)
    .laterDate();
	
	comparingDatesValidator.initialize(comparingDatesConstraintMock);
	
	//when
	boolean result = comparingDatesValidator.isValid(trade, context);
	
	//then
	Assert.assertFalse(result);	
}

}

