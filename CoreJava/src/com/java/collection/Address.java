package com.java.collection;

public class Address { 
	
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	
	public Address(){
		System.out.println("Constructor is called");
	}
	
	public Address(String address1,String address2,String city,String state,String zip){
		line1 = address1;
		line2 = address2;
		this.city = city;
		this.state=state;
		this.zip=zip;
		
		System.out.println("New Constructor");
		
	}
	
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
