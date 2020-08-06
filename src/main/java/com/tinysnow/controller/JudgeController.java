package com.tinysnow.controller;

import com.tinysnow.service.impl.JudgeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author TinySnow
 */
@Controller
public class JudgeController {

    @Autowired
    private JudgeServiceImpl judgeService;

    @GetMapping("/JudgeLogin.html")
    public String jump2JudgeLogin(){
        return "JudgeLogin";
    }

    @RequestMapping("/checkJudgePwd")
    public String checkJudgePwd(@RequestParam("projectId") int projectId,
                                @RequestParam("judgeName") String judgeName,
                                @RequestParam("inputPwd") String inputPwd,
                                Model model){
//        System.out.println(projectId);
//        System.out.println(judgeName);
//        System.out.println(inputPwd);
        boolean pwdCorrectCheck = judgeService.checkPwd(projectId,judgeName,inputPwd);
        if(pwdCorrectCheck){
            return "VotingPage";
        } else {
            model.addAttribute("msg","账户或者密码错误");
            return "JudgeLogin";
        }
    }
}
