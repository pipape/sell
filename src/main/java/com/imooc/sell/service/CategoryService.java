package com.imooc.sell.service;

import com.imooc.sell.dataaobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryIdIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
