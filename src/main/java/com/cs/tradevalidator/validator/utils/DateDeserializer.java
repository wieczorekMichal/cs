package com.cs.tradevalidator.validator.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateDeserializer extends StdDeserializer<LocalDate>{

	public DateDeserializer(Class<?> clazz) {
		super(clazz);
	}

	public DateDeserializer() {
		this(null);
	}
	
	@Override
	public LocalDate deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
		String date = jsonParser.getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			return LocalDate.parse(date, formatter);
		}catch (Exception e) {
			//TODO: add logger
			return null;
		}
		
	}

}
