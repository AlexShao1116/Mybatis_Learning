package com.kuang.dao;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtils.getSession();

         /*List<User> users = sqlSession.getUserList("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.selectList("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void selectUserByID(){
        SqlSession sqlSession = MybatisUtils.getSession();
        /*List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users =mapper. getUserByID(1);

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSession();
        /*List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int x = mapper. addUser(new User(4,"shaolei","123456"));

        sqlSession.commit();
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSession();
        /*List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int x = mapper. updateUser(new User(4,"shaolei","111111"));
        sqlSession.commit();
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSession();
        /*List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int x = mapper. deleteUser(4);
        sqlSession.commit();
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void selectlike(){
        SqlSession sqlSession = MybatisUtils.getSession();
        /*List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");*/
        //方法一:
        //List<User> users = sqlSession.getUserByID("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper. selectlike("%sh%");
        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userid",4);
        map.put("username","shaollll");
        map.put("password","123321");
        mapper.addUser2(map);
        sqlSession.commit();
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }

}