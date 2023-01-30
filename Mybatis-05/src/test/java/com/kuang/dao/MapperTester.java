package com.kuang.dao;

import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;

public class MapperTester {
    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","Mybatis");
        mapper.queryBlogIF(hashMap);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","Mybatis");
        hashMap.put("author","狂神说");
        mapper.queryBlogChoose(hashMap);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogTrim(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","Mybatis");
        hashMap.put("author","狂神说");
        mapper.queryBlogChoose(hashMap);
        sqlSession.commit();
        sqlSession.close();
    }
}