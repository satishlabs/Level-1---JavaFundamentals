package com.spd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author Satish Prasad
 *
 */
public class SerializationExample {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Open a file to write bytes
		
		FileOutputStream fout = new FileOutputStream("E:\\File\\Input.txt");
		
		/*
		 * Use ObjectOutputStream to serialize an object to file system
		 */
		ObjectOutputStream out = new ObjectOutputStream(fout);
		/*
		 * create an instance of String and java.util.Date
		 * Both String and Date class implements Serializable interface
		 * */
		
		String strData = new String("SatishLabs");
		Date today = new Date();
		
		out.writeObject(strData); //write String to a file system
		out.writeObject(today); //write date to a file system
		
		//Open files for reading bytes
		FileInputStream fin = new FileInputStream("E:\\File\\Output.txt");
		
		/*Use FileInputStream to deserialize an object coming from file system
		 * */
		
		ObjectInputStream in = new ObjectInputStream(fin);
		
		//read String
		String str= (String)in.readObject();
		System.out.println(str);
		
		
		//read Date
		Date date = (Date)in.readObject();
		System.out.println(date);
	}
}
