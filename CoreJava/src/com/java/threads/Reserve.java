package com.java.threads;

class Reserve implements Runnable {
	int available = 1;
	int wanted;

	Reserve(int i) {
		wanted = i;
	}

	public  void run() {

		String name = Thread.currentThread().getName();
		
			System.out.println("Thread Name : "+name);
		
			synchronized (this) {
				System.out.println("Number of tickets available = " + available);
				if (available >= wanted) {

					
					try {
						Thread.sleep(2000);
						System.out.println(wanted + "tickets reserved for" + name);
						available = available - wanted;
					} catch (InterruptedException ie) {
					}
				} else
					System.out.println("Sorry, no tickets to reserve for " + name);
			}
	
			}
			
	

}
