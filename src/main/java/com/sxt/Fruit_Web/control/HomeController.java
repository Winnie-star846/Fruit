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

    @GetMapping("/fruits/grape")
    public String grape() {
        return "Fruits/grape";  // 返回首页视图
    }

    @GetMapping("/fruits/jujube")
    public String jujube() {
        return "Fruits/jujube";  // 返回首页视图
    }

    @GetMapping("/fruits/orange")
    public String orange() {
        return "Fruits/orange";  // 返回首页视图
    }

    @GetMapping("/fruits/pear")
    public String pear() {
        return "Fruits/pear";  // 返回首页视图
    }

    @GetMapping("/fruits/persimmon")
    public String persimmon() {
        return "Fruits/persimmon";  // 返回首页视图
    }

    @GetMapping("/fruits/pomegranate")
    public String pomegranate() {
        return "Fruits/pomegranate";  // 返回首页视图
    }


}
