package com.cs.tradevalidator.web.dto;

public enum Direction {
SELL("SELL"), BUY("BUY");

private String name;

private Direction(String name) {
this.name = name;
}

public String getName() {
return name;
}
}
