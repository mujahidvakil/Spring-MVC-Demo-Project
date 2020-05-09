package com.demo.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	@RequestMapping("/processFormVersion")
	public String processFormData(HttpServletRequest req,Model model) {
		String st=req.getParameter("studentName");
		String studentName=st.toUpperCase();
		model.addAttribute("msg", studentName);
		return "process-form";
	}
	
	@RequestMapping("/processFormVersionthree")
	public String processFormVersionthree(@RequestParam("studentName") String theName,
			Model model) {
		String studentName=theName.toUpperCase();
		model.addAttribute("msg", studentName);
		return "process-form";
	}


}
