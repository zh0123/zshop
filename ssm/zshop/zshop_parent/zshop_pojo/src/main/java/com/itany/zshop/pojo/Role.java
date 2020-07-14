package com.itany.zshop.pojo;

import java.io.Serializable;

/**
 * Author：汤小洋
 * Date：2018-04-28 9:21
 * Description：<描述>
 */
public class Role implements Serializable {
    private Integer id;
    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
