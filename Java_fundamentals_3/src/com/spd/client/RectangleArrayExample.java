package com.spd.client;

import com.spd.entity.Rectangle;

/**
 * @author Satish Prasad
 *
 */
public class RectangleArrayExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create an array : 3 references to Rectangle
		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = new Rectangle(3,4);
		rectangles[1] = new Rectangle(2,8);
		rectangles[2] = new Rectangle(6,2);
		
		int totalArea = 0; // total area occupied by rectangles
		
		for(int i=0; i< rectangles.length; i++) {
			totalArea += rectangles[i].getArea();
		}
		
		System.out.println("Total Area occupied by Rectangles : "+totalArea);
		
		//Enhanced for loop
		for(Rectangle rectangle : rectangles) {
			System.out.println("Breadth  : "+rectangle.getBreadth());
			System.out.println("Width  : "+rectangle.getWidth());
		}
	}
}
