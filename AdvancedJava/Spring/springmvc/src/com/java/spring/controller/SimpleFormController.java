package com.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.spring.model.SimpleModel;

@Controller
public class SimpleFormController {
	
	@RequestMapping(value="simpleForm.html")
	public void accessForm(Model model){
		
		model.addAttribute(new SimpleModel());
		
		
	}
	
	
	@RequestMapping(value="simpleFormSubmit.html")
	public void submitForm(@ModelAttribute SimpleModel simpleModel, Model model){
		
		System.out.println("Name : "+simpleModel.getUserName());
		System.out.println("Email : "+simpleModel.getEmail());
		
		model.addAttribute("sivaModel", simpleModel);
	}

}
