package com.rationarium.Dto;

import com.rationarium.enums.CompanyStatus;
import com.rationarium.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private Long id;
    private String title;
    private String address;
    private State state;
    private String zip;
    private String representative;
    private String email;
    private LocalDate establishmentDate;
    private String phone;
    private CompanyStatus companyStatus;

}
