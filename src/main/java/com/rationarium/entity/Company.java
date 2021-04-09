package com.rationarium.entity;

import com.rationarium.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "Company")
public class Company extends BaseEntity{


    private String title;
    private String address1;
    private String address2;
    @Enumerated(EnumType.STRING)
    private State state;
    private String zip;
    private String representative;
    private String email;
    private LocalDate establishmentDate;
    private boolean enabled;
    private String phoneNumber;

}
