package com.itany.zshop.front.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itany.zshop.common.constant.PaginationConstant;
import com.itany.zshop.params.ProductParam;
import com.itany.zshop.pojo.Product;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductService;
import com.itany.zshop.service.ProductTypeService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.OutputStream;
import java.util.List;

@Controller
@RequestMapping("/front/product")
public class ProductController {
    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private ProductService productService;
    @RequestMapping("/search")
    public String search(ProductParam productParam, Integer pageNum, Model model){
         if(ObjectUtils.isEmpty(pageNum)){
             pageNum= PaginationConstant.PAGE_NUM;
         }
        PageHelper.startPage(pageNum,PaginationConstant.FRONT_PAGE_SIZE);
         List<Product> products = productService.findByParam(productParam);
        System.out.println("products="+products);
        PageInfo<Product> pageInfo = new PageInfo<>(products);
        System.out.println(pageInfo);
        model.addAttribute("pageInfo",pageInfo);
        return "main";
    }
    @RequestMapping("/getImage")
    public void getImage(String path, OutputStream outputStream){
        System.out.println("path="+path);
        productService.getImage(path,outputStream);
    }
    @ModelAttribute("productTypes")
    public List<ProductType> loadProductTypes(){
        List<ProductType> productTypes = productTypeService.findEnable();
        return productTypes;
    }
}
