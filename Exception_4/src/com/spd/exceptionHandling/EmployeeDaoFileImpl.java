package com.spd.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDaoFileImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee employee) throws PersistenceException {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\File\\");
		}catch (FileNotFoundException e) {
			throw new PersistenceException("Not able to persist Employee ",e);
		}
		
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return null;
	}

}
