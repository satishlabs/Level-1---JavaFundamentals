package com.spd.entity;

/**
 * @author satish
 *
 */
public class BankAccount {
	// instance variable to store balance
	private double balance;
	
	
	
	/**
	 * @param amount
	 */
	public void deposit(double amount) {
		balance += amount;
	}
	
	/**
	 * @param amount
	 */
	public void withdrow(double amount) {
		balance -= amount;
	}
	
	/**
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
}
