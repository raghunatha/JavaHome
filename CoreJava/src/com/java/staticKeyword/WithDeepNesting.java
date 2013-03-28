//http://www.javabeat.net/2008/08/inner-classes-in-java/
package com.java.staticKeyword;

class WithDeepNesting {
	boolean toBe;

	WithDeepNesting(boolean b) {
		toBe = b;
	}

	class Nested {
		boolean theQuestion;

		class DeeplyNested {

			DeeplyNested() {
				theQuestion = toBe || !toBe;
			}
		}
	}

	public static void main(String[] args) {

		WithDeepNesting withDeepNesting = new WithDeepNesting(true);
		WithDeepNesting.Nested nested = withDeepNesting.new Nested();
		nested.new DeeplyNested();
		System.out.println(nested.theQuestion);

	}
}