package com.java.exceptionHandling4;

public class ProspectException extends RuntimeException {

	private String message;
	public ProspectException(String message) {
		this.setMessage(message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
