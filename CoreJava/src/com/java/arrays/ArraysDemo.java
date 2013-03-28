package com.java.arrays;

public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray;//Declaring an array
		int intArray1[] = {1,2,3,4,5,6,7,8,9,10}; //Initializing an array
		
		int[][] matrixA = {{1,2},{2,3,4}}; // Declaring and Initializing in the same line
		
		Student[] student = {new Student(1, "raghu", "maths"), new Student(2, "naveen", "english")}; //Array of objects
		String[] strings = {"Sagar","John","Nilesh"}; //Array of Strings
		
		for(int i=0;i<strings.length;i++){			
			System.out.print(strings[i]+",");
		}
		System.out.println();
		
		//Enhanced for loop
		for(String name:strings){			
			System.out.print(name+",");
		}
		
		System.out.println();
		intArray = new int[10];
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;
		intArray[9] = 10;
		//intArray[10] = 10;
		
		//Printing the values of an array using for loop
		for(int i=0; i<intArray.length;i++){			
			System.out.print(intArray[i]+",");
		}
		
		//enhanced for loop since JDK 1.5
		
		System.out.println("Using Enhaced for loop");
		for(int eachValue:intArray1){			
			System.out.print(eachValue+",");
		}
		
		System.out.println(" ");
		System.out.println("Accessing MultiDimentional Array ");
		System.out.println("The elements in matrix are ");
		for(int i=0;i<matrixA.length;i++)
			for(int j=0;j<matrixA[i].length;j++)
				System.out.println(matrixA[i][j]);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Accessing the student object");
		for(Student eachStudent : student){
			System.out.println("Student Id : " + eachStudent.getStudentId());
			System.out.println("Student Name : " + eachStudent.getStudentName());
			System.out.println("Student Course : " + eachStudent.getCourse());
			System.out.println(" ");
		}
		

	}

}
