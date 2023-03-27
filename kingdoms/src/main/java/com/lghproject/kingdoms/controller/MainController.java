package com.lghproject.kingdoms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("main")
	public String main(Model model) {
		model.addAttribute("data", "hello, my kingdoms!");
		return "main";
	}

}
