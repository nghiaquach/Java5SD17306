package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpoly.service.MailerServiceImp;

@Controller
public class SendingMail {
    @Autowired
    MailerServiceImp mailerService;

    @ResponseBody
    @GetMapping("/mailer/send")
    public void send(){
        mailerService.queue("**@gmail.com", 
        "Test Sending Mail with Schedule Tasks",
         "Test Sending Mail with Schedule Tasks");
    }
}
