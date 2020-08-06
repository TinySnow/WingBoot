package com.tinysnow.controller;


import com.tinysnow.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @author TinySnow
 */
@Controller
public class UserController {

    /**
     * 用于调度 Service 层
     */
    @Autowired
    private UserServiceImpl userService;

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
    public String checkPwd(@RequestParam("username") String username,
                                @RequestParam("password") String inputPwd,
                                Model model){
        Boolean pwdCorrectCheck = userService.checkPwd(username,inputPwd);
        if (pwdCorrectCheck == null){
            model.addAttribute("msg","账户不存在");
            return "UserLogin";
        } else if (pwdCorrectCheck) {
            return "JudgeLogin";
        } else {
            model.addAttribute("msg","账户或密码错误");
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
