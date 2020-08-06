package com.tinysnow;

import com.tinysnow.dao.impl.CandidateDaoImpl;
import com.tinysnow.dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisTest {

    @Autowired
    UserDaoImpl userDaoImpl;

    @Autowired
    CandidateDaoImpl candidateDaoImpl;

    @Test
    void contextLoads() {

        System.out.println(">>>>:"+ candidateDaoImpl.queryAllInfoOfACandidate());
        candidateDaoImpl.receivedAVote(1,"1");
    }
}
