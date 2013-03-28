package com.java.threads;
public class CancelTicket extends Thread {
	Object train, comp;

	CancelTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}

	public void run() {
		synchronized (comp) {
			System.out.println("CancelTicket locked the Compartment");
			try {
				sleep(100);
			} catch (InterruptedException ie) {
			}
			System.out.println("CancelTicket wants to lock on Train");
			synchronized (train) {
				System.out.println("CancelTicket now locked Train");
			}
		}
	}
}
