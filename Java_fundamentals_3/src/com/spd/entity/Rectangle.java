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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breadth;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (breadth != other.breadth)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
}
