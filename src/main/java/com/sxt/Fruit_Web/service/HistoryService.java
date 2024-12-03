package com.sxt.Fruit_Web.service;

import com.sxt.Fruit_Web.pojo.SearchHistory;

import java.sql.Timestamp;
import java.util.List;

public interface HistoryService {
    SearchHistory getById(Integer user_id);
    Integer addHistory(Integer user_id, String search_term, Timestamp updated_at);
    List<SearchHistory> getList(Integer user_id);
}
