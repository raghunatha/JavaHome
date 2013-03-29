package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAlter {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Athena", "root", "password");
			try {
				Statement stmt = con.createStatement();
				int n = stmt.executeUpdate("ALTER TABLE EMPLOYEE ADD AGE Integer");
				System.out.println("Query executed, " + n + " rows affected");
			} catch (SQLException s) {
				System.out.println("Tabel or column or data type is not found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
