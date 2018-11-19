package com.aaa.aop.test;

import com.aaa.aop.service.DeptServiceImp;
import com.aaa.aop.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className:AopTest
 * discription:
 * author:panjing
 * createTime:2018-11-08 14:29
 */

public class AopTest {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springaop-config.xml");

       DeptServiceImp deptService = (DeptServiceImp) applicationContext.getBean("deptService");
        deptService.add();

       UserServiceImp userService =(UserServiceImp) applicationContext.getBean("userService");
        userService.delete();
    }
}
