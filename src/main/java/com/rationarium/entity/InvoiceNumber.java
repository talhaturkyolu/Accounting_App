package com.rationarium.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "invoiceNumber")
public class InvoiceNumber extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
    private Integer year;
    private Integer invoiceNumber;

}
