package com.tinysnow.service.impl;

import com.tinysnow.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinySnow
 */
@Service
public class UserServiceImpl{

    @Autowired
    UserDaoImpl userDaoImpl;

    public Boolean checkPwd(String username, String inputPwd) {
        System.out.println("UserServiceImpl->checkPwd:" +
                userDaoImpl.checkPwd(username));
        if (userDaoImpl.checkPwd(username) == null){
            return null;
        } else {
            return userDaoImpl.checkPwd(username).getPassword().equals(inputPwd);
        }
    }
}
