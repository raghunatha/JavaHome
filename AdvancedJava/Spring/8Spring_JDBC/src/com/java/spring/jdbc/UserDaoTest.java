package com.java.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/jdbc/spring-jdbc.xml");

		UserDAOImpl impl = (UserDAOImpl)context.getBean("userDAO");
		//impl.saveUser("spring", "jdbc","Spring","JDBC");
		//impl.updateUser("Raghu","123hello");
		User user = impl.getUser("Raghu");
		System.out.println(user.getUsername()+" : "+user.getPassword()+" : "+user.getFirstname()+" : "+user.getLastname());
}
}
