package com.rationarium.Dto;

import com.rationarium.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String FirstName;
    private String LastName;
    private String password;
    private String phoneNumber;
    private String email;
    private RoleDTO roleDTO;
    private CompanyDTO companyDTO;
    private UserStatus userStatus;

}
