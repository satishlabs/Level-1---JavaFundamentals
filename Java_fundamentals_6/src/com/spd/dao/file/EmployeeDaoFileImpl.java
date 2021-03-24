package com.spd.dao.file;

import com.spd.dao.EmployeeDao;
import com.spd.entity.Employee;

/**
 * @author Satish Prasad
 *
 */
public class EmployeeDaoFileImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee employee) {
		//code to persist employee into file
		System.out.println("Employee : "+employee+" persist into file system");
	}

}
