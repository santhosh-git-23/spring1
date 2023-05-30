package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	@RequestMapping("/home")
	public String getHello(Model model) {
		model.addAttribute("hello","Hello Santhosh!");
		return "hello";
	}
}
