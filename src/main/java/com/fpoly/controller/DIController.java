package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpoly.model.Company;

@Controller
public class DIController {

    @Autowired
    Company company;

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return company.getName() + " - " + company.getLogo();
    }

    
}
