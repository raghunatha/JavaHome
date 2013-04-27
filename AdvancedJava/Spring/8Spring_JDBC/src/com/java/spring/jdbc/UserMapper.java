package com.java.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		 return new User(resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("firstname"),resultSet.getString("lastname"));
	}

}
