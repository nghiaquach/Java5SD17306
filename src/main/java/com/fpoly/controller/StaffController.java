package com.fpoly.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fpoly.model.Country;
import com.fpoly.model.Staff;

import jakarta.validation.Valid;

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
    public String save(@Valid @ModelAttribute("staff") Staff staff, BindingResult result){
        if(result.hasErrors()){
            return "staff";
        }
        staff.setFullname(staff.getFullname().toUpperCase());
        return "staff";
    }

    @ModelAttribute("countries")
    public List<Country> getCountries(){
        List<Country> countries = new ArrayList<>();
        Country country1 = new Country();
        country1.setId("VN");
        country1.setCountryName("Việt Nam");
        countries.add(country1);
        Country country2 = new Country();
        country2.setId("US");
        country2.setCountryName("United States");
        countries.add(country2);
        Country country3 = new Country();
        country3.setId("FR");
        country3.setCountryName("France");
        countries.add(country3);
        return countries;
    }
}
