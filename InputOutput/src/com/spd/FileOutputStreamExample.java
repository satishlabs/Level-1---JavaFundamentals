package com.spd;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Satish Prasad
 *
 */
public class FileOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		
		try {
			String strData = new String("SatishLabs.com");
			byte[] data = strData.getBytes();
			
			/*opens file Input.txt in drive E
			 * If file exits it overwrites the contents
			 * */
			
			/*Second argument of type boolean is for append mode
			 * true --> append
			 * false --> overwrite
			 * */
			fout = new FileOutputStream("E:\\File\\Input.txt",true);
			
			fout.write(65); //write  character 'A' to file
			fout.write(data); //write "SatishLabs.com"to a file
			System.out.println("completed");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fout.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
