package com.java.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection = null;		
		Statement statement = null;
		String sqlText = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/spring_test", "postgres",
					"password");
			statement = connection.createStatement();

			sqlText = "create table users (username varchar(20), password varchar(20), firstname varchar(20), lastname varchar(20))";
			System.out.println("Executing this command: " + sqlText + "\n");
			statement.executeUpdate(sqlText);

			sqlText = "insert into users values ('Raghu','password', 'Raghu', 'Reddy')";
			System.out.println("Executing this command: " + sqlText + "\n");
			statement.executeUpdate(sqlText);
			sqlText = "insert into users values ('Naveen','secret', 'Naveen', 'Reddy')";
			System.out.println("Executing this command: " + sqlText + "\n");
			statement.executeUpdate(sqlText);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				statement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
