package com.fpoly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fpoly.dao.OrderDetailDAO;
import com.fpoly.model.Report;

@Controller
public class ReportController {

    @Autowired
    OrderDetailDAO orderDetailDAO;

    @GetMapping("/report/index")
    public String index(Model model) {
        List<Report> reports = orderDetailDAO.getInventoryByCategory();
        model.addAttribute("reports", reports);
        return "report/index";
    }
}
