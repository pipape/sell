package com.imooc.sell.impl;

import com.imooc.sell.dataaobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryIdIn() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryIdIn(list);
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    @Transactional
    public void save() {
        ProductCategory result = categoryService.save(new ProductCategory("营销最佳" , 3));
        Assert.assertNotNull(result);
    }
}