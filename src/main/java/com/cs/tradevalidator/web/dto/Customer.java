package com.cs.tradevalidator.web.dto;

public enum Customer {
	
PLUTO1("PLUTO1"), PLUTO2("PLUTO2");
	private String name;
	
private Customer(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
}

