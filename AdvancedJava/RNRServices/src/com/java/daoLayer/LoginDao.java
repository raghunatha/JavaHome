package com.java.daoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.dto.User;
import com.java.util.DBConnection;

public class LoginDao {

	public User getUserDetails(String userName) {

		User userObj = null;
		String sqlQuery = null;
		ResultSet resultSet = null;
		Connection connection = null;
		PreparedStatement pStatement = null;

		try {
			if (null != userName) {
				connection = DBConnection.getConnection();
				sqlQuery = "select * from user where username = ?";
				pStatement = connection.prepareStatement(sqlQuery);
				pStatement.setString(1, userName);
				resultSet = pStatement.executeQuery();

				while (resultSet.next()) {
					userObj = new User();
					userObj.setUserId(resultSet.getInt(1));
					userObj.setUserName(resultSet.getString(2));
					userObj.setUserPassword(resultSet.getString(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			sqlQuery = null;
			resultSet = null;
			connection = null;
			pStatement = null;
			DBConnection.closeConnection();
		}
		return userObj;
	}

}
