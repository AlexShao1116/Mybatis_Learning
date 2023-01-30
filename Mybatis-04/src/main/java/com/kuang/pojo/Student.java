package com.kuang.pojo;

import lombok.*;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int tid;
   /* private Teacher teacher;*/
}
