package com.java.threads;

public class RunnableReservationTest{
	
 public static void main(String[] args) {
	RunnableReservation buyReservation= new RunnableReservation("Buy a Ticket");
	RunnableReservation cancelReservation= new RunnableReservation("Cancel a Ticket");
	 
	
	Thread t1 = new Thread(buyReservation);
	Thread t2 = new Thread(cancelReservation);
	t1.start();
	t2.start();
}
 
}