package com.spd.client;

import com.spd.entity.Book;
import com.spd.entity.Employee;
import com.spd.util.Utility;

/**
 * @author Satish Prasad
 *
 */
public class InterfaceExample {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create an array of Books
		Book[] books = new Book[3];
		books[0] = new Book("Hibernate", 900.20);
		books[1] = new Book("SpringBoot", 12000.30);
		books[2] = new Book("Angular", 750.50);
		
		//sort the books
		Utility.sort(books);
		
		//traverse through the elements
		for(Book b: books) {
			System.out.println(b); //toString() of Book will be invoked
		}
		/*
		 * Similarly create an array of Employee's and sort them using
		 * already defined Utility.sort()
		 * absorve that you do not need to modify any logic in sort().
		 * Hence we say sort() is OCP. 
		 */
		
		System.out.println();
		System.out.println("Sorted Employee details");
		//create an array of Employee
		Employee[] employees = new Employee[3];
		employees[0] = new Employee(101, "Satish");
		employees[1] = new Employee(103, "Dhoni");
		employees[2] = new Employee(102, "Virat");
		
		//sort the employee
		Utility.sort(employees);
		
		for(Employee emp: employees) {
			System.out.println(emp);
		}
	}
}
