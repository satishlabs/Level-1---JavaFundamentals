package com.spd.thread;

/**
 * @author Satish Prasad
 *
 */
public class DepositThread extends Thread{
	private Account account;
	private String name;
	private int amount;
	/**
	 * @param account
	 * @param name
	 * @param amount
	 */
	public DepositThread(Account account, String name, int amount) {
		super();
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	public void run() {
		account.deposit(name, amount);
	}
	
}
