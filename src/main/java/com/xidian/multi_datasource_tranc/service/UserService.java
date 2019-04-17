package com.xidian.multi_datasource_tranc.service;


import com.xidian.multi_datasource_tranc.mapper01.UserMapper01;
import com.xidian.multi_datasource_tranc.mapper02.UserMapper02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
    @Autowired
    private UserMapper01 userMapper01;

    @Autowired
    private UserMapper02 userMapper02;


    @Transactional()
    public int insert3(String name, Integer age) {
        int i1 = userMapper01.insert(name,age);

        int i2 = userMapper02.insert(name, age);

        int j = 1 / 0;

        int res = i1+i2;


        return res;
    }
}
