package com.java.exceptionHandling3;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException() {
		super();
	}

	public UserDefinedException(String s) {
		super(s);
	}
	
	public UserDefinedException(String message, Throwable cause) {
        super(message, cause);
    }

}
