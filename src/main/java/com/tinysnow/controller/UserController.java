package com.tinysnow.controller;


import com.tinysnow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author TinySnow
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 这个 Controller 的装配，只用于访问其控制的评委登录的跳转
     */
    @Autowired
    private JudgeController judgeController;

    @GetMapping({"/","UserLogin.html","UserLogin","userlogin","Login",
            "login","login.html","Login.html","index","index.html","Index"})
    public String jump2Login(){
        return "UserLogin";
    }

    @RequestMapping("/checkPwd")
    public String checkPassword(@RequestParam("username") String username,
                                @RequestParam("password") String inputPwd){
        Boolean pwdCorrectCheck = userService.checkPassword(username,inputPwd);
        if (pwdCorrectCheck == null){
            return "TempTestPage";
        } else if (pwdCorrectCheck) {
            return "JudgeLogin";
        } else {
            return "UserLogin";
        }
    }

    @GetMapping("/UserRegister.html")
    public String jump2UserRegister(){
        return "UserRegister";
    }

    @GetMapping("/ForgetPassword.html")
    public String jump2ForgetPassword(){
        return "ForgetPassword";
    }
}
