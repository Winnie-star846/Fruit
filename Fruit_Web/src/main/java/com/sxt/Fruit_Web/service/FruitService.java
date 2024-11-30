package com.sxt.Fruit_Web.service;

import com.sxt.Fruit_Web.pojo.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
    public Fruit getFruitByName(String fruitName) {
        // 这里是模拟数据，实际应该从数据库中查询
        if ("apple".equals(fruitName)) {
            Fruit fruit = new Fruit();
            fruit.setName("Apple");
            fruit.setDescription("A sweet red fruit");
            fruit.setPrice(1.5);
            fruit.setImageUrl("apple.jpg");
            return fruit;
        } else if ("banana".equals(fruitName)) {
            Fruit fruit = new Fruit();
            fruit.setName("Banana");
            fruit.setDescription("A yellow fruit");
            fruit.setPrice(0.8);
            fruit.setImageUrl("banana.jpg");
            return fruit;
        }
        return null;
    }

}
