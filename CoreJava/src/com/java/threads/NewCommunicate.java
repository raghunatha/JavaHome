package com.java.threads;
class NewCommunicate {
	public static void main(String args[]) {
		// create Producer, Consumer, objects
	
		NewProducer obj1 = new NewProducer();
		
		NewConsumer obj2 = new NewConsumer(obj1);
		// create 2 threads and attach them obj1, obj2
		
		/*Thread t1 = new Thread(obj1);
		
		Thread t2 = new Thread(obj2);
		// run the threads
		
		t1.start();
		
		t2.start();*/
		
		obj1.start();
		obj2.start();
	}
}