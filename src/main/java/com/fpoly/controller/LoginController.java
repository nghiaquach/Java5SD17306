package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fpoly.model.Users;

@Controller
public class LoginController {
    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("loginBean") Users loginBean, Model model){
        if(loginBean.getUsername().equals("nguyevana") && 
        loginBean.getPassword().equals("12345")){
            model.addAttribute("username", loginBean.getUsername());
            return "welcome"; 
        }
        model.addAttribute("error", "invalid user");
        return "login";
    }
    
}
