package com.tinysnow.service.impl;

import com.tinysnow.dao.impl.CandidateDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinySnow
 */
@Service
public class CandidateServiceImpl {

    @Autowired
    CandidateDaoImpl candidateDao;


}
