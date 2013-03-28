package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Siva");
		//HashSet.add("Siva");
		hashSet.add("Ash");
		hashSet.add("Ganesh");
		hashSet.add("Ganesh");
		/*Student student = new Student();
		HashSet.add(student);*/
		
		HashSet<Student> studentList = new HashSet<Student>();

		
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains("Siva"));
		//System.out.println(HashSet.remove(0));
		System.out.println(hashSet.size());
		System.out.println(hashSet.remove("Abdulla"));
		//System.out.println(HashSet.);
		System.out.println(hashSet.size());
		
		Iterator<String> hashSetIterator = hashSet.iterator();
		while(hashSetIterator.hasNext()){
			
			String value = hashSetIterator.next();
			
			System.out.println(value);
		}
		
		
		for(String  each:hashSet){
			System.out.println(each);
		}
		
		

	}

}
