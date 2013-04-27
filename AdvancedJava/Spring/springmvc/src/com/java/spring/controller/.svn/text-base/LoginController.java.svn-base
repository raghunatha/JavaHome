package com.java.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.model.LoginModel;
import com.java.spring.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

@RequestMapping(value="login.html")
public void accessLogin(Model model){
	
	model.addAttribute(new LoginModel());
}

@RequestMapping(value="loginSubmit.html",method=RequestMethod.POST)
public String loginSubmit(@Valid LoginModel loginModel,BindingResult result,Model model){
	
	if(result.hasErrors()){
	return "login";
	}
	
	if(loginService.isValidUser(loginModel,model)){
	//model.addAttribute("loginModel", loginModel);
	return "loginSuccess";
	}
	
	result.rejectValue("userName", "login.Error");
	return "login";
}
}
