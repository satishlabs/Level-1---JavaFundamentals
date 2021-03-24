package com.spd.entity;

/**
 * @author Satish Prasad
 *
 */
public class Employee implements IComparable{
	private int employeeId;
	private String employeeName;
	
	public Employee() {}
	
	/**
	 * @param employeeId
	 * @param employeeName
	 */
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
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
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	@Override
	public int compare(Object obj) {
		//assumption : always employee is passed as arguments
		Employee employee = (Employee)obj;
		
		//compare employees based on their ids
		return this.getEmployeeId() - employee.getEmployeeId();
	}

}
