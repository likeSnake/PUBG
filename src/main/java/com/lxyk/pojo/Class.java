package com.lxyk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    private String ClassName;
    private Integer ClassID;
    private String ClassJP;
    private String StuName;
    private float chinese;
    private float math;
    private float english;
    private float Score;
}
