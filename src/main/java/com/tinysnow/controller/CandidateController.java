package com.tinysnow.controller;

import com.tinysnow.dao.impl.CandidateDaoImpl;
import com.tinysnow.service.impl.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TinySnow
 */
@Controller
public class CandidateController {

    @Autowired
    CandidateServiceImpl candidateService;


    @RequestMapping("/VotingPage.html")
    public String test(Model model){
        model.addAttribute("msg","OK");
        return "VotingPage";
    }
}
