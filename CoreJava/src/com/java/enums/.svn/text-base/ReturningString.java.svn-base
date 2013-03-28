package com.java.enums;

public enum ReturningString {
	  A("text1"),
	  B("text2"),
	  C("text3"),
	  D("text4");

	  private String text;

	  ReturningString(String text) {
	    this.text = text;
	  }

	  public String getText() {
	    return this.text;
	  }

	  public static ReturningString fromString(String text) {
	    if (text != null) {
	      for (ReturningString b : ReturningString.values()) {
	        if (text.equalsIgnoreCase(b.text)) {
	          return b;
	        }
	      }
	    }
	    return null;
	  }
	}
