package com.java.threads;
class DeadLock {
	public static void main(String args[]) throws Exception {
		// take train and compartment as objects
		
		Object train = new Object();
		Object compartment = new Object();
		// create objects to CancelTicket, BookTicket
		
		CancelTicket obj1 = new CancelTicket(train, compartment);
		BookTicket obj2 = new BookTicket(train, compartment);
		// create 2 threads and attach them to these objects
		
		Thread t1 = new Thread(obj1);
		
		Thread t2 = new Thread(obj2);
		// run the threads
		
		t1.start();
		t2.start();
		
	}
}