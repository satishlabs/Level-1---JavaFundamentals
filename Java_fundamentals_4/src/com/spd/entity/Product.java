package com.spd.entity;

/**
 * @author Satish Prasad
 *
 */
public class Product {
	private int productId;
	private String name;
	private double price;
	
	/**
	 * 
	 */
	public Product() {}
	
	/**
	 * @param productId
	 * @param name
	 * @param price
	 */
	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isExpensive() {
		return false;
	}
	
}
