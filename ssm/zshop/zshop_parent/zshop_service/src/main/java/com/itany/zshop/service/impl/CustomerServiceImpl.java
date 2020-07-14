package com.itany.zshop.service.impl;

import com.itany.zshop.common.constant.CustomerConstant;
import com.itany.zshop.common.constant.ProductTypeConstant;
import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.dao.CustomerDao;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)

public class CustomerServiceImpl implements CustomerService {
   @Autowired
   private CustomerDao customerDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Customer login(String loginName, String password) throws LoginErrorException {
      Customer customer = customerDao.selectByLoginNameAndPassword(loginName,password, CustomerConstant.CUSTOMER_VALID);
      if (customer==null){
          throw new LoginErrorException("登录失败，用户名或密码不正确");
      }
        return customer;
    }

    @Override
    public Customer findByPhone(String phone) throws PhoneNotRegistException {
        Customer customer = customerDao.selectByPhone(phone);
        if (customer == null) {
            throw new PhoneNotRegistException("该手机号码尚未注册");
        }
        return customer;
    }

    @Override
    public List<Customer> findAll() {
      List<Customer> customer =  customerDao.findAll();
        return customer;
    }

    @Override
    public void updateStstus(int id, int status) {
        customerDao.updateStatus(id,status);
    }

    @Override
    public void modifyStatus(int id) {
       Customer customer = findById(id);
        int status = customer.getIsValid();
        System.out.println("s1="+status);
        if(status== ProductTypeConstant.Product_TYPE_ENABLE){
            status = ProductTypeConstant.Product_TYPE_DISABLE;
        }else {
            status = ProductTypeConstant.Product_TYPE_ENABLE;
        }
        System.out.println("s2="+status);
        updateStstus(id,status);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public List<Customer> findByParams(Customer customer) {
        List<Customer> customers= customerDao.findByParams(customer);
        return customers;
    }
}
