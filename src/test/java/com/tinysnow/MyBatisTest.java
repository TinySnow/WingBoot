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

//        userTest(); // userTest已经完成测试无误
//        judgeTest(); // judgeTest已经完成测试无误
        candidateTest();
    }

    @Test
    private void userTest(){
        System.out.println("userTest->userService.checkPwd:"+
                userService.checkPwd("2233", "5555"));
        System.out.println("userTest->userDao.insertUser:"+
                userDao.insertUser("uia", "9658", "iop"));
        System.out.println("userTest->userDao.selectOneUserByUsername:"+
                userDao.selectOneUserByUsername("114514"));
        System.out.println("userTest->userDao.selectOneUserById:"+
                userDao.selectOneUserById(25));
        System.out.println("userTest->userDao.updatePwd:"+
                userDao.updatePwd(30, "3693"));
    }

    @Test
    private void judgeTest(){
        System.out.println("judgeTest->judgeService.checkPwd:"+
                judgeService.checkPwd(1, "a", "a"));
        System.out.println("judgeTest->judgeDao.insertJudge:"+
                judgeDao.insertJudge(2, "kk", "123"));
        // 这后面三个因为没有写对应的 Mapper.xml 所以还未进行测试。
//        System.out.println("judgeTest->judgeDao.changePwd:"+
//                judgeDao.changePwd(1, "a", "k"));
//        System.out.println("judgeTest->judgeDao.changeUsername:"+
//                judgeDao.changeUsername(1, "a", "hahaha"));
//        System.out.println("judgeTest->judgeDao.deleteJudge:"+
//                judgeDao.deleteJudge(2, "kk"));
    }

    @Test
    private void candidateTest(){
        System.out.println("candidateTest->candidateDao.queryAllInfoOfACandidate:"+
                candidateDao.queryAllInfoOfACandidate());
        System.out.println("candidateTest->candidateDao.receivedAVote:"+
                candidateDao.receivedAVote(1, "1"));
    }
}
