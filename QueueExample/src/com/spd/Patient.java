package com.spd;

/**
 * @author Satish Prasad
 *
 */
public class Patient implements Comparable<Patient>{
	private String firstName;
	private int age;
	private Severity serverity;
	
	
	 public Patient() {
		 firstName = new String();
		 age = -999;
		 serverity = Severity.LOW;
	}
	
	 
	 
	/**
	 * @param firstName
	 * @param age
	 * @param serverity
	 */
	public Patient(String firstName, int age, Severity serverity) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.serverity = serverity;
	}

	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the serverity
	 */
	public Severity getServerity() {
		return serverity;
	}



	/**
	 * @param serverity the serverity to set
	 */
	public void setServerity(Severity serverity) {
		this.serverity = serverity;
	}

	@Override
	public String toString() {
		return firstName+" , "+age+" , "+serverity;
	}

	@Override
	public int compareTo(Patient patient) {
		int difference = patient.serverity.ordinal()- this.serverity.ordinal();
		if(difference == 0) {
			difference = patient.age - this.age;
		}
		return difference;
	}

}
