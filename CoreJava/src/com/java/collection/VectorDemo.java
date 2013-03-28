package com.java.collection;

import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector = new Vector<String>();
		vector.add("Siva");
		//Vector.add("Siva");
		vector.add("Ash");
		vector.add("Ganesh");
		/*Student student = new Student();
		Vector.add(student);*/
		
		Vector<Student> studentList = new Vector<Student>();

		
		System.out.println(vector.isEmpty());
		System.out.println(vector.size());
		System.out.println(vector.contains("Siva"));
		System.out.println(vector.indexOf("Siva"));
		//System.out.println(Vector.remove(0));
		System.out.println(vector.size());
		System.out.println(vector.remove("Abdulla"));
		//System.out.println(Vector.);
		System.out.println(vector.size());
		
		for(int i=0;i<vector.size();i++){
			
			String value = (String)vector.get(i);
		    if(value.equals("Siva")){
		    	String newValue = "Siva Modified";
		    	vector.add(newValue);
		    	vector.remove(value);
		    }
			//System.out.println(value);
		}
		
		System.out.println(vector);
		
		
		for(String  each:vector){
			System.out.println(each);
		}
		
		

	}

}
