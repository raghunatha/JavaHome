package com.java.threads;
class NewConsumer extends Thread {
	NewProducer prod;

	NewConsumer(NewProducer prod) {
		this.prod = prod;
	}

	public void run() {
		synchronized (prod) {
			try {
				prod.wait();
			} catch (Exception e) {
			}
			System.out.println("Producer Notified");
			System.out.println(prod.sb);
		}
	}
}