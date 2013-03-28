package com.java.exceptionHandling4;

class MyException extends Exception {
	MyException() {
		super("My Exception");
	}
}

@SuppressWarnings(value = "default")
class YourException extends Exception {
	YourException() {
		super("Your Exception");
	}
}

class ChainDemo {
	public static void main(String[] args) {
		try {
			someMethod1();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	static void someMethod1() throws MyException {
		try {
			someMethod2();
		} catch (YourException e) {
			//System.out.println(e.getMessage());
			MyException e2 = new MyException();
			e2.initCause(e);
			throw e2;
		}
	}

	static void someMethod2() throws YourException {
		throw new YourException();
	}
}
