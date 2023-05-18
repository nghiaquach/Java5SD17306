// package com.fpoly.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// import com.fpoly.model.Users;

// import jakarta.servlet.http.HttpServletRequest;



// @Controller
// public class BackupLController {
// 	@Autowired
// 	HttpServletRequest request;
	
// 	@GetMapping("login")
// 	public String login(Model model) {
// 		Users loginBean = new Users();
// 		model.addAttribute("loginBean", loginBean);
// 		return "login";
// 	}
	
// 	@PostMapping("login")
// 	public String loginAccount(@ModelAttribute("loginBean") Users loginBean, Model model ) {
		
// 		if(loginBean.getUsername().equals("nghiaqh") && loginBean.getPassword().equals("fpoly")) {
// 			model.addAttribute("username", loginBean.getUsername());
// 			String redirectUrl = request.getScheme() + "://www.yahoo.com";
//     		return "redirect:" + redirectUrl;
// 		}
// 		else {
// 		//System.out.println(loginBean);
// 			model.addAttribute("errorMessage", "Incorrect username and password! Please try again");
// 			return "loginFail";
// 		}
// 	}

// 	@ResponseBody
// 	@GetMapping("/sample")
// 	public String sampleResponse(){
// 		return "Hello Sample String Response";
// 	}

// 	@GetMapping("loginFail")
// 	public String loginFail(){
// 		return "forward:/loginFail";
// 	}
// }
