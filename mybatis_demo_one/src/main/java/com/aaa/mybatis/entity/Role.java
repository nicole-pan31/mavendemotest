package com.aaa.mybatis.entity;

import java.util.List;

/**
 * className:Role
 * discription:
 * author:panjing
 * createTime:2018-11-06 16:54
 */

public class Role {
    private int id;
    private String name;

    //描述多对多的
    private List<Power> powerList;

    public List<Power> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<Power> powerList) {
        this.powerList = powerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
