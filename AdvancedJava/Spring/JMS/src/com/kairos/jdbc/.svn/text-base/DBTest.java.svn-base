package com.kairos.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable properties = new Hashtable();
		properties.put(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://192.168.10.216:7001");
		properties.put(Context.SECURITY_PRINCIPAL, "weblogic");
		properties.put(Context.SECURITY_CREDENTIALS, "Kairos12");
		
		
		try {
			InitialContext context = new InitialContext(properties);
			
			DataSource dataSource = (DataSource) context.lookup("jdbc/myDataSource");
			
			
			Connection conn = dataSource.getConnection();
			
			PreparedStatement statement = conn.prepareStatement("select * from user");
			
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()){
				
				System.out.println("username : "+resultset.getString("username")+ "     password : "+resultset.getString("password"));
			}
			
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
