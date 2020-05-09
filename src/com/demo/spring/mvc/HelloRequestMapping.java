package com.demo.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestDemo")
public class HelloRequestMapping {
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
}
