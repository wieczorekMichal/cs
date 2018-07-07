package com.cs.tradevalidator.validator.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyDto {

	
	@JsonProperty(value="CtryNm")
	private String ctryNm;
	
	@JsonProperty(value="CcyNm")
	private String ccyNm;
	
	@JsonProperty(value="Ccy")
	private String ccy;
	
	@JsonProperty(value="CcyNbr")
	private String ccyNbr;
	
	@JsonProperty(value="CcyMnrUnts")
	private String ccyMnrUnts;
}
