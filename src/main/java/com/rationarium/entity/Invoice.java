package com.rationarium.entity;

import com.rationarium.enums.InvoiceStatus;
import com.rationarium.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Invoice")
public class Invoice extends BaseEntity{

    private String invoiceNo;
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;
    private int invoiceNumber;
    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;
    private LocalDate invoiceDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private SPTable spTable;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
    private boolean enabled;


}
