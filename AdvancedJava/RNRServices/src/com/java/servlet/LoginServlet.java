package com.java.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dto.User;
import com.java.service.LoginAuthenticatorService;
import com.java.util.Constants;
import com.java.util.InputDataValidator;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);	
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//if the user sends a get request the doPost will be called and the request will be served
		doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		LoginAuthenticatorService loginService = null;
		boolean isUserRegistered = false;
		
		try{
			//get the parameters from the request
			String userName = request.getParameter("username");
			String password = request.getParameter("password");
			
			//validate the input data coming from client side or front end
			String message = InputDataValidator.validate(userName, Constants.USERNAME_LENGTH);
			if(message.equals(Constants.MESSAGE_SUCCESS)){	
				message = InputDataValidator.validate(password, Constants.PASSWORD_LENGTH);
				if(message.equals(Constants.MESSAGE_SUCCESS)){
					loginService = new LoginAuthenticatorService();
					isUserRegistered = loginService.isLoginValid(userName, password);
					if(isUserRegistered){
						HttpSession session = request.getSession();
						session.setAttribute("username", userName);
						request.setAttribute("reqname", userName);
						request.getRequestDispatcher("/pages/success.jsp").forward(request, response);
					}else{						
						request.setAttribute("loginError", "username and password did not match");
						request.getRequestDispatcher("/login.jsp").forward(request, response);
					}
				}else{
					request.setAttribute("loginError", "password " + message);
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			}else{
				request.setAttribute("loginError", "username " + message);
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}	
}
