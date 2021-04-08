package com.spd.exceptionHandling;

public interface EmployeeDao {
	public void addEmployee(Employee employee) throws PersistenceException;
	public Employee getEmployee(int employeeId);
}
