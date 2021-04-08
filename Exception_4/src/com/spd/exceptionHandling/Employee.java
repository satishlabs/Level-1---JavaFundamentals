package com.spd.exceptionHandling;

public class Employee {
	private int empid;
	private String ename;
	/**
	 * @param empid
	 * @param ename
	 */
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}
	
	
}
