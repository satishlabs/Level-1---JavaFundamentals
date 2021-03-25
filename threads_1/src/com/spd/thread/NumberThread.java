package com.spd.thread;

/**
 * @author Satish Prasad
 *
 */
public class NumberThread extends Thread{
	private int begin;
	private int end;
	
	public NumberThread() {}
	/**
	 * @param begin
	 * @param end
	 */
	public NumberThread(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	public void run() {
		for(int i=begin; i<=end; i++) {
			try {
				//Random sleep between 0 to 2 seconds
				Thread.sleep((long)(Math.random()*2000));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" --> : "+i);
		}
	}
	
}
