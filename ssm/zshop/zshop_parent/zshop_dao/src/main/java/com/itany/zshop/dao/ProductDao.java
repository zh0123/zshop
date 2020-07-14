package com.itany.zshop.dao;

import com.itany.zshop.params.ProductParam;
import com.itany.zshop.pojo.Product;
import com.itany.zshop.pojo.ProductType;

import java.util.List;

public interface ProductDao {
    public void insert(Product product);

    Product selectName(String name);

    List<Product> selectAll();
    Product selectById(int id);
    void update(Product product);
    void deleteById(int id);

    List<Product> selectByParams(ProductParam productParam);
}
