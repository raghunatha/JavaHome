package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Siva");
		//TreeSet.add("Siva");
		treeSet.add("Ash");
		treeSet.add("Ganesh");
		treeSet.add("Ganesh");
		//treeSet.add(null);
		/*Student student = new Student();
		TreeSet.add(student);*/
		
		TreeSet<Student> studentList = new TreeSet<Student>();

		
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.size());
		System.out.println(treeSet.contains("Siva"));
		//System.out.println(TreeSet.remove(0));
		System.out.println(treeSet.size());
		System.out.println(treeSet.remove("Abdulla"));
		//System.out.println(TreeSet.);
		System.out.println(treeSet.size());
		
		Iterator<String> TreeSetIterator = treeSet.iterator();
		while(TreeSetIterator.hasNext()){
			
			String value = TreeSetIterator.next();
			
			System.out.println(value);
		}
		
		
		for(String  each:treeSet){
			System.out.println(each);
		}
		
		

	}

}
