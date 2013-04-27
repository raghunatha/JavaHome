package com.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KairsController {

@RequestMapping("/kairos")	
public ModelAndView helloWorld(){
	
	return new ModelAndView("kairos", "welcomeMessage", "Welcome to Our Application!!!");
	
	
}

}
