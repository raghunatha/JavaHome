package com.java.spring.aop;

public class CustomerImpl implements Customer {

	@Override
	public void browse() throws Exception {
		
		System.out.println("Customer Started browsing...");
		//throw new Exception();
	}

	@Override
	public void orderPrints() {
	
		System.out.println("Customer ordered prints");
		
	}


	@Override
	public void fakebrowse() {
		System.out.println("virtual browse");
		
	}
}
