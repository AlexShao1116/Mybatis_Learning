package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from t")
    List<User> getUserList();
    @Select("select * from t where id= #{id}")
    List<User> getUserByID(@Param("id") int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

    List<User> selectUserByLimit(Map<String,Integer> map);


}
