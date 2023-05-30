package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpoly.dao.CategoryDAO;
import com.fpoly.model.Category;

@Controller
public class CategoryController {

    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping("/category/index")
    public String index(Model model) {
        var categories = categoryDAO.findAll();

        for (Category category : categories) {
  var products = category.getProducts();
            System.out.println(products.size());
        }

        model.addAttribute("categories", categories);
        return "category/index";
    }
}
