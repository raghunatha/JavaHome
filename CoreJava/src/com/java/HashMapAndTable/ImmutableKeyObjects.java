package com.java.HashMapAndTable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableKeyObjects {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		Student stud1 = new Student();
		stud1.setStudentId(1);
		stud1.setStudentName("Raghu");
		
		Student stud2 = new Student();
		stud2.setStudentId(2);
		stud2.setStudentName("Naveen");
		
		map.put(stud1, "Maths");
		map.put(stud2, "Physics");
		
		System.out.println();
	}
}
