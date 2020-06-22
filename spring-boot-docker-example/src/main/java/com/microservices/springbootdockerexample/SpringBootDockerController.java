package com.microservices.springbootdockerexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootDockerController {
	@GetMapping("/dockerApplicationMessage")
	public String index(final Model model) {
		model.addAttribute("title", "Docker Spring Boot Application");
		model.addAttribute("msg", "Welcome to the Web Application deployed to Docker!");
		return "index";
	}
}
