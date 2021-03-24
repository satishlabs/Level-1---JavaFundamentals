package com.spd.entity;

/**
 * @author Satish Prasad
 *
 */
public class Television extends Product{
	private String screenType;
	private String screenSize;  //in inches
	/**
	 * 
	 */
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param productId
	 * @param name
	 * @param price
	 * @param screenType
	 * @param screenSize
	 */
	public Television(int productId, String name, double price,String screenType,String screenSize) {
		super(productId, name, price);
		this.screenType = screenType;
		this.screenSize = screenSize;
		
	}

	/**
	 * @return the screenType
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType the screenType to set
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	/**
	 * @return the screenSize
	 */
	public String getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	
	/**
	 *
	 */
	@Override
	public boolean isExpensive() {
		//Television is expensive if cost is more than 20,000/-
		if(getPrice() > 20000.0) {
			return true;
		}
		return false;
	}
	
}
