package com.itany.zshop.dao;

import com.itany.zshop.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {
    public Customer selectByLoginNameAndPassword(@Param("loginName") String loginName, @Param("password") String password, @Param("isValid") Integer isValid);

    Customer selectByPhone(String phone);
    List<Customer> findAll();

    Customer findById(int id);

    void update( Customer customer);

    void modifyStatus(int id);

    void updateStatus(@Param("id") int id, @Param("isValid")  int status);

    List<Customer> findByParams(Customer customer);
}
