package com.sxt.Fruit_Web.dao;
import com.sxt.Fruit_Web.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    Users login(String username, String userpwd);

}
