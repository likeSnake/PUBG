package com.lxyk.service.impl;

import com.lxyk.mapper.PUBGMapper;
import com.lxyk.pojo.*;
import com.lxyk.service.PUBGService;

import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName PUBGServiceImpl
 * @Description TODO
 * @Author FJQ
 * @Date 2022/5/30 20:39
 * @Version 1.0
 **/

public class PUBGServiceImpl implements PUBGService {
    //调用mapper层的操作
    private PUBGMapper pubgMapper;
    public void setPUBGMapper(PUBGMapper pubgMapper) {
        this.pubgMapper = pubgMapper;
    }

    public int addBook(Books books) {
        return pubgMapper.addBook(books);
    }

    public int deleteById(Integer id) {
        return pubgMapper.deleteById(id);
    }

    public int updateBook(Books books) {
        return pubgMapper.updateBook(books);
    }

    public List<Books> queryAllBook() {
        return pubgMapper.queryAllBook();
    }
    public Version queryVersion(){
        return pubgMapper.queryVersion();
    }

    public List<User> queryAllUser() {
        return pubgMapper.queryAllUser();
    }

    public Integer queryIsStart() {
        return pubgMapper.queryIsStart();
    }

    public List<Message> queryMessage() {
        return pubgMapper.queryMessage();
    }

    public AppInfo queryAppInfo() {
        return pubgMapper.queryAppInfo();
    }

    public Integer updateStatistics(String device_code, Timestamp timestamp,String new_version) {
        return pubgMapper.updateStatistics(device_code,timestamp,new_version);
    }

    public Integer timeTest(Timestamp timestamp) {
        return pubgMapper.timeTest(timestamp);
    }

    public Books queryById(Integer id) {
        return pubgMapper.queryById(id);
    }
}
