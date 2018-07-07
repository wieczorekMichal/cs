package com.cs.tradevalidator;

import javax.validation.ConstraintValidatorContext;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidatorTest {

	protected ConstraintValidatorContext context;
	
	@Before
	public void setup() {
	 context = Mockito.mock(ConstraintValidatorContext.class);
	}
	
}
