package com.java.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectPostgre {  
    public static void main(String[] args) {  
        Connection connection = null;  
        ResultSet resultSet = null;  
        Statement statement = null;
        String sqlText = null;
  
        try {  
            Class.forName("org.postgresql.Driver");  
            connection = DriverManager.getConnection(  
                    "jdbc:postgresql://localhost:5432/spring_test", "postgres",  
                    "password");  
            statement = connection.createStatement();
            
           sqlText = "create table jdbc_demo (code int, text varchar(20))";
            System.out.println("Executing this command: "+sqlText+"\n");
            statement.executeUpdate(sqlText);
            
            sqlText = "insert into jdbc_demo values (1,'One')";
            System.out.println("Executing this command: "+sqlText+"\n");
            statement.executeUpdate(sqlText);
            
            sqlText = "update jdbc_demo set text = 'Three' where code = 1";
            System.out.println("Executing this command: "+sqlText+"\n");
            statement.executeUpdate(sqlText);
            System.out.println (statement.getUpdateCount()+
                                " rows were update by this statement\n");
           
            System.out.println("\n\nNow demostrating a prepared statement...");
            sqlText = "insert into jdbc_demo values (?,?)";
            System.out.println("The Statement looks like this: "+sqlText+"\n");
            System.out.println("Looping three times filling in the fields...\n");
            PreparedStatement ps = connection.prepareStatement(sqlText);
            for (int i=10;i<13;i++)
            {
              System.out.println(i+"...\n");
              ps.setInt(1,i);         //set column one (code) to i
              ps.setString(2,"Hi"); //Column two gets a string
              ps.executeUpdate();
            }
            ps.close();

         
            System.out.println("Now executing the command: "+
                               "select * from jdbc_demo");
            resultSet = statement.executeQuery("select * from jdbc_demo");
            if (resultSet != null)
            {
              while (resultSet.next())
              {
                System.out.println("code = "+resultSet.getInt("code")+
                                   "; text = "+resultSet.getString(2)+"\n");
              }
            }
            resultSet.close();


           /* sqlText = "drop table jdbc_demo";
            System.out.println("Executing this command: "+sqlText+"\n");
            statement.executeUpdate(sqlText);*/           
           
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                resultSet.close();  
                statement.close();  
                connection.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}
