package com.spd;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Satish Prasad
 *
 */
public class FileInputStreamExample {
	public static void main(String[] args) {
		FileInputStream fin = null;
		int b = -1;
		try {
			fin = new FileInputStream("	E:\\File\\Input.txt		");
			/*read() returns the next byte of data, or -1 if the end of the file is reached
			 * */
			while((b = fin.read()) != -1) {
				System.out.println((char)b);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fin.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
