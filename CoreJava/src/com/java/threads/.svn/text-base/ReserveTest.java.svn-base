package com.java.threads;
public class ReserveTest {
	public static void main(String args[]) {
		
		// create an obj to Reserve class with 1 berth
		
		Reserve obj = new Reserve(1);
		
		// create 2 threads and attach them to obj
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		// give names to threads
		t1.setName("First Person");
		t2.setName("Second Person");
		// run the threads
		t1.start();
		//t1.sleep(1000);
		t2.start();
	}
}
