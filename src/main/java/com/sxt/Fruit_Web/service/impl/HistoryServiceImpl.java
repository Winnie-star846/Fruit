package com.sxt.Fruit_Web.service.impl;

import com.sxt.Fruit_Web.dao.HistoryDao;
import com.sxt.Fruit_Web.dao.UserDao;
import com.sxt.Fruit_Web.pojo.SearchHistory;
import com.sxt.Fruit_Web.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    HistoryDao historyDao;

    @Override
    public SearchHistory getById(Integer user_id) {
        return historyDao.getById(user_id);
    }

    @Override
    public Integer addHistory(Integer user_id, String search_term, Timestamp updated_at) {
        return historyDao.addHistory(user_id,search_term,updated_at);
    }

    @Override
    public List<SearchHistory> getList(Integer user_id) {
        return historyDao.getList(user_id);
    }
}
