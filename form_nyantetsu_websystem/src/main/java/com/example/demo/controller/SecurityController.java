package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
  @GetMapping("/login")
  public String login() {
	  return "login";
  }
  
  @GetMapping("/")
  public String showList(Authentication loginUser,Model model) { //Authentication=認証済みのユーザー情報を取得。principalでも可
	model.addAttribute("username",loginUser.getName());
	model.addAttribute("authority",loginUser.getAuthorities());
	return "user";
  }

}
