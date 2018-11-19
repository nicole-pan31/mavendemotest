package com.aaa.mybatis.Dao;

import com.aaa.mybatis.entity.Role;

import java.util.List;

/**
 * className:RoleDao
 * discription:
 * author:panjing
 * createTime:2018-11-06 16:58
 */
public interface RoleDao {
    /**
     * 多对多
     * @return
     */
    List<Role> manyTomany();
}
