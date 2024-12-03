package com.sxt.Fruit_Web.dao;

import com.sxt.Fruit_Web.pojo.Fruit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FruitDao {
    Fruit getByFruitName(String fruit_name);
}
