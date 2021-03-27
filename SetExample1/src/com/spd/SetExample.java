package com.spd;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Satish Prasad
 *
 */
public class SetExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create an HashSet and assign it to a Set interface.
		 * HashSet uses hashCode() and equals(). If an object
		 * which is added into HashSet contains the same hashCode as 
		 * one which is already existing in the Set, then it calls equals()
		 * to determine its equality. 
		 * 
		 * HashSet does not depend on Comparable / Comparator
		 * 
		 */
		Set<Employee> employeeSet = new HashSet<Employee>();
		addEmployee(employeeSet);
		printEmployeeSet(employeeSet);
	}

	/**
	 * @param employeeSet
	 */
	private static void printEmployeeSet(Set<Employee> employeeSet) {
		/*
		 * employeeSet.get(int index) is not valid on Set.
		 */
		for(Employee emp: employeeSet) {
			System.out.println(emp);
		}
	}

	/**
	 * Method to add Employee's to set
	 * @param employeeSet
	 */
	private static void addEmployee(Set<Employee> employeeSet) {
		employeeSet.add(new Employee(100, "Satish", 50000.00));
		employeeSet.add(new Employee(300, "Dhoni", 120000.40));
		employeeSet.add(new Employee(400, "Virat", 150000.02));
		employeeSet.add(new Employee(200, "Rohit", 80000.34));
		
	}
}
