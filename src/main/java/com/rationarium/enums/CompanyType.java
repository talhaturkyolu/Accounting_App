package com.rationarium.enums;

public enum CompanyType {

    VENDOR("Vendor"), CLIENT("Client"), BOTH("Both");

    private final String value;

    private CompanyType(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
