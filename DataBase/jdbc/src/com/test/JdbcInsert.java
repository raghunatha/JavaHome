package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
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
		        ResultSet res = stmt.executeQuery("SELECT * FROM  EMPLOYEE");
		        System.out.println("EMP_ID: " + "\t" + "EMP_NAME: ");
		        while (res.next()) {
		          int i = res.getInt("EMP_ID");
		          String s = res.getString("EMP_NAME");
		          System.out.println(i + "\t\t" + s);
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
				int val = stmt.executeUpdate("INSERT EMPLOYEE VALUES(3, 'Prasad')");
				System.out.println(val + "rows affected");
			} catch (SQLException s) {
				System.out.println("SQL statement is not executed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
