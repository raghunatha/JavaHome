package com.java.exceptionHandling3;

public class Clock {
	private int hours;   // 1-12
	  private int minutes; // 0-59
	  private int seconds; // 0-59

	  public Clock(int hours, int minutes, int seconds) {

	    if (hours < 1 || hours > 12) {
	      throw new IllegalArgumentException("Hours must be between 1 and 12");
	    }
	    if (minutes < 0 || minutes > 59) {
	    	//throwing an exception which user has defined for his purpose    	
	      throw new UserDefinedException("Minutes must be between 0 and 59");
	    }
	    if (seconds < 0 || seconds > 59) {
	      throw new UserDefinedException("Seconds must be between 0 and 59", new IllegalArgumentException("User input error"));
	    }
	  
	    this.hours   = hours;
	    this.minutes = minutes;
	    this.seconds = seconds;
	  
	  }	
}
