package com.aaa.aop.service;

import org.springframework.stereotype.Service;

/**
 * className:GoodsServiceImp
 * discription:
 * author:panjing
 * createTime:2018-11-08 16:08
 */
@Service
public class GoodsServiceImp {
    /**
     * 添加
     */
    public void  add(){
        System.out.println("模拟商品添加");

    }

    /**
     * 修改
     */
    public void update(){
        System.out.println("模拟商品修改");
    }

    /**
     * 删除
     */
    public void delete(){
        System.out.println("模拟商品删除");
    }
}
