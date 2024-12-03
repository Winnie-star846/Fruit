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

    @Override
    public Integer addUsers(Users users) {
        return userDao.addUsers(users);
    }

    @Override
    public Users getByName(String username) {
        return userDao.getByName(username);
    }

    @Override
    public String getUsersName(Integer user_id) {
        return userDao.getUsersName(user_id);
    }

    @Override
    public Integer updUserPwd(String userpwd, Integer userid) {
        return userDao.updUserpwd(userpwd,userid);
    }

    @Override
    public Integer updUsername(String username, Integer user_id) {
        return userDao.updUsername(username,user_id);
    }

    @Override
    public Integer getIdByName(String username) {
        return userDao.getIdByName(username);
    }

    @Override
    public Integer setUserSig(String signature, Integer user_id) {
        return userDao.setUserSig(signature,user_id);
    }

    @Override
    public String getUsersSig(String username) {
        return userDao.getUsersSig(username);
    }

    @Override
    public Integer setUserImg(String img, Integer user_id) {
        return userDao.setUserImg(img,user_id);
    }

    @Override
    public String getUsersimg(String username) {
        return userDao.getUsersimg(username);
    }


}
