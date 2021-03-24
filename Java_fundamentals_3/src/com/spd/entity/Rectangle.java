package com.spd.entity;


/**
 * @author Satish Prasad
 *
 */
public class Rectangle {
	private int width;
	private int breadth;
	
	/**
	 * 
	 */
	public Rectangle() {}
	
	/**
	 * @param width
	 * @param breadth
	 */
	public Rectangle(int width, int breadth) {
		super();
		this.width = width;
		this.breadth = breadth;
	}

	/**
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return
	 */
	public int getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	/**
	 * @return
	 */
	public int getArea() {
		return width*breadth;
	}
	
}
