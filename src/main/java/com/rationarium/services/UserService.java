package com.rationarium.services;

import com.rationarium.dto.UserDTO;
import com.rationarium.entity.Company;
import com.rationarium.enums.Status;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO findByEmail(String email);
    void save(UserDTO dto);
    UserDTO update(UserDTO dto);
    void delete(String username);
    List<UserDTO> listAllByRole(String role);
    List<UserDTO> listAllByUserName(String username);
    List<UserDTO> listAllByLastname(String lastname);
    List<UserDTO> listAllByPhoneNumber(String phoneNumber);
    List<UserDTO> listAllByStatus(Status status);
    List<UserDTO> listAllByCompany(Company company);


}
