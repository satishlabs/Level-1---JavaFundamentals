package com.spd.entity;

/**
 * @author satish
 *
 */
public class BankAccount {
	//instance variable to store balance
	private double balance;
	
	/**
	 * 
	 */
	public BankAccount() {
		 balance = 0.0;
	}

	/**
	 * @param balance
	 */
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}
	
	
}
