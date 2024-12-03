package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.Fruit;
import com.sxt.Fruit_Web.pojo.SearchHistory;
import com.sxt.Fruit_Web.service.FruitService;
import com.sxt.Fruit_Web.service.HistoryService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;

@Controller
public class SearchFruitController {
    @Autowired
    FruitService fruitService;
    @Autowired
    HistoryService historyService;

    @GetMapping("/Fruits")
    public String getFruitDetail(@RequestParam(value = "fruit_name", required = false)String fruit_name, HttpSession session, Model model) {
        // 根据水果名称获取水果
        Integer user_id = (Integer) session.getAttribute("userId");
        Fruit fruit = fruitService.getByFruitName(fruit_name);
        if (fruit == null) {
            return "Fruits/no fruit";  // 返回水果未找到页面
        }
        Timestamp updated_at = new Timestamp(System.currentTimeMillis());
        if (user_id != null) {
            historyService.addHistory(user_id, fruit_name, updated_at);
        }
        model.addAttribute("fruit", fruit);


        return "Fruits/fruit";  // 返回水果详情页面
    }
}

//new Timestamp(System.currentTimeMillis())
