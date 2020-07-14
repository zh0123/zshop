package com.itany.zshop.dao;

import com.itany.zshop.pojo.Cart;
import com.itany.zshop.pojo.Order;

import java.util.List;

public interface OrderDao {
    public void add(Order order);

    void insert(Cart cart);


    List<Cart> find(Cart cart);

    void delete(Integer id);
}
