package com.sxt.Fruit_Web.service;

import com.sxt.Fruit_Web.pojo.Users;


public interface UserService {
    Users login(String username, String userpwd);


    Integer addUsers(Users users);

    Users getByName(String username);

    String getUsersName(Integer user_id);

    Integer updUserPwd(String userpwd, Integer user_id);

    Integer updUsername(String username, Integer user_id);

    Integer getIdByName(String username);

    Integer setUserSig(String signature, Integer user_id);

    String getUsersSig(String username);

    Integer setUserImg(String img, Integer user_id);

    String getUsersimg(String username);

}
