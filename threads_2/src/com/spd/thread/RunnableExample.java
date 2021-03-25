package com.spd.thread;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new CharacterThread();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
	}
}
