package com.java.threads;
class Consumer extends Thread {
	Producer prod;

	Consumer(Producer prod) {
		this.prod = prod;
	}

	public void run() {
		try {
			while (!prod.dataprodover) {
				sleep(10);
			}
		} catch (Exception e) {
		}
		System.out.println("Consumer consuming : "+prod.sb);
	}
}