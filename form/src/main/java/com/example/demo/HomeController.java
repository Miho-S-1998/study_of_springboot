package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
	
	@GetMapping("/") //GETリクエストの受け付け
	public String index() {
		return "form";
	}
	
	@PostMapping("/confirm") //POSTのリクエストの受け付け。
	public String confirm(@RequestParam String message,Model model) {
		model.addAttribute("message", message);
		return "confirm";
	}

}
