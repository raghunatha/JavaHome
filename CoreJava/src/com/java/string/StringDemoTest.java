package com.java.string;

public class StringDemoTest {
	public void test() {
		String s1 = "raghu";
		String s2 = "raghu";
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		if (s1 == s2)
			System.out.println("s1 == s2 (Address comparision)");
		else
			System.out.println("s1 != s2 (Adress comparision)");
		if (s1.equals(s2))
			System.out.println("s1 equals s2 (value comparision)");

		String s3 = new String("raghu");
		String s4 = new String("raghu");
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		if (s3 == s4)
			System.out.println("s3 == s4 (Address comparision)");
		else
			System.out.println("s3 != s4 (Adress comparision)");
		if (s3.equals(s4))
			System.out.println("s3 equals s4 (value comparision)");

		String s5 = new String("raghu");
		String s6 = "raghu";
		System.out.println("s5 = " + s5);
		System.out.println("s6 = " + s6);
		if (s5 == s6)
			System.out.println("s5 == s6 (Address comparision)");
		else
			System.out.println("s5 != s6 (Adress comparision)");
		if (s5.equals(s6))
			System.out.println("s5 equals s6 (value comparision)");

		if (s1 == s6)
			System.out.println("s1 == s6 (Address comparision)");
		else
			System.out.println("s1 != s6 (Adress comparision)");
		if (s1.equals(s6))
			System.out.println("s1 equals s6 (value comparision)");
	}

	public static void main(String[] args) {
		StringDemoTest t = new StringDemoTest();
		t.test();
	}
}
