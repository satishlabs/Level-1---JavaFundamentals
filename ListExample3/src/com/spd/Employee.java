package com.spd;

import java.util.Comparator;

/**
 * Entity class to illustrate difference between Comparable and Comparator
 * interface.
 * @author Satish Prasad
 *
 */
public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String firstName;
	private double salary;
	
	/**
	 * 
	 */
	public Employee() {}
	
	/**
	 * @param employeeId
	 * @param firstName
	 * @param salary
	 */
	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}
	


	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//Natural comparison on Employee is based on their employeeId's
	@Override
	public int compareTo(Employee employee) {
		
		return this.getEmployeeId() - employee.getEmployeeId();
	}

	//static inner class to sort employee by name
	public static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			int difference = e1.getFirstName().compareTo(e2.getFirstName());
			if(difference == 0) {
				difference = Double.compare(e1.getSalary(), e2.getSalary());
			}
			return difference;
		}
		
	}
	
	//Anonymous class implementing Comparator interface
	public static final Comparator<Employee> COMPARE_BY_SALARY = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			int difference = Double.compare(e1.getSalary(), e2.getSalary());
			if(difference == 0) {
				difference = e1.getFirstName().compareTo(e2.getFirstName());
			}
			return difference;
		}
		
	};
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	@Override
	public String toString() {	
		return employeeId+" "+firstName+" "+salary;
	}
}
