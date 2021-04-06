package com.spd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Satish Prasad
 *
 * This example illustrates how to use
 * layered streams for reading and writing
 * primitive data types.
 */
public class DataStreamsExample {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			/*
			 * Open a file for writing using FileOutputStream
			 * Using this stream you can only write byte by byte
			 * */
			fout = new FileOutputStream("E:\\File\\Input.txt");
			
			/*
			 * You can not use any Filter Streams on thier own. Decorate DataOutputStream on FileOutputStream.
			 * You can write java primitive data types to a file, Similarly if you decorate DataOutputStream on SocketStream's
			 * You can write java primitive data types to a network socket
			 * */
			DataOutputStream dataOut = new DataOutputStream(fout);
			dataOut.write(22); //4 bytes
			dataOut.writeChar('S'); //2 bytes
			dataOut.writeDouble(1.2); // 8 bytes
			
			/*Open a file for reading  using FileInputStream
			 * Using this stream you can read only bytes
			 * */
			FileInputStream fin = new FileInputStream("E:\\File\\Input.txt");
			/*
			 * Decorate DataInputStream on FileInputStream, You can read primitive data types from a file
			 * Similarly if you decorate DataInputStream on SocketStream's, You can read java primitive data types from  a network Socket
			 * 	*/
			DataInputStream dataIn = new DataInputStream(fin);
			
			System.out.println(dataIn.readInt());//read 4 bytes
			System.out.println(dataIn.readChar()); //read 2 bytes
			System.out.println(dataIn.readDouble()); //read 8 bytes
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
