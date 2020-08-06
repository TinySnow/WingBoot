package com.tinysnow.dao.impl;

import com.tinysnow.bean.User;
import com.tinysnow.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author TinySnow
 */
@Repository
public class UserDaoImpl {

    @Autowired
    UserMapper userMapper;

    public User checkPwd(String username){
        return userMapper.checkPwd(username);
    }

    public User insertUser(String username, String password, String email){
        return userMapper.insertUser(username, password, email);
    }

    public User selectOneUserByUsername(String username){
        return userMapper.selectOneUserByUsername(username);
    }

    public User updatePwd(int id, String newPassword){
        return userMapper.updatePwd(id, newPassword);
    }

    public User selectOneUserById(int id){
        return userMapper.selectOneUserById(id);
    }
}
