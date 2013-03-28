package com.java.string;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "";
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			buffer.append(i);
			builder.append(i);
		}

		System.out.println(value);

		System.out.println(buffer.toString());
		System.out.println(builder.toString());
	}

}
