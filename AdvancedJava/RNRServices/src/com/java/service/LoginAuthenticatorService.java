package com.java.service;

import java.sql.SQLException;

import com.java.daoLayer.LoginDao;
import com.java.dto.User;

public class LoginAuthenticatorService {

	LoginDao loginDao = new LoginDao();

	public boolean isLoginValid(String userName, String password)
			throws SQLException, Exception {

		User userObj = new User();
		boolean isValidUser = false;

		try {
			if (null != userName && null != password) {
				userObj = loginDao.getUserDetails(userName);
				// userObj length should be greater than zero or one
				if ((null != userObj)) {
					if (password.equals(userObj.getUserPassword())) {
						isValidUser = true;
					}
				}
			}
		} catch (Exception e) {
			throw new SQLException();
		}
		return isValidUser;
	}
}
