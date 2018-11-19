package com.aaa.ssm.controller;

import com.aaa.ssm.service.EmpService;
import com.aaa.ssm.until.PageUntil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * className:Empcontroller
 * discription:
 * author:panjing
 * createTime:2018-11-07 15:47
 */
@Controller
@RequestMapping("/emp")
public class Empcontroller {
    @Autowired
    private EmpService empService;

    @RequestMapping("/list")
    public String empList(@RequestParam Map map, Model model, HttpServletRequest request){
        map.put("pageSize",5);
        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        String stringPage = new PageUntil(pageNo, 5, empService.getPage(map), empService.getPageCount(map), request).getStringPage();
        model.addAttribute("stringPage",stringPage);
        System.out.println("ddddd"+empService.getPage(map));
        model.addAttribute("empList",empService.getPage(map));

        return "emp/list";

    }
    @RequestMapping("/getById")
    public String empgetById(@RequestParam Map map,Model model){
        System.out.println("get:--"+empService.getById(map).get(0));


        model.addAttribute("empGetById", empService.getById(map).get(0));

        return "emp/updata";
    }
    @RequestMapping("/updata")
    public String empUpdata(@RequestParam Map map,Model model){

        System.out.println("更新："+ map);
        int updata = empService.updata(map);


        return "redirect:/emp/list.do";
    }
    @RequestMapping("/add")
    public String add(){

        return "emp/insert";
    }
    @RequestMapping("/insert")
    public String empInsert(@RequestParam Map map){
        System.out.println(map);
        int insert = empService.insert(map);
        System.out.println("insert的"+insert);
        if(insert>0){
            return "redirect:/emp/list.do";
        }else {

            return "redirect:/emp/list.do";
        }




    }
    @RequestMapping("/delete")
    public String empDelete(@RequestParam Map map){
        int delete = empService.delete(map);
        if(delete>0){
            return "redirect:/emp/list.do";
        }
       return "redirect:/emp/list.do";
    }
}
