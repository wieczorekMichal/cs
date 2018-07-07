package com.cs.tradevalidator.web.dto;

public enum Type {

SPOT("Spot"), FORWARD("Forward"), VANILLA_OPTION("VanillaOption");
	
private String name;

public String getName() {
	return name;
}

private Type(String name) {
	this.name = name;
}

}
