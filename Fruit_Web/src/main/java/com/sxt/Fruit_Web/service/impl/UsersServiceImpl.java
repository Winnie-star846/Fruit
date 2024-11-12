package com.sxt.Fruit_Web.service.impl;
import com.sxt.Fruit_Web.dao.UserDao;
import com.sxt.Fruit_Web.pojo.Users;
import com.sxt.Fruit_Web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Users login(String username, String userpwd) {
        Users login = userDao.login(username,userpwd);
        return login;
    }

}
