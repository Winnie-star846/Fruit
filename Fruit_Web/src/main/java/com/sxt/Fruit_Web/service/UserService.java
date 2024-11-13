package com.sxt.Fruit_Web.service;

import com.sxt.Fruit_Web.pojo.Users;


public interface UserService {
    Users login(String username, String userpwd);


    Integer addUsers(Users users);

    Users getByName(String username);



}
