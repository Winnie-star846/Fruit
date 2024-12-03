package com.sxt.Fruit_Web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SeasonsController {

    @GetMapping("/seasons/winter")
    public String winter() {
        return "seasons/冬天" ;  // 返回主页视图
    }

    @GetMapping("/seasons/summer")
    public String summer() {
        return "seasons/夏天" ;  // 返回主页视图
    }

    @GetMapping("/seasons/spring")
    public String spring() {
        return "seasons/春天" ;  // 返回主页视图
    }

    @GetMapping("/seasons/autumn")
    public String autumn() {
        return "seasons/秋天" ;  // 返回主页视图
    }


}
