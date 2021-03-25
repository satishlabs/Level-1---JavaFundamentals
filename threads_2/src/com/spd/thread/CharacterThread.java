package com.spd.thread;

/**
 * @author Satish Prasad
 *
 */
public class CharacterThread implements Runnable{

	@Override
	public void run() {
		for(char ch='A'; ch <= 'Z'; ch++) {
			System.out.println(Thread.currentThread()+" : "+ch);
		}
		
	}

}	
