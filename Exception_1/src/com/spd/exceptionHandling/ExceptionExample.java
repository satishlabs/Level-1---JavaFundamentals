package com.spd.exceptionHandling;

import java.util.Scanner;

/**
 * @author Satish Prasad
 *
 */
public class ExceptionExample {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter I number : ");
			int firstNum = scanner.nextInt();
			
			System.out.println("Enter II number : ");
			int secondNum = scanner.nextInt();
			
			int result = firstNum/secondNum;
			
			System.out.println("Result : "+result);
		}catch (Exception e) {
			System.out.println("Problem solved: "+e);
		}
	}
}
