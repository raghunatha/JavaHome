package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStock {
	public static void main(String[] args) {
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test_mysql";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "password";
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			try {				
				Statement stmt = conn.createStatement();
				String createTable = "CREATE TABLE stock (STOCK_ID int(10) NOT NULL, STOCK_CODE varchar(10) NOT NULL, " +
				"STOCK_NAME varchar(20) NOT NULL, PRIMARY KEY (STOCK_ID), UNIQUE KEY UNI_STOCK_NAME (STOCK_NAME), "+
				"UNIQUE KEY UNI_STOCK_ID (STOCK_CODE))";
				stmt.executeUpdate(createTable);
				System.out.println("Stock Table created successfully");
			} catch (SQLException s) {
				System.out.println("Table all ready exists!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
