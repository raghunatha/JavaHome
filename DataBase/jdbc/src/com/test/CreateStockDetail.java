package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStockDetail {
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
				String createTable = "CREATE TABLE  stock_detail (STOCK_ID int(10) NOT NULL, COMP_NAME varchar(100) NOT NULL, COMP_DESC varchar(255) DEFAULT NULL, "+
									 "REMARK varchar(255) DEFAULT NULL, LISTED_DATE date NOT NULL, PRIMARY KEY (STOCK_ID), "+
									 "CONSTRAINT FK_STOCK_ID FOREIGN KEY (STOCK_ID) REFERENCES stock (STOCK_ID))";
				stmt.executeUpdate(createTable);
				System.out.println("Stock Detail Table created successfully");
			} catch (SQLException s) {
				s.printStackTrace();
				System.out.println("Table all ready exists!");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
