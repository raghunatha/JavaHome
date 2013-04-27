package com.spring.singleton;

public class CustomerService {

	private String name;
	private String url;

	private static CustomerService INSTANCE = null;

	// private constructor
	private CustomerService() {

	}

	public static CustomerService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CustomerService();
		}
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static CustomerService getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(CustomerService iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

}