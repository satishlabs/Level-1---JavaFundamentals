package com.spd.thread;

/**
 * @author Satish Prasad
 *
 */
public class Account {
	private int balance;
	
	public Account() {}
	/**
	 * @param balance
	 */
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		try {
			Thread.sleep((long)(Math.random())*500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		try {
			Thread.sleep((long)(Math.random())*500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	/**
	 * @param name
	 * @param amount
	 */
	public void deposit(String name,int amount) {
		System.out.println(name+" trying to deposit : "+amount);
		System.out.println(name+" getting balance ");
		int bal = getBalance();
		bal +=amount;
		System.out.println(name+" setting balance to : "+bal);
		setBalance(bal);
		System.out.println(name+" completes deposit");
	}
	
	/**
	 * @param name
	 * @param amount
	 */
	public void withdraw(String name,int amount) {
		System.out.println(name+" trying to withraw : "+amount);
		System.out.println(name+" getting balance");
		int bal = getBalance();
		bal -=amount;
		System.out.println(name+" setting balance to : "+bal);
		setBalance(bal);
		System.out.println(name+" completes withdraw");
	}
}
