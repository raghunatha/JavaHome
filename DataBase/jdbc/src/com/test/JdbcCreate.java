package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {
	public static void main(String[] args) {
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "Athena";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "password";
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			try {				
				Statement stmt = conn.createStatement();
				String createTable = "CREATE TABLE USER(USER_ID Integer PRIMARY KEY , USER_NAME varchar(25) NOT NULL UNIQUE, USER_PASSWORD varchar(50) NOT NULL)";
				stmt.executeUpdate(createTable);
				System.out.println("Table created successfully");
			} catch (SQLException s) {
				System.out.println("Table all ready exists!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
