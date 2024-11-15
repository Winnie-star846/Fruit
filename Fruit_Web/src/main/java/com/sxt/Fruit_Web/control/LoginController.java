package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.Users;
import com.sxt.Fruit_Web.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    // 处理登录页面显示
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // 显示登录页面
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("userpwd") String userpwd,
                        Users users, Model model) {

        Users login = userService.login(username, userpwd);
        if (login == null) {
            // 登录失败，打印失败信息
            System.out.println("登录失败：用户名或密码错误");
            model.addAttribute("error", "Incorrect username or password."); // 传递错误消息到前端
            return "login"; // 返回登录页面
        } else {
            System.out.println("登录成功");
            return "redirect:/home"; // 登录成功后跳转到的页面
        }
    }
}



