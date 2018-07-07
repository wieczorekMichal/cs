package com.cs.tradevalidator.validator;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cs.tradevalidator.annotation.CurrencyConstraint;
import com.cs.tradevalidator.validator.utils.CurrencyDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CurencyValidator implements
ConstraintValidator<CurrencyConstraint, String> {

  private static List<CurrencyDto> currencyList = new ArrayList<CurrencyDto>();
  private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
   
  @Override
  public void initialize(CurrencyConstraint currencyConstraint) {
  }

  @Override
  public boolean isValid(String currencyValue, ConstraintValidatorContext cxt) {
		if(currencyList.isEmpty()) {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<CurrencyDto>> typeReference = new TypeReference<List<CurrencyDto>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/codes/currency-codes-ISO-4217.json");
			try {
				currencyList = mapper.readValue(inputStream, typeReference);
				
			} catch (IOException e){
				logger.error("Exception occured during deserialization: " + e.getMessage());
			}
		}
		return	currencyList.stream().anyMatch(iso -> currencyValue.equalsIgnoreCase(iso.getCcy()));
       }

}