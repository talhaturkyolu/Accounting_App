package com.rationarium.services;


import com.rationarium.dto.CategoryDTO;
import com.rationarium.dto.ProductDTO;
import com.rationarium.enums.Status;

import java.util.List;

public interface CategoryService {

    void save(CategoryDTO dto);
    void delete(String description);
    CategoryDTO update(CategoryDTO dto);
    List<CategoryDTO> listAllCategories();
    List<ProductDTO> listAllByStatus(Status status);


}
