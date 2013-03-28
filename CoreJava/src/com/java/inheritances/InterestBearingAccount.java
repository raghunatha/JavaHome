/*
 *
 */

/**
 * @author raghu natha reddy S
 */
package com.java.inheritances;

class InterestBearingAccount extends Account {
	// Default interest rate of 7.95 percent (const)
	private static double default_interest = 7.95;

	// Current interest rate
	private double interest_rate;

	// Overloaded constructor accepting balance and an interest rate
	public InterestBearingAccount(double amount, double interest) {
		balance = amount;
		interest_rate = interest;
	}

	// Overloaded constructor accepting balance with a default interest rate
	public InterestBearingAccount(double amount) {
		balance = amount;
		interest_rate = default_interest;
	}

	// Overloaded constructor with empty balance and a default interest rate
	public InterestBearingAccount() {
		balance = 0.0;
		interest_rate = default_interest;
	}

	public void add_monthly_interest() {
		// Add interest to our account
		balance = balance + (balance * interest_rate / 100) / 12;
	}

}