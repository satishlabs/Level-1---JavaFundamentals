package com.spd.util;

import com.spd.entity.IComparable;

/**
 * @author Satish Prasad
 *The algorithms in this class are open for extension but closed for modification/change
 *The algorithms in this class can be used to any objects ,provided the class of that object implements IComprable Interface
 */
public class Utility {

	/**
	 * @param books
	 * sort any array of objects
	 * provided the array is of class which implements Comparable
	 */
	public static void sort(IComparable[] elements) {
		for(int i=0; i<elements.length; i++) {
			for(int j= i+1; j<elements.length; j++) {
				//Dynamic Binding , the compare() method invoked depends on the class which as passed ar arguments to this method
				if(elements[i].compare(elements[j]) > 0) {
					IComparable swapElement = elements[i];
					elements[i] = elements[j];
					elements[j] = swapElement;
				}
			}
		}
		
	}
	
}
