package com.rationarium.repository;

import com.rationarium.entity.Company;
import com.rationarium.entity.Role;
import com.rationarium.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Status;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

    List<User> findAllByRoleListIsContaining(Role role);

    List<User> findAllByCompany(Company company);

    List<User> findAllByPhoneIsContaining(String company);

    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<User> findAllByStatus(Status status);


}

