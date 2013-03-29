package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPrepared {

	public static void main(String args[]) {

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/";
		String db = "Athena";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "password";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + db, user, pass);
			con.setAutoCommit(false);// Disables auto-commit.

			String sql = "INSERT INTO EMPLOYEE VALUES(?,?) ";
			pst = con.prepareStatement(sql);

			pst.setInt(1, 3);
			pst.setString(2, "Prasad");

			pst.executeUpdate();

			sql = "SELECT * FROM EMPLOYEE";
			rs = pst.executeQuery(sql);

			System.out.println("No  \tName");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "     \t");
				System.out.print(rs.getString(2) +"\n");
			}
			rs.close();
			pst.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
