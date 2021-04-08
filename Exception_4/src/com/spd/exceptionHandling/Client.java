package com.spd.exceptionHandling;

public class Client {
	public static void main(String[] args) {
		Employee emp = new Employee(1,"Satish");
		EmployeeDao empDao = new  EmployeeDaoFileImpl();
		
		try {
			empDao.addEmployee(emp);
		}catch (PersistenceException e) {
			System.out.println(e.getMessage());
		}
	}
}
