package com.java.threads;

public class RunnableReservation implements Runnable {

	private String name;

	public RunnableReservation(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(name + " executed...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
