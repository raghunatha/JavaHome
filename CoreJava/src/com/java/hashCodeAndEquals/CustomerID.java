package com.java.hashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class CustomerID {
	  private long crmID;
	  private int nameSpace;

	  public CustomerID(long crmID) {
	    super();
	    this.crmID = crmID;
	  }

	  public boolean equals(Object obj) {
	    //null instanceof Object will always return false
	    if (!(obj instanceof CustomerID))
	      return false;
	    if (obj == this)
	      return true;
	    return  this.crmID == ((CustomerID) obj).crmID ;
	  }
	  
	  public int hashCode() {
		  int result = 0;
		  result = (int)(crmID/3);
		  return result;
	  }

	  public static void main(String[] args) {
		  
		/*MyClass first = new MyClass("a","first");
		MyClass second = new MyClass("a","second");
		 */ 
		  
	    Map map = new HashMap();
	    map.put(new CustomerID(13),"Jeff Smith");
	    
	    System.out.println("In main method get hash code 1 : " + (new CustomerID(13)).hashCode());
	    System.out.println("In main method get hash code 2 : " + (new CustomerID(13)).hashCode());
	    System.out.println("In main method get hash code 3 : " + (new CustomerID(13)).hashCode());
	    System.out.println(map.get(new CustomerID(13)));
	  }

	}