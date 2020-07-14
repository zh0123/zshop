package com.itany.zshop.front.controller;

import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.pojo.Cart;
import com.itany.zshop.pojo.Order;
import com.itany.zshop.pojo.Product;
import com.itany.zshop.service.OrderService;
import com.itany.zshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/front/customer")
public class CartController {
    @Autowired
private OrderService orderService;
    @Autowired
private ProductService productService;
    @RequestMapping("/lookCart")
    public String lookCart(HttpServletRequest request) {
          String id = request.getParameter("productId");
        System.out.println(id);
        //orderService.add(order);
        return "cart";
    }

    @RequestMapping("/findById")
    public String findById(int id, Model model) {
//        String id2 = request.getParameter("productId");
//          int id =Integer.parseInt(id2);
        System.out.println("id="+id);
        Product product =  productService.findById(id);
        System.out.println(product);
        model.addAttribute("product",product);
        return "order";
    }
    @RequestMapping("/insertProduct")
    public String insert(Cart cart, Model model) {
//        String id2 = request.getParameter("productId");
//          int id =Integer.parseInt(id2);
        System.out.println("cart="+cart);
              orderService.insert(cart);
//        System.out.println(product);
//        model.addAttribute("product",product);
        String name = cart.getCustomerName().toString();
        Cart cart1 = new Cart();
        cart1.setCustomerName(name);
        cart1.setSuccess(0);
    //    System.out.println(cart1);
        List<Cart> cart2 = orderService.find(cart1);
     //   System.out.println(cart2);
        model.addAttribute("cart",cart2);
        return "cart";
//       System.out.println("nameC="+name);
//        return "main";
//        return "order";
    }
    @RequestMapping("/findCart")
    public String findCart(String customerName, Model model,HttpServletRequest request) throws UnsupportedEncodingException {
        String str=new String((request.getParameter("customerName")).getBytes("iso-8859-1"),"utf-8");
        System.out.println("customername="+str);
//        String id2 = request.getParameter("productId");
//          int id =Integer.parseInt(id2);
       // System.out.println("cart="+cart);
        Cart cart = new Cart();
        cart.setCustomerName(str);
        cart.setSuccess(0);
        System.out.println(cart);
        List<Cart> cart2 = orderService.find(cart);
        System.out.println(cart2);
        model.addAttribute("cart",cart2);
             return "cart";
    }
    @RequestMapping("/deleteProduct")
    public String delete(Integer id, Model model) {
//
        System.out.println("id="+id);
        orderService.delete(id);
//        System.out.println(product);
//        model.addAttribute("product",product);
//        String name = cart.getCustomerName().toString();
//       System.out.println("nameC="+name);
        model.addAttribute("msg","删除成功");
        return "msg";
//        return "order";
    }
}
