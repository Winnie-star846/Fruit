package com.sxt.Fruit_Web.control;

import com.sxt.Fruit_Web.pojo.SearchHistory;
import com.sxt.Fruit_Web.service.HistoryService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HistoryController {
    @Autowired
    HistoryService historyService;

    @GetMapping("/history")
    public String showHistory(Model model, HttpServletRequest request) {
        Integer user_id = (Integer) request.getSession().getAttribute("userId");
        if (user_id != null) {
            List<SearchHistory> historyList = historyService.getList(user_id);
            model.addAttribute("historyList", historyList);
        }else {
            model.addAttribute("errorMessage", "You need to log in to view your history.");
        }
        return "history";  // 返回 history.html 页面
    }



}
