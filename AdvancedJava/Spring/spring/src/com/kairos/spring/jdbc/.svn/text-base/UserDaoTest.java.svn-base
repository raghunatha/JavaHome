package com.kairos.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/jdbc/spring-jdbc.xml");

		UserDAOImpl impl = (UserDAOImpl)context.getBean("userDAO");
		//impl.saveUser("spring", "jdbc","Spring","JDBC");
		//impl.updateUser("Padmini","123hello");
		User user = impl.getUser("Padmini");
		System.out.println(user.getUsername()+" : "+user.getPassword()+" : "+user.getFirstname()+" : "+user.getLastname());
}
}
