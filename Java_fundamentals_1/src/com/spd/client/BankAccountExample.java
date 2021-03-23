package com.spd.client;

import com.spd.entity.BankAccount;

/**
 * @author satish
 * * Illustrates how to create objects 
 * and modify / access the state of an object 
 *
 */
public class BankAccountExample {
	public static void main(String[] args) {
		//create bank account for Satish
		BankAccount satishAccount = new BankAccount();
		
		//deposit 6700.34 into Satish's Account
		satishAccount.deposit(6700.34);
		
		//create bank account for Rama
		BankAccount ramAccount = new BankAccount();
		
		//deposit 5500.99 into Satish's Account
		ramAccount.deposit(5500.99);
		
		//Withdrow 2000.40 from satish account
		satishAccount.withdrow(2000.40);
		
		//check the balance of both the accounts
		
		System.out.println("Satish's Account balance is: "+satishAccount.getBalance());
		System.out.println("Rama's Account balance is: "+ramAccount.getBalance());
	}
}
