package com.cs.tradevalidator.web.dto;

public enum Style {
EUROPEAN("EUROPEAN"), AMERICAN("AMERICAN");

private String name;

private Style(String name) {
this.name = name;
}

public String getName() {
return name;
}
}
