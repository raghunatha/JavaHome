package com.java.constructor;

public class OverloadedConstructors {
	String name;

	//Key Rule: The first line in a constructor must be a call to super() or a call to this().
	//The preceding rule means a constructor can never have both a call to super() and a call to this().
	OverloadedConstructors(String name) {
		this.name = name;
	}

	OverloadedConstructors() {
		this(makeRandomName());
	}

	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}

	public static void main(String[] args) {
		OverloadedConstructors a = new OverloadedConstructors();
		System.out.println(a.name);
		OverloadedConstructors b = new OverloadedConstructors("Zeus");
		System.out.println(b.name);
	}
}