package com.cs.tradevalidator.web.dto;

public enum LegalEntity {
	CS_ZURICH("CS Zurich");
	
	private String name;

	public String getName() {
		return name;
	}

	private LegalEntity(String name) {
		this.name = name;
	}
}
