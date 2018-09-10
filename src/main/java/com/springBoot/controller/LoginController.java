package com.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "redirect:html/login.html";
	}
	
	@RequestMapping("/")
	public String defaultPage() {
		return "redirect:html/login.html";
	}

}
