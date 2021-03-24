package com.spd.dao;

import com.spd.dao.file.EmployeeDaoFileImpl;
import com.spd.dao.jdbc.EmployeeDaoJdbcImpl;

/**
 * @author Satish Prasad
 *
 */
public class DaoFactory {
	public static EmployeeDao getEmployeeDao(int option) {
		switch (option) {
		case 1:
				return new EmployeeDaoJdbcImpl();
		case 2:
				return new EmployeeDaoFileImpl();
		default:
			//show throw Exception
			return null;
		}
	}
}
