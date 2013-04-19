package com.test;

import java.sql.Connection;

public class ConnectionToDB {
	
	
	
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "Athena";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "password";
		
		try {
			Class.forName(driver).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
