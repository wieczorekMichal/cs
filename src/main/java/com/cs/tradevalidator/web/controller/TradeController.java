package com.cs.tradevalidator.web.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.tradevalidator.web.dto.Trade;


@RestController
@RequestMapping("/trade")
public class TradeController {

	@PostMapping
	public ResponseEntity<String> validateTrade(@RequestBody @Valid Trade trade) {
		return new ResponseEntity<String>("Trade request validated successfully.", HttpStatus.OK);
		}
}
