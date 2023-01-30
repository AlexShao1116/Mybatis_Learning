package com.kuang.dao;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);
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
        int x = mapper. addUser(new User(3,"shaolei","123456"));

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
        int x = mapper. deleteUser(33);
        sqlSession.commit();
        List<User> users =mapper.getUserList();

        for (User user: users){
            System.out.println(user);
        }
        logger.info("deleteUser() 成功success");
        sqlSession.close();
    }

    @Test
    public void selectUserByLimit(){
            SqlSession sqlSession = MybatisUtils.getSession();
            UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            map.put("startIndex",1);
            map.put("pageSize",3);

            List<User> list = usermapper.selectUserByLimit(map);
            for (User user: list){
                System.out.println(user);
            }
            logger.info("selectUserByLimit() 成功success");
            sqlSession.close();
    }

    @Test
    public void testlog4j(){
        logger.info("info:get in 成功testLog4j");
        logger.debug("DEBUG:get in testLog4j");
        logger.error("erro:get in testLog4j");
    }
}