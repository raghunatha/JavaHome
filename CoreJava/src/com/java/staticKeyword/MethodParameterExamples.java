package com.java.staticKeyword;

public class MethodParameterExamples {

	public String s = "bt";

	public void m1(String s) {
		s = this.s;
		s = "uk";

		// abstract
		class InnerClass extends MethodParameterExamples {

			String s = "ros";

			public void m1() {
				System.out.println(super.s = this.s);
			}
		}

		InnerClass innerClass = new InnerClass();
		innerClass.s = s;
		innerClass.m1();

	}

	public static void main(String[] args) {

		MethodParameterExamples methodParameterExamples = new MethodParameterExamples();
		methodParameterExamples.m1("vij");
		System.out.println(methodParameterExamples.s);

	}

}