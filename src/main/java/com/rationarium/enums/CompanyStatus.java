package com.rationarium.enums;

public enum CompanyStatus {

    ACTIVE("Active"),CLOSED("Closed");

    private final String value;

    private CompanyStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
