package com.sxt.Fruit_Web.service.impl;

import com.sxt.Fruit_Web.dao.FruitDao;
import com.sxt.Fruit_Web.dao.UserDao;
import com.sxt.Fruit_Web.pojo.Fruit;
import com.sxt.Fruit_Web.pojo.Users;
import com.sxt.Fruit_Web.service.FruitService;
import com.sxt.Fruit_Web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    FruitDao fruitDao;


    @Override
    public Fruit getByFruitName(String fruit_name) {
        return fruitDao.getByFruitName(fruit_name);
    }
}

