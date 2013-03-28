package com.java.threads;

public class Reservation extends Thread {

	private String name;
	public Reservation(String name) {
		this.name=name;
	}
	
	
	@Override
	public void run() {
	
		for(int i=0;i<10;i++){
			
			System.out.println(name+" executed...");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
							e.printStackTrace();
			}
			
		}
		
		
	}
}
