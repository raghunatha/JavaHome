package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectior {
	public static void main(String[] args) {
		
		Connection conn = null;
		//address to connect to database 
		String url = "jdbc:mysql://localhost:3306/";
		//Schema name 
		String dbName = "Athena";
		//driver used to connect to database
		String driver = "com.mysql.jdbc.Driver";
		//username and password for connecting to the database 
		String userName = "root";
		String password = "password";
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Successfully connected to the database");
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
