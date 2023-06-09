package com.fpoly.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpoly.dao.AccountDAO;
import com.fpoly.model.Account;
import com.fpoly.model.Users;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    AccountDAO accountDAO;

    @Autowired
    HttpSession session;

    @GetMapping("login")
    public String login(Model model){
        // Users user = new Users();
        // user.setUsername("abc");
        // user.setPassword("123");

        // Users user1 = new Users();
        // user1.setUsername("def");
        // user1.setPassword("456");

        // var users = new ArrayList<>();
        // users.add(user);
        // users.add(user1);
        
        // model.addAttribute("users", users);
        model.addAttribute("theDate", new java.util.Date());
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("loginBean") Users loginBean, Model model){

        Account user = accountDAO.findByUsername(loginBean.getUsername());

        if(loginBean.getUsername().equals(user.getUsername()) && loginBean.getPassword().equals(user.getPassword())){
            model.addAttribute("username", loginBean.getUsername());
            session.setAttribute("user", user);
            return "redirect:/product/index"; 
        }
        model.addAttribute("error","invalid user!");
        return "login";
    }

    @GetMapping("/errorpage")
    public String error(@RequestParam("error") String error, Model model){
        model.addAttribute("error", error);
        return "errorpage";
    }
    
}
