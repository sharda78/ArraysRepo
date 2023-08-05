package com.arrayOfObjects;

import java.util.Arrays;

public class Stud1 {

	private int rollno;
	private String name;
	private double marks[];
	
	Stud1()
	{
		
	}
	Stud1(int rollno, String name, double marks[])
	{
		//marks = new double[3]  //initilize qgain and again
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Roll no:" + rollno);
		System.out.println("Name: " + name);
		System.out.println("Marks " + Arrays.toString(marks));
		
		/*for(int i = 0; i<marks.length;i++)
		 * {
		 * sysout(marks[i]);
		 * }
		 * */
		 
	}
	

}
