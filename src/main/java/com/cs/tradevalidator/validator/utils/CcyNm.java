package com.cs.tradevalidator.validator.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CcyNm {
@JsonProperty(value="-IsFund")
private String isFund;
@JsonProperty(value="#text")
private String text;
}
