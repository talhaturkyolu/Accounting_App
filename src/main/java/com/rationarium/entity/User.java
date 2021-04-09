package com.rationarium.entity;

import com.rationarium.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "User_Table")
public class User extends BaseEntity{

    @Column(length = 50)
    private String email;
    @Column(length = 255)
    private String firstName;
    @Column(length = 255)
    private String lastName;
    @Column(length = 50)
    private String password;
    @Column(length = 50)
    private boolean enabled;
    private String phone;
    private Status status;


    @ManyToMany
    @JoinTable(name = "UserRole",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roleList;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;


}
