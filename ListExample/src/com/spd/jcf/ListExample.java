package com.spd.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Satish Prasad
 *This example illustrates basic operations on List
 *	Understand different types of iterations on collections
 */
public class ListExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create an ArrayList and refer it using List interface
		List<String> strList = new ArrayList<String>();
		
		addElementsToList(strList);
		Collections.sort(strList);
		printElements(strList);
	}

	/**
	 * Method to traverse through the List elements and print them.
	 * @param strList
	 */
	private static void printElements(List<String> strList) {
		//Basic for loop
		for(int i=0; i<strList.size(); i++) {
			//strList.add(new String("Test"));
			System.out.println(strList.get(i));
		}
		
		/*
		 * Iterator's and Enhanced for Loop provides fail-fast behavior, rather non-deterministic behavior in the face of concurrent modifaction during iteration
		 * */
		System.out.println();
		System.out.println("==========Loop using iterator=========");
		//Loop using iterator
		Iterator<String> itr = strList.iterator();
		//strList.add(new String("Test"))
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("==========Enhanced for Loop=========");
		//Enhanced for Loop
		for(String str: strList) {
			System.out.println(str);
		}
	}
	
	
	/**
	 * Method to add elements into an java.util.List
	 * @param strList
	 */
	private static void addElementsToList(List<String> strList) {
		strList.add(new String("Spring Boot "));
		strList.add(new String("Angular7"));
		strList.add(new String("ReactJS"));
		strList.add(new String("Micorservices"));
		
	}
}
