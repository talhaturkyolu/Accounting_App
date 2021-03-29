package com.rationarium.dto;

import com.rationarium.entity.InvoiceNumber;
import com.rationarium.entity.InvoiceProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO {

    private Long id;
    private InvoiceNumber invoiceNumber;
    private LocalDate invoiceDate;
    private SPTableDTO vendor;
    private BigDecimal cost;
    private BigDecimal tax;
    private BigDecimal total;
    private InvoiceProduct product;
    private Integer quantity;
    private BigDecimal price;


}
