package com.tinysnow.service;

import com.tinysnow.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinySnow
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Boolean checkPassword(String username,String inputPwd) {
        System.out.println(">>>:"+userMapper.checkPassword(username));
        if (userMapper.checkPassword(username) == null){
            return null;
        } else {
            return userMapper.checkPassword(username).getPassword().equals(inputPwd);
        }

    }
}
