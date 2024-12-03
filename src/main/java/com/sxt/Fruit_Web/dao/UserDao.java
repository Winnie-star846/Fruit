package com.sxt.Fruit_Web.dao;
import com.sxt.Fruit_Web.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    Users login(String username, String userpwd);

    Integer addUsers(Users users);

    Users getByName(String username);

    String getUsersName(Integer user_id);

    Integer updUsername(String username,Integer user_id);

    Integer updUserpwd(String userpwd,Integer user_id);

    Integer getIdByName(String username);

    Integer setUserSig(String signature, Integer user_id);

    String getUsersSig(String username);

    Integer setUserImg(String img, Integer user_id);

    String getUsersimg(String username);





}
