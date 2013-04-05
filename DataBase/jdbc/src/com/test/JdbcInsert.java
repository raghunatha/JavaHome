package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "Athena";
		String driver = "com.mysql.jdbc.Driver";
		
		insertRecord(url, db, driver);
		retrieveRecords(url, db, driver);
	}

	private static void retrieveRecords(String url, String db, String driver) {
		Connection con;
		try{
		      Class.forName(driver).newInstance();
		      con = DriverManager.getConnection(url+db, "root", "password");
		      try{
		        Statement stmt = con.createStatement();
		        ResultSet res = stmt.executeQuery("SELECT * FROM  USER");
		        System.out.println("USER_ID: " + "\t" + "USER_NAME: " + "\t" + "USER_PASSWORD");
		        while (res.next()) {
		          int id = res.getInt("USER_ID");
		          String name = res.getString("USER_NAME");
		          String password = res.getString("USER_PASSWORD");
		          System.out.println(id + "\t\t" + name + "\t\t" + password);
		        }
		        con.close();
		      }
		      catch (SQLException s){
		        System.out.println("SQL code does not execute.");
		      }    
		    }
		    catch (Exception e){
		      e.printStackTrace();
		    }
	}
	

	private static void insertRecord(String url, String db, String driver) {
		Connection con;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + db, "root", "password");
			try {
				Statement stmt = con.createStatement();
				int val = stmt.executeUpdate("INSERT USER VALUES(1, 'Raghu', 'Secret');");
				System.out.println("1 row affected");
			} catch (SQLException s) {
				s.printStackTrace();
				System.out.println("SQL statement is not executed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
