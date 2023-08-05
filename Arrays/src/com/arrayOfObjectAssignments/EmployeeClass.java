package com.arrayOfObjectAssignments;

import java.util.Scanner;

public class EmployeeClass 
{
	private int id;
	String name;
	double sal;
	 Departments dept;
	
	
	public EmployeeClass(int id, String name, double sal,Departments dept) {

		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Empl : [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	

}
