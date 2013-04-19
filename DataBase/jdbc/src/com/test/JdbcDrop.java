package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDrop {
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
				String dropTable = "DROP TABLE USER";
				stmt.executeUpdate(dropTable);
				System.out.println("Table deleted successfully");
			} catch (SQLException s) {
				System.out.println("Unable to delete table");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
