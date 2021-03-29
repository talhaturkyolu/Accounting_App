package com.rationarium.Dto;

import com.rationarium.enums.CompanyStatus;
import com.rationarium.enums.CompanyType;
import com.rationarium.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SPTableDTO {

    private Long id;
    private String companyName;
    private String phoneNumber;
    private String email;
    private CompanyType companyType;
    private String zipCode;
    private String address;
    private State state;
    private CompanyStatus companyStatus;


}
