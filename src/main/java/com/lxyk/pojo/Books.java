package com.lxyk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Books
 * @Description TODO
 * @Author FJQ
 * @Date 2022/5/30 20:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private Integer bookID;
    private String bookName;
    private Integer bookCounts;
    private String detail;


}
