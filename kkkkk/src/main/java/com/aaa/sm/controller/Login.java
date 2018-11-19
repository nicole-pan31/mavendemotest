package com.aaa.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * className:Login
 * discription:
 * author:panjing
 * createTime:2018-11-12 08:53
 */
@Controller
@RequestMapping("login")
public class Login {

    /**
     * 跳转登陆界面
     */
    @RequestMapping("toLogin")

    public String toLogin(){
        return "login";
    }

    /**
     *检查
     * @return
     */
    @RequestMapping("checkLogin")
    public String  checkLogin(@RequestParam Map map, HttpServletRequest request){
        HttpSession session = request.getSession();

        Object name = map.get("name");
        if("admin".equals(name)){
            session.setAttribute("name",map.get("name"));
            session.setAttribute("password",map.get("password"));

           return "emplist.html";
        }else {
            System.out.println("错误");
            return "login.html";
        }




    }
}
