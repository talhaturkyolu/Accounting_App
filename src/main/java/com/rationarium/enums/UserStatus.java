package com.rationarium.enums;

public enum UserStatus {

    ACTIVE("Active"), PASSIVE("Passive");

    private final String value;

    private UserStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }



}
