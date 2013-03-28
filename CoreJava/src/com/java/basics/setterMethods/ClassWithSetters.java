/*
 * Use of setter and getter methods
 */

/**
 * @author raghu natha reddy S
 */
package com.java.basics.setterMethods;

public class ClassWithSetters {
	
	private int student_id;
	private String student_name;
	
	//Member variables are encapsulated so that they can only be accessed via encapsulating methods 
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
}
