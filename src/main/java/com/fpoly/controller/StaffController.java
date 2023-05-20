package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fpoly.model.Staff;

@Controller
public class StaffController {
    @GetMapping("/staff")
    public String staff(Model model) {
        Staff staff = new Staff();
        staff.setId("NV001");
        staff.setFullname("Nguyễn Văn A");
        staff.setEmail("nva@gmail.com");
        staff.setSalary(1000.0);
        staff.setPosition("Nhân viên");
        model.addAttribute("staff", staff);
        return "staff";
    }

    @PostMapping("/staff/save")
    public String save(@ModelAttribute("staff") Staff staff){
        staff.setFullname(staff.getFullname().toUpperCase());
        return "staff";
    }
}
