package com.arrayOfObjectAssignments;

import java.util.Scanner;

public class Dept_EmplTest
{

	public static void main(String[] args) {
		
		
		Departments d1 = new Departments(101,"IT");
		Departments d2 = new Departments(102,"Civil");
		Departments d3 = new Departments(103,"Mech");
		Departments d4 = new Departments(104,"Sales");
		Departments d5 = new Departments(105,"IT");
		
		EmployeeClass e[] = new EmployeeClass[5];
		e[0] = new EmployeeClass(101,"John",45000f,d1);
		e[1] = new EmployeeClass(201,"Ram",50000f,d3);
		e[2] = new EmployeeClass(301,"Raj",4900f,d4);
		e[3] = new EmployeeClass(401,"Leena",13000f,d5);
		e[4] = new EmployeeClass(501,"Pooja",89000f,d4);
		
		System.out.println(e[2].getName());
		System.out.println(e[2].dept.getDname());
		
		for(int j = 0 ; j < e.length; j++)
		{
			System.out.println(e[j]);
		}
		
		
		/*Scanner sc = new Scanner(System.in);
		for(int i =0; i < e.length; i++)
		{
			System.out.println("Enter emp id");
			e[i].setId(sc.nextInt());
			System.out.println("Enter emp name");
			e[i].setName(sc.next());
			System.out.println("Enter emp sal");
			e[i].setSal(sc.nextDouble());

		}*/
		
		
		System.out.println("\n------Employees are works in sales department---------");
		for(int i = 0; i < e.length; i++)
		{
			if(e[i].dept.getDname() == "Sales")
			{
				System.out.println(e[i]);
			}
		}
		
		System.out.println("\n---------Employyes Who works in Same Departments-----------");
		
		/*
		 for(int i = 0; i < e.length; i++)
		{
			for(int j = 0; j < e.length; j++)
			{
				if(e[i].dept.getDname() == e[j].dept.getDname())
				{
					System.out.println(e[j]);
				}
		
			}
		}
		 */
		for(int i = 0; i < e.length; i++)
		{
			if(e[i].dept.getDname().equals(d1.getDname()))
			{
				System.out.println(e[i]);
			}
		}
			}

	
}
