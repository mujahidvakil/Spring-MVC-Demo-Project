package com.demo.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add initBinder to remove whitespace leading and trailing etc...
	@InitBinder
	public void initBinder(WebDataBinder webdataBinder) {
		StringTrimmerEditor ste=new StringTrimmerEditor(true);
		webdataBinder.registerCustomEditor(String.class, ste);
	}
	@RequestMapping("/showForm")
	public String showForm(Model m) {
		m.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
		
	}
}
