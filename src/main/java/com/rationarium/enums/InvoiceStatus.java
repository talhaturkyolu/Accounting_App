package com.rationarium.enums;

public enum InvoiceStatus {

    DRAFT("Draft"),SENT("Sent"),VIEWED("Viewed"),
    PARTIAL("Partial"),PAID("Paid"),OVERDUE("Overdue"), CANCELED("Canceled");

    private final String value;

    private InvoiceStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
