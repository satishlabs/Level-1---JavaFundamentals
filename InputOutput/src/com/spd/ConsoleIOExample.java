package com.spd;

import java.io.IOException;

/**
 * @author Satish Prasad
 *
 */
public class ConsoleIOExample {
	public static void main(String[] args) throws IOException {
		//OutputStream to output text to Console (Monitor)
		System.out.println("Enter a Character");
		
		/*
		 * read bytes from keyborad 
		 * get UNICODE value of character typed
		 */
		int b = System.in.read();
		System.out.println("You Entered : "+b);
	}
}
