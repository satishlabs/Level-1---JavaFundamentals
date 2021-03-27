package com.spd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Satish Prasad
 *
 */
public class MapExample {
	public static void main(String[] args) {
		
		//Create an HashMap and refer it using Map interface Key for Map will be Id and value will be complete Employee Object
		
		Map<String, Employee> employeeMap = new HashMap<String, Employee>();
		/*
		 * put() of Map takes key, value as arguments
		 */
		
		employeeMap.put("M100033", new Employee(101, "Satish", 120000.20));
		employeeMap.put("M100022", new Employee(245, "Dhoni", 190000.02));
		employeeMap.put("M104522", new Employee(120, "Virat", 150000.23));
		employeeMap.put("M100062", new Employee(320, "Rohit", 80000.30));
		
		//using the same key to replace the old value with new value
		employeeMap.put("M100022", new Employee(500, "Sehwag", 100000.50));
		
		/*
		 * use Object get(Object key)  to get the value for 
		 * a key
		 */
		
		Employee emp = employeeMap.get("M100022");
		System.out.println(emp);
		
		/*
		 * Iterate over key set of the Map
		 */
		Iterator<String> itr = employeeMap.keySet().iterator();
		while(itr.hasNext()) {
			String employeeId = itr.next();
			System.out.println(employeeId);
			
			//need to delete Employee --> M104522
			if(employeeId.equals("M104522")) {
				itr.remove();// this removes the entire entry
			}
		}
		
		/*
		 * Map methods keySet(), values() and entrySet()
		 * produces Collection.
		 * Traverse through EntrySet of Map.
		 * Each Entry has a key and value.
		 */
		Set<Map.Entry<String, Employee>> entrySet = employeeMap.entrySet();
		for(Entry<String, Employee> entry: entrySet) {
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
	}
}
