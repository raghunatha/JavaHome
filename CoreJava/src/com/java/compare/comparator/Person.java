package com.java.compare.comparator;

public class Person {

	private String name;
	private double age;
	private double height;

	public Person(String newname, double newage, double newHeight) {
		setName(newname);
		setAge(newage);
		setHeight(newHeight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return String.format("{name=%s, age=%f, height=%f}", name, age, height);
	}

}