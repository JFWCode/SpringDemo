package com.wk.spring.web.mvc_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String toSuccess(){
        System.out.println("请求成功页面");
        return "success";
    }

    @RequestMapping("/error")
    public String toError() {
        System.out.println("请求错误页面");
        return "error";
    }

    @RequestMapping("/api")
    public String showRestfull() {
        return "restdemo";
    }
}
