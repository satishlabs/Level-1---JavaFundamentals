package com.spd.dao.jdbc;

import com.spd.dao.EmployeeDao;
import com.spd.entity.Employee;

/**
 * @author Satish Prasad
 *
 */
public class EmployeeDaoJdbcImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee employee) {
		//code here will be to inserted the data into RDBMS
		System.out.println("Employee : "+employee+" persisted into database");
	}

}
