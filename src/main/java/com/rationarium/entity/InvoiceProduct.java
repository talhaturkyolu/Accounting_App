package com.rationarium.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "InvoiceProduct")
public class InvoiceProduct extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Invoice invoice;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    private BigDecimal unitPrice;
    private Integer qty;

}
