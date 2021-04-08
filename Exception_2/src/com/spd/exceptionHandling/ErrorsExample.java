package com.spd.exceptionHandling;

/**
 * Example to illustrate that errors can be caught but cannot be handled
 * @author Satish Prasad
 *
 */
public class ErrorsExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			loadLibrary();
		}catch (Error e) {
			System.out.println(e);
		}
		/*
		 * Commnet loadLibrary() and remove comments on recursive 
		 * */
		try {
			recursive(); //java.lang.stackOverflowError
		}catch (Error e) {
			//System.out.println("Do Some task");
			System.out.println(e);
		}
	}

	private static void recursive() {
		System.out.println("Do some task");
		recursive();
		
	}

	private static void loadLibrary() {
		/*
		 * This statement throws java.langUnstatisfiedLinkError if GDI32.dll is not found in java.library.path
		 * 
		 * There is no way that we can be handled in the application, So the 
		 * application has to terminate . You need to put GDI32.dll in path and
		 * return the application
		 * 
		 * */
		System.loadLibrary("GDI32.dll");
	}
}
