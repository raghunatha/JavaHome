package com.java.threads;
public class BookTicket extends Thread {

	Object train, comp;

	BookTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}

	public void run() {
		synchronized (comp) {
			System.out.println("BookTicket locked the Compartment");
			try {
				sleep(200);
			} catch (InterruptedException ie) {
			}
			System.out.println("BookTicket wants to lock on Train");
			synchronized (train) {
				System.out.println("BookTicket now locked Train");
			}
		}
	}
}
