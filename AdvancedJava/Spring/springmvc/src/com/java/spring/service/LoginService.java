package com.java.spring.service;

import org.springframework.ui.Model;

import com.java.spring.model.LoginModel;

public class LoginService {

	private LoginDAO loginDAO;
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	public boolean isValidUser(LoginModel loginModel,Model model){
		
		
		Users user = loginDAO.getUser(loginModel.getUserName());
		
		if(user != null && loginModel.getPassword().equals(user.getPassword())){
			model.addAttribute("loggedUser",user);
			return true;
		}
		return false;
	}
}
