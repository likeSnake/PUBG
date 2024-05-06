package com.lxyk.service;

import com.lxyk.pojo.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName PUBGService
 * @Description TODO
 * @Author FJQ
 * @Date 2022/5/30 20:38
 * @Version 1.0
 **/
public interface PUBGService {
    //新增
    int addBook(Books books);
    //删除
    int deleteById(Integer id);
    //修改
    int updateBook(Books books);
    //查询全部  返回集合List
    List<Books> queryAllBook();
    //估计ID查询，返回是一个对象
    Books queryById(Integer id);

     Version queryVersion();

    List<User> queryAllUser();
    Integer queryIsStart();

    List<Message> queryMessage();
    AppInfo queryAppInfo();

    Integer updateStatistics(String device_code, Timestamp timestamp,String new_version);
    Integer timeTest(Timestamp timestamp);
}
