package com.spd.client;

import com.spd.entity.BankAccount;

/**
 * @author satish
 * Illustrates how to create objects and modify/access the state of objects
 *
 */
public class BankAccountExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a bank account for Satish
		BankAccount satishAccount = new BankAccount(16500.30);
		
		
		//create a bank account for Ram
		BankAccount ramAccount = new BankAccount(16500.30);
		
		//Both account contain same amount but they are two different accounts
		if(satishAccount == ramAccount) {//return false
			System.out.println("Satish Account and Ram Account  are same");
		}else {
			System.out.println("Satish Account and Ram Account are different");
		}
		
		//Check the balance in both account
		if(ramAccount.equals(satishAccount)) {
			System.out.println("Ram Account and Satish Account have same balance");
		}else {
			System.out.println("Ram Account and Satish Account contains different balance");
		}
		
		
		//Kumar also operate on Ram's account
		BankAccount kumarAccount = ramAccount;
		
		//Ram and Kumar are opening on same account
		//Two references to single account object
		
		if(kumarAccount == ramAccount) {
			System.out.println("Kumar account and Ram account are same");
		}else {
			System.out.println("Kumar account and Ram account are different");
		}
		
		//Ram deposit 5000.20 into his account
		ramAccount.deposit(5000.20);
		
		//Kumar deposit 5000.00 into his account
		kumarAccount.deposit(5000.00);
		
		//Check if both are depositing in single account
		System.out.println("Ram's account balance is: "+ramAccount.getBalance());
		System.out.println("Kumar's account balance is: "+kumarAccount.getBalance());
	}
}
