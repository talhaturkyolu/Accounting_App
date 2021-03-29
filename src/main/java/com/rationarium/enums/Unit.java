package com.rationarium.enums;

public enum Unit {

    POUND("LB"), PIECE("Piece");

    private final String value;

    private Unit(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
