package com.sxt.Fruit_Web.dao;
import com.sxt.Fruit_Web.pojo.SearchHistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface HistoryDao {
    SearchHistory getById(Integer user_id);
    Integer addHistory(Integer user_id, String search_term, Timestamp updated_at);
    List<SearchHistory> getList(Integer user_id);



}
