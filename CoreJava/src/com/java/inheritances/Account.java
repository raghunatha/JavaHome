/*
 * An Account class with basic functionalities
 */

/**
 * @author raghu natha reddy S
 */
package com.java.inheritances;

public class Account {
	protected double balance;

	// Constructor to initialize balance
	public Account(double amount) {
		balance = amount;
		System.out.println("Parameterized constructor");
		System.out.println("Account balance is = " + balance);
	}

	// Overloaded constructor for empty balance
	public Account() {
		balance = 0.0;
		System.out.println("Default constructor");
		System.out.println("Account balance is = " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double withdraw(double amount) {
		// See if amount can be withdrawn
		if (balance >= amount) {
			balance -= amount;
			return amount;
		} else
			// Withdrawal not allowed
			return 0.0;
	}

	public double getbalance() {
		return balance;
	}
}
