package com.java.exceptionHandling1;

public class FinallyNotCalled {
	public static void main(String[] args) {
		try {
			print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void print(){
		try{
			//After running the below statement, the JVM will be terminated
			//finally will never be executed
			System.exit(0);
		}finally{
			System.out.println("From finally block");
		}
	}
}
