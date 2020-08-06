package com.tinysnow.dao.impl;

import com.tinysnow.bean.Candidate;
import com.tinysnow.mappers.CandidateMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TinySnow
 */
@Repository
public class CandidateDaoImpl {

    @Autowired
    CandidateMapper candidateMapper;

    public List<Candidate> queryAllInfoOfACandidate(){
        return candidateMapper.queryAllInfoOfACandidate();
    }

    public Candidate receivedAVote(int projectId, String candidateName){
        return candidateMapper.receivedAVote(projectId, candidateName);
    }
}
