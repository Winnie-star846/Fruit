package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.Fruit;
import com.sxt.Fruit_Web.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping("/fruits/{fruitName}")
    public String getFruitPage(@PathVariable("fruitName") String fruitName, Model model) {
        // 从数据库或其他地方获取水果的信息
        // 假设 Fruit 是一个包含水果信息的模型类

        Fruit fruit = fruitService.getFruitByName(fruitName);
        model.addAttribute("fruit", fruit);
        return "fruit";  // 返回一个通用的水果页面模板
    }
}


