package com.java.spring.aop;

public class CafeOwner {

	public void recordLoginTime(){
		System.out.println("Cafe Owner recorded Login time");
	}
	
	public void recordLogoutTime(){
		System.out.println("Cafe Owner recorded Logout time");
	}
	
	public void issueBill(){
		System.out.println("Cafe Owner issued the bill");
	}
	
	public void allocateSystem(){
		System.out.println("Cafe Owner allocated the System");
	}
	
	public void deAllocateSystem(){
		System.out.println("Cafe Owner de-allocated the System");
	}
	
	public void cancelBill(){
		System.out.println("Cafe Owner Cancelled the Billing");
	}
	
	public void countPritns(){
		System.out.println("Cafe Owner counted the no of pages");
	}
}

