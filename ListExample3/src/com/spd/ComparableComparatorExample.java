package com.spd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example illustrating how to use Comparable 
 * for sorting Employee entities
 * @author Satish Prasad
 *
 */
public class ComparableComparatorExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		addEmployee(employeeList);
		//Collections.sort(employeeList); //Natural Comparision
		//Collections.sort(employeeList, new Employee.NameComparator());
		Collections.sort(employeeList, Employee.COMPARE_BY_SALARY);
		printEmployee(employeeList);
	}

	/**Method to traverse through the employee Collection
	 * @param employeeList
	 */
	private static void printEmployee(List<Employee> employeeList) {
		for(Employee emp: employeeList) {
			System.out.println(emp);
		}
		
	}

	/**
	 * Method to add employee's to collection
	 * @param employeeList
	 */
	private static void addEmployee(List<Employee> employeeList) {
		employeeList.add(new Employee(100, "Satish", 50000.00));
		employeeList.add(new Employee(300, "Dhoni", 120000.40));
		employeeList.add(new Employee(400, "Virat", 150000.02));
		employeeList.add(new Employee(200, "Rohit", 80000.34));
		
	}
}
