package com.sxt.Fruit_Web.service;

import com.sxt.Fruit_Web.pojo.Fruit;
import com.sxt.Fruit_Web.pojo.Users;
import org.springframework.stereotype.Service;

public interface FruitService {
    Fruit getByFruitName(String fruit_name);
}
