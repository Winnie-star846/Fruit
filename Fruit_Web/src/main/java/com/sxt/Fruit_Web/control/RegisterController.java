package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.Users;
import com.sxt.Fruit_Web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String toRegister() {
        return "html/register";
    }

    @PostMapping("/register")
    public String register(Users users, RedirectAttributes redirectAttributes,
                           @RequestParam("username") String username,
                           @RequestParam("userpwd") String userpwd) {

        Users byname = userService.getByName(username);

        if (byname == null) {
            System.out.println("The user can register.");
            users.setUsername(username);
            users.setUserpwd(userpwd);
            userService.addUsers(users);

            redirectAttributes.addFlashAttribute("message", "Registration successful! Please log in.");
            return "redirect:/login";  // Redirect to login page
        } else {
            System.out.println("The user is registered.");
            redirectAttributes.addFlashAttribute("errorMessage", "Username already taken, please try again.");
            return "redirect:/register";  // Redirect back to registration page
        }
    }
}
