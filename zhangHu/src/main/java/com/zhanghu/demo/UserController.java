package com.zhanghu.demo;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello controller";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/info")
    @ResponseBody
    public Object getCurrentUser(Authentication authentication){
        return authentication;
    }
}
