package com.rationarium.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Category")
public class Category extends BaseEntity{

    private String description;
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

}
