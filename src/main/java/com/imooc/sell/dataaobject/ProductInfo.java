package com.imooc.sell.dataaobject;

import com.imooc.sell.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@Proxy(lazy = false)
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String product_icon;

    //0正常，1下架
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    private Integer categoryType;

    public ProductInfo() {
    }

    ;

    public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productDescription, String product_icon, Integer productStatus, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.product_icon = product_icon;
        this.productStatus = productStatus;
        this.categoryType = categoryType;
    }
}
