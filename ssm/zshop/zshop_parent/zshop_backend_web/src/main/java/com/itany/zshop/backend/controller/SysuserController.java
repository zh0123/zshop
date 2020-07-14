package com.itany.zshop.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itany.zshop.common.constant.PaginationConstant;
import com.itany.zshop.common.exception.SysuserNotExistException;
import com.itany.zshop.common.util.ResponseResult;
import com.itany.zshop.dao.RoleDao;
import com.itany.zshop.params.SysuserParam;
import com.itany.zshop.pojo.Role;
import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.service.SysuserService;
import com.itany.zshop.vo.SysuserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/backend/sysuser")
public class SysuserController {
    @Autowired
     private SysuserService sysuserService;
    @Autowired
    private RoleDao roleDao;
  @ModelAttribute("roles")
    public List<Role> loadRole(){

      return roleDao.selectAll();
    }
    @RequestMapping("/login")
    public String login(String loginName,String password,HttpSession session,Model model)
    {
        System.out.println(loginName+password);
        try {
            Sysuser sysuser = sysuserService.login(loginName,password);
            session.setAttribute("name",loginName);
            session.setAttribute("sysuser",sysuser);
            return "main";
        } catch (SysuserNotExistException e) {
            model.addAttribute("errorMsg",e.getMessage());
            return "login";
        }
    }


    @RequestMapping("/modifyStatus")
    @ResponseBody
    public ResponseResult modifyStatus(int id){
     sysuserService.modifyStatus(id);
      return ResponseResult.success();
    }
      @RequestMapping("/findAll")
        public String findAll(Integer pageNum, Model model){
          System.out.println("pageNum="+pageNum);
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum = PaginationConstant.PAGE_NUM;
        }
          PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
          List<Sysuser> sysusers = sysuserService.findAll();
          PageInfo<Sysuser> pageInfo = new PageInfo<Sysuser>(sysusers);
          model.addAttribute("pageInfo",pageInfo);
          return "sysuserManager";
      }
      @RequestMapping("/findByParams")
      public String findByParams(SysuserParam sysuserParam,Integer pageNum,Model model){
          if(ObjectUtils.isEmpty(pageNum)){
              pageNum = PaginationConstant.PAGE_NUM;
          }
          PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);

          List<Sysuser> sysusers = sysuserService.findByParams(sysuserParam);
          PageInfo<Sysuser> pageInfo = new PageInfo<Sysuser>(sysusers);
          model.addAttribute("pageInfo",pageInfo);
          return "sysuserManager";
      }




      @RequestMapping("/add")
    @ResponseBody
    public ResponseResult add(SysuserVo sysuserVo){
        sysuserService.add(sysuserVo);
           return ResponseResult.success();
      }

}

