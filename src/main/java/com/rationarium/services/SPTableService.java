package com.rationarium.services;

import com.rationarium.dto.SPTableDTO;
import com.rationarium.enums.CompanyType;
import com.rationarium.enums.State;
import com.rationarium.enums.Status;
import java.util.List;

public interface SPTableService {

    List<SPTableDTO> listAllCompanies();
    SPTableDTO findByCompanyName(String title);
    List<SPTableDTO> listAllByPhone(Status phone);
    SPTableDTO findByEmail(String email);
    List<SPTableDTO> findByCompanyType(CompanyType companyType);
    List<SPTableDTO> findByZipCode(String zipCode);
    List<SPTableDTO> listAllByState(State state);
    List<SPTableDTO> listAllByAddress(String Address);
    List<SPTableDTO> listAllByStatus(Status status);
    void save(SPTableDTO dto);
    SPTableDTO update(SPTableDTO dto);
    void delete(String username);
    SPTableDTO findById(Integer id);





}
