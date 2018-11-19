package com.aaa.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:test
 * discription:
 * author:panjing
 * createTime:2018-11-15 19:29
 */
@Controller
@RequestMapping("/emp")
public class test {
    @RequestMapping("/to")
    public String test1(){
        return "index";
    }
}
