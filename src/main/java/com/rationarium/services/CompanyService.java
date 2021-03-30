package com.rationarium.services;

import com.rationarium.dto.CompanyDTO;
import com.rationarium.enums.State;
import com.rationarium.enums.Status;

import java.time.LocalDate;
import java.util.List;

public interface CompanyService {

    List<CompanyDTO> listAllCompanies();
    CompanyDTO findByTitle(String title);
    CompanyDTO findByRepresentative(String representative);
    CompanyDTO findByEmail(String email);
    void save(CompanyDTO dto);
    CompanyDTO update(CompanyDTO dto);
    void delete(String username);
    List<CompanyDTO> listAllByZip(String zipCode);
    List<CompanyDTO> listAllByState(State state);
    List<CompanyDTO> listAllByStatus(Status status);
    List<CompanyDTO> listAllByPhone(Status phone);
    List<CompanyDTO> listAllByEstablishmentDate(LocalDate localDate);
}
