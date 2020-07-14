package com.itany.zshop.service.impl;

import com.itany.zshop.common.constant.SysuserContstant;
import com.itany.zshop.common.exception.SysuserNotExistException;
import com.itany.zshop.dao.SysuserDao;
import com.itany.zshop.params.SysuserParam;
import com.itany.zshop.pojo.Role;
import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.service.SysuserService;
import com.itany.zshop.vo.SysuserVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class SysuserServiceImpl implements SysuserService {
   @Autowired

    private SysuserDao sysuserDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public void add(SysuserVo sysuserVo) {
  Sysuser sysuser = new Sysuser();
        try {
            PropertyUtils.copyProperties(sysuser, sysuserVo);
            //角色ID
            Role role = new Role();
            role.setId(sysuserVo.getRoleId());
            sysuser.setRole(role);
            //默认为有效
            sysuser.setIsValid(SysuserContstant.SYSUSER_VALID);
            //创建时间为当前时间
            sysuser.setCreateDate(new Date());

            sysuserDao.insert(sysuser);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Sysuser> findAll() {
        return sysuserDao.findAll();
    }

    @Override
    public void modify(SysuserVo sysuserVo) {

    }

    @Override
    public void modifyStatus(int id) {
    Sysuser sysuser= sysuserDao.selectById(id);
    int isValid = sysuser.getIsValid();
    if(isValid==SysuserContstant.SYSUSER_VALID){
        isValid = SysuserContstant.SYSUSER_INVALID;
    }else {
        isValid = SysuserContstant.SYSUSER_VALID;
    }
    sysuserDao.updateStatus(id,isValid);
    }

    @Override
    public Sysuser findById(int id) {

        return sysuserDao.selectById(id);
    }

    @Override
    public Sysuser login(String loginName, String password) throws SysuserNotExistException {
       Sysuser sysuser= sysuserDao.selectByNameAndPassword(loginName,password,SysuserContstant.SYSUSER_VALID);
      if(sysuser!=null){
         return sysuser;
      }
      throw new SysuserNotExistException("用户名或密码错误");
    }

    @Override
    public List<Sysuser> findByParams(SysuserParam sysuserParam) {
        System.out.println("c2="+sysuserDao.selectByParams(sysuserParam));
        return sysuserDao.selectByParams(sysuserParam);
    }
}
