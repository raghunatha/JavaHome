package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
	
	static Connection conn=null;
	static String driver;
	static String url;
	static String userName;
	static String password;
	
	private DBConnection(){
		
		
	}
	public static Connection getConnection() {
		
		loadDbProperties();
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
			return conn;
		} catch (Exception ex) {
			System.out.println("Class not found " + ex.getMessage());
			
		}
		return conn;
	}

	
	
	public static  void loadDbProperties() {
		ResourceBundle labels = ResourceBundle.getBundle("db");
		driver=labels.getString("DB_DRIVER");
		url=labels.getString("DB_URL");
		userName=labels.getString("DB_USER");
		password=labels.getString("DB_PASSWORD");
	}



	public static void closeConnection() {
	
	try {
		DBConnection.conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}	
	}

}