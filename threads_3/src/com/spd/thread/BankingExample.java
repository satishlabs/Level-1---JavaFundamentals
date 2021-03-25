package com.spd.thread;

public class BankingExample {
	public static void main(String[] args) {
		Account account = new Account(5000);
		
		DepositThread t1 = new DepositThread(account, "A", 2500);
		
		DepositThread t2 = new DepositThread(account, "\tB", 3000);
		
		WithdrawThread t3 = new WithdrawThread(account, "\t\tC", 2000);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("All Threads started...");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance : "+account.getBalance());
	}
}
