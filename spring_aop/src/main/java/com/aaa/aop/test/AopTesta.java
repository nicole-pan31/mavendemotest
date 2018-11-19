package com.aaa.aop.test;

import com.aaa.aop.service.UserServiceImp;
import com.aaa.aop.service.GoodsServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className:AopTest
 * discription:
 * author:panjing
 * createTime:2018-11-08 14:29
 */

public class AopTesta {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springaop-another-config.xml");

        GoodsServiceImp goodsServiceImp = (GoodsServiceImp) applicationContext.getBean("goodsServiceImp");
        goodsServiceImp.add();
    }
}
