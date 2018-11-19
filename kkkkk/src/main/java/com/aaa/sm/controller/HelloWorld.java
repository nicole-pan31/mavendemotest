package com.aaa.sm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:HelloWorld
 * discription:
 * author:panjing
 * createTime:2018-11-09 14:37
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public Object print(){

        return "ssss";
    }
}
