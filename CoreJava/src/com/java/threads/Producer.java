package com.java.threads;
class Producer extends Thread {
	boolean dataprodover = false; // Qdataprodove is a data production over
	StringBuffer sb;

	Producer() {
		sb = new StringBuffer();
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				sb.append(i + ":");
				sleep(100);
				System.out.println("appending");
			} catch (Exception e) {
			}
		}
		dataprodover = true;
	}
}