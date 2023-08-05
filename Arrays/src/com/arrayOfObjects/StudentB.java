package com.arrayOfObjects;

public class StudentB
{
	private int rollno;
	private String name;
	private double marks; 
	StudentB()
	{
		
	}
	StudentB(int rollno,String name,double marks)
	{
		this.marks = marks;
		this.name  = name;
		this.rollno = rollno;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	/*public void display()
	{
		System.out.println("Roll no :" +rollno);
		System.out.println("name no :" +name);
		System.out.println("marks no :" +marks);
	}*/
	@Override
	public String toString() {
		return "StudentB : [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public static void main(String[] args)
	{
		
		// call in TestStu
	}
	

}
