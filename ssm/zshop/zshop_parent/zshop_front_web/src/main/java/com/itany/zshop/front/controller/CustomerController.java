package com.itany.zshop.front.controller;

import com.itany.zshop.common.constant.ResponseStatusConstant;
import com.itany.zshop.common.exception.LoginErrorException;
import com.itany.zshop.common.exception.PhoneNotRegistException;
import com.itany.zshop.common.util.RedisUtils;
import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/front/customer")
public class CustomerController {
   @Autowired
    private CustomerService customerService;
    @RequestMapping("/loginByAccount")
    @ResponseBody//表示显示ajax
    public ResponseResult loginByAccount(String loginName, String password, HttpSession session, Model model){
       ResponseResult result = new ResponseResult();
        try {
            Customer customer = customerService.login(loginName,password);
            session .setAttribute("customer",customer);
            model.addAttribute("loginName",loginName);
            result.setDate(customer);
            result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
        } catch (LoginErrorException e) {
            result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_FAILSE);
          result.setMessage(e.getMessage());
        }
        return result;
    }
    @RequestMapping("/logout")
    @ResponseBody
    public ResponseResult logout(HttpSession session) {
        session.invalidate();
        return ResponseResult.success();
    }
    @RequestMapping("/loginBySms")
    @ResponseBody
    public ResponseResult loginBySms(String phone, int verificationCode, HttpSession session) {
        ResponseResult result = ResponseResult.fal();
        try {
            //判断手机号是否注册
            Customer customer = customerService.findByPhone(phone);

            //判断验证码是否存在
            //Object obj = session.getAttribute("randVerificationCode");
            //从Redis中获取验证码
          String str = RedisUtils.get(session.getId());

            if (!ObjectUtils.isEmpty(str)) {
                //判断验证码是否正确
               Integer randVerificationCode = Integer.parseInt(str);
               //Integer randVerificationCode = (Integer)obj;

                if (randVerificationCode == verificationCode) {
                    session.setAttribute("customer", customer);
                    result.setDate(customer);
                    result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
                } else {
                    result.setMessage("验证码不正确");
                }
            } else {
                result.setMessage("验证码不存在或已过期，请重新输入");
            }
        } catch (PhoneNotRegistException e) {
            result.setMessage(e.getMessage());
        }
        return result;
    }
    @RequestMapping("/modify")
    public String modify(Customer customer, HttpSession session, Model model){
        System.out.println(customer.getName());
        //将vo转为dto
        try{

            customerService.update(customer);
            model.addAttribute("successMsg","修改成功");
        }  catch (Exception e) {
            model.addAttribute("errorMsg",e.getMessage());
        }
        return "center";
    }
}
