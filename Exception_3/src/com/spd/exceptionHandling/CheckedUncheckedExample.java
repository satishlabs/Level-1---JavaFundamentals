package com.spd.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Satish Prasad
 *
 */
public class CheckedUncheckedExample {
	public static void main(String[] args) {
		try {
			checked();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		unchecked();
	}

	private static void unchecked() {
		int[] data = {5,3,66};
		System.out.println(data[7]);
	}

	private static void checked() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("E:\\File\\Input.txt");
		
	}
}
