package com.java.hashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    public String getEqualField() {
        return importantField;
    }

    public String getAnotherField() {
        return anotherField;
    }

    //Hash code is calculated for the field named "importantField"
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode());
        System.out.println("HashCode is : " + result);
        return result;
    }

    //Equals is calculated for the field named "importantField"
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MyClass other = (MyClass) obj;
        if (importantField == null) {
            if (other.importantField != null)
                return false;
        } else if (!importantField.equals(other.importantField))
            return false;
        return true;
    }
    
    public static void main(String[] args) {
    	
    	MyClass first = new MyClass("a","first");
    	MyClass second = new MyClass("a","second");
    	
    	Map<Object, String> map = new HashMap<Object, String>();
    	//Adding values to the map 
    	//Keys are the objects
    	map.put(first, "Raghu");
    	map.put(second, "naveen");
    	
    	System.out.println("Size of the map is : " + map.size());
    	
    	//Comparing the objects
    	if(first.equals(second)){
    		System.out.println("equals");
    	}else{
    		System.out.println("not equals");
    	}   	   	
	}

}
