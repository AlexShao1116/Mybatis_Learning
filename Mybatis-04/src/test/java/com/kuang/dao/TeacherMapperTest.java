package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper teacher = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacher.getTeacher1(1);
        for(Teacher teacher1 : teachers){
            System.out.println(teacher1);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper teacher = sqlSession.getMapper(TeacherMapper.class);
        List<Student> students = teacher.getStudent(1);
        for(Student student1 : students){
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
