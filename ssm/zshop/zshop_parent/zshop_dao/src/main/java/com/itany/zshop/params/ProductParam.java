package com.itany.zshop.params;

import java.io.Serializable;

/**
 * Author：汤小洋
 * Date：2018-05-15 11:06
 * Description：<描述>
 */
public class ProductParam implements Serializable {

    private String name;

    private Double minPrice;

    private Double maxPrice;

    private Integer productTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}
