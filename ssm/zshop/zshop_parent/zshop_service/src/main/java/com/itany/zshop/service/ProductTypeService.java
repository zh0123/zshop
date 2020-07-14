package com.itany.zshop.service;

import com.itany.zshop.common.exception.ProductTypeExistException;
import com.itany.zshop.pojo.ProductType;

import java.util.List;

public interface ProductTypeService {
   public List<ProductType> findAll ();
   //添加商品类型
   //判断商品类型是否已存在，存在则抛出异常
  public void add(String name) throws ProductTypeExistException;

    ProductType findById(int id);

    void modifyName (int id, String name) throws ProductTypeExistException;

    void removeById(int id);

    void modifyStatus(int id);

    List<ProductType> findEnable();
}
