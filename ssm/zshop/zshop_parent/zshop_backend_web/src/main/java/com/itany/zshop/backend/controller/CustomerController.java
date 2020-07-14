package com.itany.zshop.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itany.zshop.backend.vo.ProductVo;
import com.itany.zshop.common.constant.PaginationConstant;
import com.itany.zshop.common.exception.SysuserNotExistException;
import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.dao.RoleDao;
import com.itany.zshop.dto.ProductDto;
import com.itany.zshop.params.SysuserParam;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.pojo.Role;
import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.service.CustomerService;
import com.itany.zshop.service.SysuserService;
import com.itany.zshop.vo.SysuserVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/backend/customerSysuser")
public class CustomerController {
    @Autowired
     private CustomerService customerService;
    @Autowired
    private RoleDao roleDao;
  @ModelAttribute("customerroles")
    public List<Customer> loadRole(){

      return customerService.findAll();
    }
    @RequestMapping("/findAll")
    public String login(Integer pageNum, Model model){
        System.out.println(pageNum);
        System.out.println("pageNum="+pageNum);
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum = PaginationConstant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
        List<Customer> customers = customerService.findAll();
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(customers);
        model.addAttribute("pageInfo",pageInfo);
            return "customerManager";

    }

    @RequestMapping("findById")
    @ResponseBody
    public ResponseResult findById(int id){
      Customer customer = customerService.findById(id);
      return ResponseResult.success(customer);
    }
    @RequestMapping("/modify")
    public String modify(Customer customer, Integer pageNum, HttpSession session, Model model){
        System.out.println(customer.getName());
        //将vo转为dto
        try{

            customerService.update(customer);
            model.addAttribute("successMsg","修改成功");
        }  catch (Exception e) {
            model.addAttribute("errorMsg",e.getMessage());
        }
        return "forward:findAll?pageNum="+pageNum;
    }
    @RequestMapping("/modifyStatus")
    @ResponseBody
    public ResponseResult modifyStatus(int id){
        System.out.println("id="+id);
        customerService.modifyStatus(id);
        return ResponseResult.success();
    }
    @RequestMapping("/findByParams")
    public String findByParams(Customer customer,Integer pageNum,Model model){
        System.out.println("customer="+customer.getName());
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum = PaginationConstant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);

        List<Customer> customers = customerService.findByParams(customer);
        System.out.println("customers="+customers);
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(customers);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println(pageInfo.getList());
        return "customerManager";
    }

}

