package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; //���������ֶ�����һ��
    private int views;


    public Blog() {

    }
}

