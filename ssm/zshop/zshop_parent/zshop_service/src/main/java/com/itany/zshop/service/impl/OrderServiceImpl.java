package com.itany.zshop.service.impl;

import com.itany.zshop.dao.OrderDao;
import com.itany.zshop.pojo.Cart;
import com.itany.zshop.pojo.Order;
import com.itany.zshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {
    @Override
    public void insert(Cart cart) {
        orderDao.insert(cart);
    }

    @Autowired
    private OrderDao orderDao;
    @Override
    public void add(Order order) {
        order.setCreateDate(new Date());
        orderDao.add(order);
    }

    @Override
    public List<Cart> find(Cart cart) {
        List<Cart> carts= orderDao.find(cart);
    return carts;
    }

    @Override
    public void delete(Integer id) {
        orderDao.delete(id);
    }
}
