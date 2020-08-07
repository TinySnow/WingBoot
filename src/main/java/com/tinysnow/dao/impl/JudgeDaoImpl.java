package com.tinysnow.dao.impl;

import com.tinysnow.bean.Judge;
import com.tinysnow.mappers.JudgeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author TinySnow
 */
@Repository
public class JudgeDaoImpl {

    @Autowired
    JudgeMapper judgeMapper;

    public Judge checkPwd(int projectId, String judgeName){
        return judgeMapper.checkPwd(projectId, judgeName);
    }

    public Judge changeUsername(int projectId, String judgeName,String newName){
        return judgeMapper.changeUsername(projectId, judgeName,newName);
    }

    public Judge changePwd(int projectId, String judgeName,String newPwd){
        return judgeMapper.changePwd(projectId, judgeName,newPwd);
    }

    public int insertJudge(int projectId, String judgeName, String judgePwd){
        return judgeMapper.insertJudge(projectId, judgeName, judgePwd);
    }

    public Judge deleteJudge(int projectId,String judgeName){
        return judgeMapper.deleteJudge(projectId, judgeName);
    }
}
