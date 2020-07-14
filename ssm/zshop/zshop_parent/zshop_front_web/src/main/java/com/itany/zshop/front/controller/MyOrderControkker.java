package com.itany.zshop.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("front/customer")
public class MyOrderControkker {

    @RequestMapping("look")
    public String look(){
        return "myOrders";
    }
}
