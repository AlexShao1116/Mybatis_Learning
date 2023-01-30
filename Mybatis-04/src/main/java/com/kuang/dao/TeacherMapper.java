package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher();
    List<Teacher> getTeacher1(int id);
    List<Student> getStudent(int t);
    List<Student> getStudent2(String tName);
}
