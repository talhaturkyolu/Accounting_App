package com.rationarium.services;


import com.rationarium.dto.InvoiceDTO;
import com.rationarium.dto.ProductDTO;
import com.rationarium.entity.Company;
import com.rationarium.entity.InvoiceNumber;
import com.rationarium.enums.InvoiceStatus;
import com.rationarium.enums.Status;

import java.time.LocalDate;
import java.util.List;

public interface InvoiceService {

    void addItem(InvoiceDTO dto);
    void delete(String invoiceNumber);
    InvoiceDTO update(InvoiceDTO dto);
    void approve(String invoiceNumber);
    List<InvoiceDTO> listAllInvoices();
    InvoiceDTO findByInvoiceNumber(InvoiceNumber invoiceNumber);
    InvoiceDTO findByInvoiceDate(LocalDate localDate);
    List<InvoiceDTO> listAllByCompany(Company company);
    List<InvoiceDTO> listAllByCost(Integer cost);
    List<InvoiceDTO> listAllByTax(Integer tax);
    List<InvoiceDTO> listAllByProduct(ProductDTO productDTO);
    List<InvoiceDTO> listAllByStatus(InvoiceStatus status);

}
