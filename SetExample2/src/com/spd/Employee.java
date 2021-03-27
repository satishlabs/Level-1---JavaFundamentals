package com.spd;

/**
 * @author Satish Prasad
 *
 */
public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String firstName;
	private double salary;
	
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee employee) {
		
		return this.getEmployeeId() - employee.getEmployeeId();
	}

	@Override
	public int hashCode() {
		final int prime=31;
		int result = 1;
		result = prime*result+employeeId;
		
		result = prime*result+((firstName == null) ? 0: firstName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Employee emp = (Employee)obj;
		if(employeeId != emp.employeeId)
			return false;
		if(firstName == null) {
			if(emp.firstName != null) {
				return false;
			}
		}else if(!firstName.equals(emp.firstName))
			return false;
		return true;
	}
}
