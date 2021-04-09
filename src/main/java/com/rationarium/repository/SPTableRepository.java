package com.rationarium.repository;

import com.rationarium.entity.SPTable;
import com.rationarium.enums.CompanyStatus;
import com.rationarium.enums.CompanyType;
import com.rationarium.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface SPTableRepository extends JpaRepository<SPTable,Long> {

    SPTable findByCompanyName(String companyName);
    SPTable findByPhone(String phoneNumber);
    SPTable findByEmail(String email);
    SPTable findByCompanyId(String companyID);
    List<SPTable> findAllByType(CompanyType companyType);
    List<SPTable> findAllByZipCode(String zipCode);
    List<SPTable> findAllByState(State state);
    List<SPTable> findAllByEnabledIsFalse();
    List<SPTable> findAllByEnabledIsTrue();
    List<SPTable> findAllByCompanyStatus(CompanyStatus companyStatus);
    List<SPTable> findAllByAddressContains(String address);
    @Transactional
    void deleteByEmail(String email);

}
