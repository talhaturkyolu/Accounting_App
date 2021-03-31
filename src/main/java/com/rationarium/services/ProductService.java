package com.rationarium.services;

import com.rationarium.dto.ProductDTO;
import com.rationarium.entity.Category;
import com.rationarium.entity.Company;
import com.rationarium.enums.Status;
import com.rationarium.enums.Unit;

import java.util.List;

public interface ProductService {

    void save(ProductDTO dto);
    void delete(String username);
    ProductDTO update(ProductDTO dto);
    List<ProductDTO> listAllProducts();
    List<ProductDTO> listAllByName(String name);
    List<ProductDTO> listAllByDescription(String description);
    List<ProductDTO> listAllByQuantity(Integer quantity);
    List<ProductDTO> listAllByUnit(Unit unit);
    List<ProductDTO> listAllByCategory(Category category);
    List<ProductDTO> listAllByStatus(Status status);

}
