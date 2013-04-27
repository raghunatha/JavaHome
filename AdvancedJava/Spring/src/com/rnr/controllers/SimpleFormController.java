package com.rnr.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rnr.form.User;

@Controller
public class SimpleFormController {
	   
	@RequestMapping(value = "/simpleForm", method = RequestMethod.GET)
	public void simpleForm(Model model) {
		   model.addAttribute(new User());
	  }
	
	@RequestMapping(value = "/formoutput", method = RequestMethod.POST)
	public void simple(@ModelAttribute User user, Model model) {
		   model.addAttribute("user", user);		
	}
}
