package com.rationarium.repository;

import com.rationarium.entity.Company;
import com.rationarium.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Company findByTitle(String title);
    Company findByRepresentative(String representative);
    List<Company> findAllByState(State state);
    List<Company> findAllByZip(String zip);
    Company findByEmail(String email);
    List<Company> findAllByEstablishmentDate(LocalDate localDate);
    List<Company> findAllByEstablishmentDateAfter(LocalDate localDate);
    List<Company> findAllByEstablishmentDateBefore(LocalDate localDate);
    List<Company> findAllByEstablishmentDateIsBetween(LocalDate localDate,LocalDate localDate2);
    List<Company> findAllByEnabledIsTrue();
    List<Company> findAllByEnabledIsFalse();
    Company findByPhoneNumber(String phoneNumber);

}
