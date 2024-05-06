package com.lxyk.mapper;
import com.lxyk.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName pubgMapper
 * @Description TODO
 * @Author FJQ
 * @Date 2022/5/30 20:24
 * @Version 1.0
 **/
public interface PUBGMapper {
    //新增
    int addBook(Books books);
    //删除
    int deleteById(@Param("bookID") Integer id);
    //修改
    int updateBook(Books books);
    //查询全部  返回集合List
    List<Books> queryAllBook();
    //估计ID查询，返回是一个对象
    Books queryById(@Param("bookID") Integer id);

    Version queryVersion();
    List<User> queryAllUser();
    Integer queryIsStart();
    List<Message> queryMessage();
    AppInfo queryAppInfo();

    Integer updateStatistics(@Param("device_code") String device_code, @Param("timestamp")Timestamp timestamp,@Param("new_version")String version);

    Integer timeTest(@Param("TestTimestamp")Timestamp timestamp);
}
