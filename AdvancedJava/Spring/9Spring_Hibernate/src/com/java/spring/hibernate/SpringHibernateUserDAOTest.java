package com.java.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateUserDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/hibernate/spring-hibernate.xml");
		SpringHibernateUserDAO dao = (SpringHibernateUserDAO)context.getBean("springHibernateDAO");
		
		/*User newUser = (User)context.getBean("userClass") ;
		newUser.setUsername("Hibernate");
		newUser.setPassword("test");
		newUser.setFirstname("Admin");
		newUser.setLastname("User");
		dao.createUser(newUser);*/
		//dao.deleteUser("Hibernate");
		User user = dao.getUser("Raghu");
		System.out.println(user.getUsername()+" : "+user.getPassword()+" : "+user.getFirstname()+" : "+user.getLastname());
	}

}
