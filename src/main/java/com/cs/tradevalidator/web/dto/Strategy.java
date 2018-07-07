package com.cs.tradevalidator.web.dto;

public enum Strategy {
CALL("CALL");

private String name;

public String getName() {
	return name;
}

private Strategy(String name) {
	this.name = name;
}

}
