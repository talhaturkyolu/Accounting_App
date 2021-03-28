package com.rationarium.enums;

public enum  InvoiceType {

    PURCHASE("Purchase"), SELL("Sell");

    private final String value;

    private InvoiceType(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
