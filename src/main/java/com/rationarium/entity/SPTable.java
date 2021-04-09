package com.rationarium.entity;

import com.rationarium.enums.CompanyStatus;
import com.rationarium.enums.CompanyType;
import com.rationarium.enums.State;
import com.rationarium.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "SPTable")
public class SPTable extends BaseEntity{


    private String companyName;
    private String phone;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company companyId;
    @Enumerated(EnumType.STRING)
    private CompanyType type;
    private String zipCode;
    @Column(length =255)
    private String address;
    @Enumerated(EnumType.STRING)
    private State state;
    private boolean enabled;
    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;
}
