package com.arrayOfObjectAssignments;


public class Ass3Emp {

	int id;
	String name;
	float sal;
	MyDate date;
	
	
	public Ass3Emp(int id, String name, float sal, MyDate date) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	
		this.date = date;
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
	public void setSal(float sal) {
		this.sal = sal;
	}
	public MyDate getDate()
	{
		return date;
	}
	public void setDate(MyDate date)
	{
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Employee :[id=" + id + ", name=" + name + ", sal=" + sal + "date=" + date +  "]";
	}
	

}
