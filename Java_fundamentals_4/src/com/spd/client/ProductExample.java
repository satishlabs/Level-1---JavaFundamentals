package com.spd.client;

import com.spd.entity.Mobile;
import com.spd.entity.Product;
import com.spd.entity.Television;

/**
 * @author Satish Prasad
 * Illustrates upcasting, downcasting and polymorphism
 */
public class ProductExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product[] products = new Product[3];
		products[0] = new Television(100, "Sony Bravia Nx500", 62000.00, "LCD", "40inch"); //upcasting
		products[1] = new Mobile(101, "Samsung A50S", 23000, "16MP"); //upcasing
		products[2] = new Television(102, "Onida Thunder", 12000.00, "CRT", "22inch"); //upcasting
		
		for(int i=0; i<products.length; i++) {
			if(products[i].isExpensive()) { //polymorphism
				System.out.println(products[i].getName()+" is expensive");
			}else {
				System.out.println(products[i].getName()+" is not expensive");
			}
			
			//Now we need details to print
			System.out.println("Name: "+products[i].getName());
			System.out.println("Price: "+products[i].getPrice());
			
			
			/*	This statements are invalid
			 * 	Product cannot send message getCameraInfo, it is specific to Camera
			 * 	and not applicable to all Products
			*	System.out.println("Camera : " + product.getCameraInfo());
			*	
			*	Similary Screen Type is specific to Television
			*	System.out.println("Camera : " + product.getScreenType());
			*/
			
			if(products[i] instanceof Television) {
				Television tv = (Television) products[i];
				System.out.println("Screen Type: "+tv.getScreenType());
				System.out.println("Screen Size: "+tv.getScreenSize());
			}else if(products[i] instanceof Mobile) {
				Mobile mobile = (Mobile) products[i];
				System.out.println("Camera Details : "+mobile.getCameraInfo());
			}
			System.out.println();
		}
		
		
	}
}
