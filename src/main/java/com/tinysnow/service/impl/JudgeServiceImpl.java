package com.tinysnow.service.impl;

import com.tinysnow.dao.impl.JudgeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinySnow
 */
@Service
public class JudgeServiceImpl{

    @Autowired
    private JudgeDaoImpl judgeDaoImpl;

    public boolean checkPwd(int projectId, String judgeName, String inputPwd) {
        System.out.println("JudgeServiceImpl:"+ judgeDaoImpl.checkPwd(projectId, judgeName)
                .getJudgePwd().equals(inputPwd));
        return judgeDaoImpl.checkPwd(projectId, judgeName)
                .getJudgePwd().equals(inputPwd);
    }
}
