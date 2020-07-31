package com.tinysnow;

import com.tinysnow.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.insertUser("yp","l7","haemha");
        System.out.println(userMapper.selectOneUserById(20));
    }
}
