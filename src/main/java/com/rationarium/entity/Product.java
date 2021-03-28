package com.rationarium.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "product")
public class Product extends BaseEntity{

    private String name;
    private String description;
    private Integer qty;
    private Integer price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    private String unit;
    private Integer lowLimitAlert;
    private Integer tax;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
    private boolean enabled;
}
