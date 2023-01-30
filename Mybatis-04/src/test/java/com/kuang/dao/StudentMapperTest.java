package com.kuang.dao;

import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentMapperTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper teacher = sqlSession.getMapper(StudentMapper.class);
        Teacher teachers = teacher.getTeacher(1);

        System.out.println(teachers);

        sqlSession.close();
    }@Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper teacher = sqlSession.getMapper(StudentMapper.class);
        Teacher teachers = teacher.getTeacher2(1);

            System.out.println(teachers);

        sqlSession.close();
    }
}
