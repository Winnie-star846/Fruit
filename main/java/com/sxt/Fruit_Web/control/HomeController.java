package com.sxt.Fruit_Web.control;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String first() {
        return "home";  // 返回登录页面视图
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";  // 返回首页视图
    }  // 返回首页视图


    @GetMapping("/history")
    public String history() {
        return "history" ;  // 返回主页视图
    }
}
