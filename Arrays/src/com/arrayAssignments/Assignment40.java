package com.arrayAssignments;

import java.util.Scanner;

/*
 40.	Create class Dept(did, dname), class MyDate(day, month, year) 
 		Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
 		Create array of Employee and display the array elements.
 */
class Dept
{
	int did;
	String dname;
	
}
class MyDate 
{
	int day,month,year;
	
}
class Emp1
{
	int emp_id;
	String emp_name;
	double sal;
	Emp1(int emp_id,String emp_name,double sal)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.sal = sal;
	}
	
	public void show()
	{
		System.out.println("Emp id: " + emp_id);
		System.out.println("Emp name: " + emp_name);
		System.out.println("Emp sal: " + sal);
	}
	
	MyDate m = new MyDate();
	Dept d = new Dept();
	
}
public class Assignment40 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int Employee[] = new int[size];
		int len = Employee.length;
		for(int i = 0; i < len; i++ )
		{
			Employee[i]  = sc.nextInt();
		}
		
		

	}

}
