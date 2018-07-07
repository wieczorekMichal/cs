package com.cs.tradevalidator.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.cs.tradevalidator.annotation.ComparingDatesConstraint;
import com.cs.tradevalidator.annotation.CurrencyConstraint;
import com.cs.tradevalidator.annotation.CustomerConstraint;
import com.cs.tradevalidator.annotation.DirectionConstraint;
import com.cs.tradevalidator.annotation.LegalEntityConstraint;
import com.cs.tradevalidator.annotation.StrategyConstraint;
import com.cs.tradevalidator.annotation.StyleConstraint;
import com.cs.tradevalidator.annotation.TypeConstraint;
import com.cs.tradevalidator.annotation.WeekendConstraint;
import com.cs.tradevalidator.validator.utils.DateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@ComparingDatesConstraint.List({ 
    @ComparingDatesConstraint(
    		earlierDate = "tradeDate", 
    		laterDate = "deliveryDate",
    		message = "deliveryDate has to be after tradeDate"
 ),
    @ComparingDatesConstraint(
    		earlierDate = "tradeDate", 
    		laterDate = "expiryDate",
    		message = "expiryDate has to be after tradeDate"
 ),
    @ComparingDatesConstraint(
    		earlierDate = "tradeDate", 
    		laterDate = "premiumDate",
    		message = "premiumDate has to be after tradeDate"
 ),
    @ComparingDatesConstraint(
    		earlierDate = "tradeDate", 
    		laterDate = "excerciseStartDate",
    		message = "excerciseStartDate has to be after tradeDate"
 )   
})
public class Trade {

	@CustomerConstraint
	private String customer;
	
	private String ccyPair;
	
	@TypeConstraint
	private String type;
	
	@StyleConstraint
	private String style;
	
	@DirectionConstraint
	private String direction;
	
	@StrategyConstraint
	private String strategy;
	
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDate tradeDate;
	
	private BigDecimal amount1;
	private BigDecimal amount2;
	private float rate;
	
	@WeekendConstraint(message = "deliveryDate cannot fall on weekend")
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDate deliveryDate;
	
	@WeekendConstraint(message = "expiryDate cannot fall on weekend")
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDate expiryDate;
	
	@WeekendConstraint(message = "excerciseStartDate cannot fall on weekend")
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDate excerciseStartDate;
	
	@CurrencyConstraint
	private String payCcy;
	
	private BigDecimal premium;
	
	@CurrencyConstraint
	private String premiumCcy;
	
	private String premiumType;
	
	@WeekendConstraint(message = "premiumDate cannot fall on weekend")
	@JsonDeserialize(using = DateDeserializer.class)
	private LocalDate premiumDate;

	@LegalEntityConstraint
	private String legalEntity;
	private String trader;
	@Override
	public String toString() {
		return "Trade [customer=" + customer + ", ccyPair=" + ccyPair + ", type=" + type + ", style=" + style
				+ ", direction=" + direction + ", strategy=" + strategy + ", tradeDate=" + tradeDate + ", amount1="
				+ amount1 + ", amount2=" + amount2 + ", rate=" + rate + ", deliveryDate=" + deliveryDate
				+ ", expiryDate=" + expiryDate + ", payCcy=" + payCcy + ", premium=" + premium + ", premiumCcy="
				+ premiumCcy + ", premiumType=" + premiumType + ", premiumDate=" + premiumDate + ", legalEntity="
				+ legalEntity + ", trader=" + trader + "]";
	}
	
}
