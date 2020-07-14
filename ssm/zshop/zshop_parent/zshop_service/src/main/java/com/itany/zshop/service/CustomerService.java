package com.itany.zshop.service;

import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.pojo.Customer;

import java.util.List;

public interface CustomerService {
    public Customer login(String loginName,String password) throws LoginErrorException;

    Customer findByPhone(String phone) throws PhoneNotRegistException;
    List<Customer> findAll();
    void delete(int id);
    Customer findById(int id);
    void update(Customer customer);

    void modifyStatus(int id);
    void  updateStstus(int id,int status);

    List<Customer> findByParams(Customer customer);
}
