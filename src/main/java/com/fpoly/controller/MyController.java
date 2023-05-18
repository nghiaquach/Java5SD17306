package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@GetMapping("hello")
	public String sayHello(HttpSession session, HttpServletRequest request) {
		String fullname = request.getParameter("hoten");
		request.setAttribute("message", fullname);
		return "hello";
	}
	
}
