package com.rationarium.dto;

import com.rationarium.enums.Status;
import com.rationarium.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private Integer quantity;
    private CategoryDTO categoryDTO;
    private Status status;
    private String description;
    private String tax;
    private Unit unit;

}
