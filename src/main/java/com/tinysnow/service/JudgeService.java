package com.tinysnow.service;

import com.tinysnow.dao.JudgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinySnow
 */
@Service
public class JudgeService {

    @Autowired
    private JudgeMapper judgeMapper;

    public boolean checkPwd(int projectId, String judgeName, String inputPwd) {
        System.out.println(judgeMapper.checkPwd(projectId, judgeName)
                .getJudgePwd().equals(inputPwd));
        return judgeMapper.checkPwd(projectId, judgeName)
                .getJudgePwd().equals(inputPwd);

    }
}
