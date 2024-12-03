package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.Users;
import com.sxt.Fruit_Web.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Controller

public class UserController {

    @Autowired
    private UserService userService;

    @Value("${pictures.storage.path}")
    private String picturesStoragePath;

    /**
     * 显示修改页面
     */
    @GetMapping("/change")
    public String change(HttpSession session) {
        return "change";
    }

    /**
     * 更新用户信息
     */
    @PostMapping("/change")
    public String updateUser(
            MultipartFile file,
            String username,
            String userpwd,
            String signature,
            HttpSession session, Model model) {



        // 检查用户是否登录

        Integer user_id = (Integer) session.getAttribute("userId");
        Users byname = userService.getByName(username);
        // 更新用户名、密码、签名
        if (byname == null) {
            userService.updUsername(username, user_id);
            userService.updUserPwd(userpwd, user_id);
            userService.setUserSig(signature, user_id);
        }else if(username.equals(userService.getUsersName(user_id))){
            userService.updUsername(username, user_id);
            userService.updUserPwd(userpwd, user_id);
            userService.setUserSig(signature, user_id);
        }else {
            model.addAttribute("error", "Username already taken, please try again.");
            return "change";
        }

        // 如果有文件上传
        if (file != null && !file.isEmpty()) {
            try {
                // 获取文件名并生成唯一名称
                String originalFilename = file.getOriginalFilename();
                String fileName = UUID.randomUUID().toString() + "_" + originalFilename;

                // 确保上传目录存在
                File uploadDir = new File(picturesStoragePath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }

                // 保存文件
                Path destinationFile = Paths.get(picturesStoragePath, fileName);
                file.transferTo(destinationFile.toFile());

                // 保存图片路径到数据库
                String imageUrl = "/images/"+fileName;
                userService.setUserImg(imageUrl, user_id);




            } catch (IOException e) {
                e.printStackTrace();
                return "redirect:/change";
            }
        }
        String img = userService.getUsersimg(username);
        session.setAttribute("name",username);
        session.setAttribute("sig",signature);
        session.setAttribute("img", img);

        return "redirect:/home";
    }
}
