package com.spd;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Satish Prasad
 *
 */
public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Patient> patientQueue = new PriorityQueue<Patient>();
		
		patientQueue.add(new Patient("Satish", 34, Severity.HIGH));
		patientQueue.add(new Patient("Virat", 31, Severity.HIGH));
		patientQueue.add(new Patient("Dhoni", 38, Severity.MED));
		patientQueue.add(new Patient("Rohit", 20, Severity.LOW));
		patientQueue.add(new Patient("Bumrah", 19, Severity.HIGH));
		patientQueue.add(new Patient("Sammi", 41, Severity.MED));
		patientQueue.add(new Patient("KLRhul", 23, Severity.LOW));
		
		for(Patient patient : patientQueue) {
			System.out.println(patient);
		}
	}
}
