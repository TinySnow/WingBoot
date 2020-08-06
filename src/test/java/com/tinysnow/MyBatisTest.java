package com.tinysnow;

import com.tinysnow.bean.Judge;
import com.tinysnow.dao.impl.CandidateDaoImpl;
import com.tinysnow.dao.impl.JudgeDaoImpl;
import com.tinysnow.dao.impl.UserDaoImpl;
import com.tinysnow.service.impl.CandidateServiceImpl;
import com.tinysnow.service.impl.JudgeServiceImpl;
import com.tinysnow.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisTest {

    @Autowired
    UserDaoImpl userDao;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    JudgeDaoImpl judgeDao;

    @Autowired
    JudgeServiceImpl judgeService;

    @Autowired
    CandidateDaoImpl candidateDao;

    @Autowired
    CandidateServiceImpl candidateService;


    @Test
    void contextLoads() {
        userTest();
        judgeTest();
        candidateTest();
    }

    @Test
    private void userTest(){
        System.out.println(userService.checkPwd("2233", "5555"));
        System.out.println(userDao.insertUser("ui", "9658", "iop"));
    }

    @Test
    private void judgeTest(){

    }

    @Test
    private void candidateTest(){

    }
}
