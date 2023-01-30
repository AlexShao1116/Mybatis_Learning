package com.kuang.pojo;

import lombok.*;

import java.util.List;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;

}
