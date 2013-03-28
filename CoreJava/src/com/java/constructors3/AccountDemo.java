/*
 * Calling default and parameterized constructors
 */

/**
 * @author raghu natha reddy S
 */
package com.java.constructors3;

class AccountDemo {
	public static void main(String args[]) {
		// Create an empty account
		Account my_Account = new Account();

		// Deposit money
		my_Account.deposit(250.00);

		// Print current balance
		System.out.println("Current balance " + my_Account.getbalance());

		// Withdraw money
		my_Account.withdraw(80.00);

		// Print remaining balance
		System.out.println("Remaining balance " + my_Account.getbalance());

		// Create an account with initial deposit amount
		Account my_New_Account = new Account(50);

		// Print current balance
		System.out.println("Current balance " + my_New_Account.getbalance());
	}
}