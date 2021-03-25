package com.spd.thread;

/**
 * @author Satish Prasad
 *
 */
public class NumberThreadExample {
	public static void main(String[] args) {
		NumberThread t1 = new NumberThread(1, 50);
		NumberThread t2 = new NumberThread(51 , 125);
		
		System.out.println(Thread.currentThread()+" starts ");
		
		t1.start();
		t2.start();
		
		/*
		 * Even if main thread dies
		 * JVM does not terminate, because still two
		 * Non-Daemon threads are alive.
		 * Check by making one t2 as Daemon and 
		 * examine the output.
		 */
		System.out.println("Main Dies....");
	}
}
