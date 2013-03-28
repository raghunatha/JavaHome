package com.java.threads;
class NewProducer extends Thread {
	StringBuffer sb;

	NewProducer() {
		sb = new StringBuffer();
	}

	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + ":");
					sleep(100);
					System.out.println("appending");
				} catch (Exception e) {
				}
			}
			System.out.println(" I am completed ---- Notifying the consumer");
			sb.notify(); // or we can use sb.notifyAll();
		}
	}
}