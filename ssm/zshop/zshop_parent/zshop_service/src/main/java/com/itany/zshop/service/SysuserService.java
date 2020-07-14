package com.itany.zshop.service;


import com.itany.zshop.common.exception.SysuserNotExistException;
import com.itany.zshop.params.SysuserParam;
import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.vo.SysuserVo;

import java.util.List;

public interface SysuserService {

 public void add(SysuserVo sysuserVo);
    List<Sysuser> findAll();
    public void modify(SysuserVo sysuserVo);
    public void modifyStatus(int id);

    Sysuser findById(int id);

    List<Sysuser> findByParams(SysuserParam sysuserParam);

   Sysuser login(String loginName, String password) throws SysuserNotExistException;
}
