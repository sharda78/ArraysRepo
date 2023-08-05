package com.arrayAssignments;
/*
 36.WAP to print the employees from Employee[] array who has same salary 
 (Create Employee class which has 3 attributes 
 id, name, salary and add employee objects to your array) 
 */
import java.util.Scanner;

class Emp
{
	public int id;
	int sal;
	String name;
	
//	public void getvalue()
//	{
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter Employee ID:");
//		id = sc.nextInt();
//		System.out.println("Enter Employee name:");
//		name = sc.next();
//	}
	public  void sameSalary(int []empsal)
	{
		int cnt = 1 ;
		for(int i = 0; i < empsal.length; i++)
		{
			for(int j = i+1; j < empsal.length; j++)
			{
				if(empsal[i] == empsal[j])
				{
					cnt++;
										//here we have 2 emp sal soo if(true) then 2 emp having same sal
				}
			}
		}
		System.out.println("\n" + cnt + " Employee having same salary");
	}
}
public class Employee {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		Emp e = new Emp();
		//e.getvalue();
		
	
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int Employeesal[] = new int[size];
		
			System.out.println("Enter Employee ID:");
			 int id = sc.nextInt();
			System.out.println("Enter Employee name:");
			String name = sc.next();
			for(int i = 0; i < Employeesal.length; i++)
			{
		System.out.println("Enter Employee Salary:");
		Employeesal[i] = sc.nextInt();
		}
		

		
		e.sameSalary(Employeesal);

	}

}
