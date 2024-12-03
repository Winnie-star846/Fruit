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
    private FruitService fruitService;

    @GetMapping("/Fruits/{name}")
    public String getFruitDetail(@PathVariable String name, Model model) {
        Fruit fruit = fruitService.getByFruitName(name);  // 根据水果名称查找水果
        if (fruit == null) {
            return "Fruits/no_fruit";  // 如果未找到水果，返回未找到页面
        }
        model.addAttribute("fruit", fruit);
        return "Fruits/fruit";  // 返回水果详情页面
    }
}
