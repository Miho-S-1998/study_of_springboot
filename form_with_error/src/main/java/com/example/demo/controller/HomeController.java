package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Inquiry;

@Controller

public class HomeController {
@GetMapping("/")
public String index(@ModelAttribute Inquiry inquiry) {
	return "index";
}

@PostMapping("/")
public String confirm(@Validated @ModelAttribute Inquiry inquiry,BindingResult result) { 
//@Validatedで入力値のチェック→resultに代入される
	
	if(result.hasErrors()) {　//result(入力値)のエラーチェック
		return "index";　 //エラーがあればindex.htmlへ
	}
	
	return "confirm"; //なければconfirm.htmlへ
 }

}
