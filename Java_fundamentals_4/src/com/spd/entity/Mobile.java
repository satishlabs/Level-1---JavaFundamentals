/**
 * 
 */
package com.spd.entity;

/**
 * @author Satish Prasad
 *
 */
public class Mobile extends Product{
	private String cameraInfo;
	
	
	/**
	 * 
	 */
	public Mobile() {}
	

	/**
	 * @param productId
	 * @param name
	 * @param price
	 * @param cameraInfo
	 */
	public Mobile(int productId,String name,double price,String cameraInfo) {
		super(productId,name,price);
		this.cameraInfo = cameraInfo;
	}


	/**
	 * @return the cameraInfo
	 */
	public String getCameraInfo() {
		return cameraInfo;
	}


	/**
	 * @param cameraInfo the cameraInfo to set
	 */
	public void setCameraInfo(String cameraInfo) {
		this.cameraInfo = cameraInfo;
	}
	
	@Override
	public boolean isExpensive() {
		//Mobile is expensive is price is >8000/-
		if(getPrice() > 8000.0) {
			return true;
		}
		return false;
	}
	
}
