package com.java.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale locale = new Locale("es","US");
		ResourceBundle bundle = ResourceBundle.getBundle("com/kairos/util/application",locale);
		String dbUsername = bundle.getString("DB_USERNAME");
		String dbPassword = bundle.getString("DB_PASSWORD");
		String dbUrl = bundle.getString("DB_URL");
		
		System.out.println(dbUsername);
		System.out.println(dbPassword);
		System.out.println(dbUrl);
	}

}
