package com.imooc.sell.repository;

import com.imooc.sell.dataaobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryIdIn(List<Integer> categoryTypeList);

}
