package com.spd.client;

import com.spd.dao.DaoFactory;
import com.spd.dao.EmployeeDao;
import com.spd.entity.Employee;

/**
 * @author Satish Prasad
 *
 */
public class FactoryExample {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Satish");
		/*
		 * The client code is not going to change will
		 * switching between different concrete strategies of EmployeeDao
		 * Latter on we will use Reflection API to
		 * eliminate passing option value. 
		 */
		EmployeeDao employeeDao = DaoFactory.getEmployeeDao(1); //1 -- RDBMS,2 -->File System
		employeeDao.addEmployee(employee);
	}
}
