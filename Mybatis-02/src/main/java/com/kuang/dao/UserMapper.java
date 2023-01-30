package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserByID(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

    List<User> selectUserByLimit(Map<String,Integer> map);


}
