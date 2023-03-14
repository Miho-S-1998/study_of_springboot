package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {
	
	@GetMapping("/hello") //Hello Worldと表示
	public String index() {
		return"hello";
	}
	
	@GetMapping("/greeting") //アクセスの際に"greeting?message=●●"とするとHello World+●●の表示。
	public String greeting(@RequestParam("message")String message,Model model) {
		 model.addAttribute("sample" ,message);//値を入力しなければエラーメッセージが表示される
		return "hello";
	}
}
