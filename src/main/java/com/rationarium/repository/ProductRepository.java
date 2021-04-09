package com.rationarium.repository;

import com.rationarium.entity.Category;
import com.rationarium.entity.Company;
import com.rationarium.entity.Product;
import com.rationarium.enums.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByName(String name);
    List<Product> findAllByDescription(String description);
    //QUANTITY
    List<Product> findAllByQtyBetween(Integer qty1, Integer qty2);
    List<Product> findAllByQtyEquals(Integer qty);
    List<Product> findAllByQtyGreaterThanEqual(Integer qty);
    List<Product> findAllByQtyGreaterThan(Integer qty);
    List<Product> findAllByQtyLessThanEqual(Integer qty);
    List<Product> findAllByQtyLessThan(Integer qty);
    //PRICE
    List<Product> findAllByPriceEquals(Integer price);
    List<Product> findAllByPriceGreaterThanEqual(Integer price);
    List<Product> findAllByPriceGreaterThan(Integer price);
    List<Product> findAllByPriceLessThanEqual(Integer price);
    List<Product> findAllByPriceLessThan(Integer price);

    List<Product> findAllByCategory(Category category);
    List<Product> findAllByUnit(Unit unit);
    List<Product> findAllByLowLimitAlertEquals(Integer unit);

    List<Product> findAllByCompany(Company company);
    List<Product> findAllByEnabledIsTrue();
    List<Product> findAllByEnabledIsFalse();

}
