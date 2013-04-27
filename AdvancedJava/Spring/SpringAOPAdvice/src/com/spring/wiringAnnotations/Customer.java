package com.spring.wiringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private String customerId;
	private String customerName;
	private Integer customerAge;

	// Customer can have an address associated
	@Autowired
	@Qualifier("addressObj1")
	private Address addressObject;

	public Address getAddressObject() {
		return addressObject;
	}

	public void setAddressObject(Address addressObject) {
		this.addressObject = addressObject;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}

}
