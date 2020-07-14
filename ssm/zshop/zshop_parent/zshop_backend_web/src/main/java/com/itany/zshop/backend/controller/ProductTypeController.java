package com.itany.zshop.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itany.zshop.common.constant.PaginationConstant;
import com.itany.zshop.common.constant.ResponseStatusConstant;
import com.itany.zshop.common.exception.ProductTypeExistException;
import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;
    @RequestMapping("/findAll")
    public String findAll( Integer pageNum,Model model){
        if (ObjectUtils.isEmpty(pageNum)){
                pageNum= PaginationConstant.PAGE_NUM;
        }
        //设置分页
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
        //查询数据
        List<ProductType> types =productTypeService.findAll();

        PageInfo<ProductType> pageInfo = new PageInfo<>(types);
//        pageInfo.getPageNum();
//        pageInfo.getPages();
//        pageInfo.getNextPage();
//        pageInfo.getPrePage();
        //将查询结果封装到PageInfo中
         model.addAttribute("pageInfo",pageInfo);
            return "productTypeManager";
    }
     @RequestMapping("/add")
     @ResponseBody
    public ResponseResult add(String name){
         ResponseResult result = new ResponseResult();
         try {
             productTypeService.add(name);
             result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
             result.setMessage("添加成功");
         } catch (ProductTypeExistException e) {
           result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_FAILSE);
           result.setMessage(e.getMessage());
         }
         return result;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public ResponseResult findById(int id){
       ProductType productType = productTypeService.findById(id);
        System.out.println(productType);
        ResponseResult result =  ResponseResult.success(productType);
        System.out.println(result.getDate());
      return  result;
    }
    @RequestMapping("/modifyName")
    @ResponseBody
    public ResponseResult modifyName(int id,String name){
        System.out.println(id+name);
        try {
            productTypeService.modifyName(id,name);
            return ResponseResult.success("修改成功");
        } catch (ProductTypeExistException e) {
           return ResponseResult.fal(e.getMessage());
        }
    }
    @RequestMapping("/deleteById")
    @ResponseBody
    public ResponseResult deleteById(int id){
        System.out.println(id);
        productTypeService.removeById(id);
        return ResponseResult.success();
    }
    @RequestMapping("/modifyStatus")
    @ResponseBody
    public ResponseResult modifyStatus(int id){
        System.out.println("id="+id);
        productTypeService.modifyStatus(id);
        return ResponseResult.success();
    }

}
