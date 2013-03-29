package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPreparedUpdate {

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
            
            pst = con.prepareStatement("UPDATE EMPLOYEE SET EMP_NAME=? where EMP_ID =?");
            
            pst.setString(1, "Sriram");
            pst.setString(2, "3");
            
            pst.executeUpdate();
            
            
            pst = con.prepareStatement("SELECT * FROM EMPLOYEE");
            rs = pst.executeQuery();

            System.out.println("Id\tName\tClass");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println(rs.getString(2));
            }

            rs.close();
            pst.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
