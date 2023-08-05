package com.arrayOfObjectAssignments;

import java.util.Scanner;

public class Ass3Emp_MyDate 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		MyDate d1 = new MyDate(2,2010,"June");
//		MyDate d2 = new MyDate(25,2010,"Feb");
//		MyDate d3 = new MyDate(30,2021,"Nov");
//		MyDate d4 = new MyDate(9,2008,"Feb");
//		MyDate d5 = new MyDate(17,2015,"Dec");
//		
		
		Ass3Emp e[] = new Ass3Emp[5];
		
		e[0] = new Ass3Emp(101,"John",8000.0f,new MyDate(2,2010,"aug"));
		e[1] = new Ass3Emp(102,"Ram",6000f,new MyDate(25,2011,"Feb"));
		e[2] = new Ass3Emp(102,"Leena",4000f,new MyDate(14,2023,"Jan"));
		e[3] = new Ass3Emp(102,"Raj",7000f,new MyDate(2,2010,"aug"));
		e[4] = new Ass3Emp(102,"Doe",2000f,new MyDate(14,2023,"Jan"));
		
		
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Id: " + e[i].getId());
			System.out.println("Name: " + e[i].getName());
			System.out.println("Salary: " + e[i].getSal());
			
			System.out.println("Year: " + e[i].date.getYear());
			System.out.println("\n-----------------------------------");
		}
		
		System.out.println("\n-----Employees who joined after 2010-------");
		for(int j = 0; j < e.length; j++)
		{
			if(e[j].date.getYear() > 2010)
			{
				System.out.println(e[j]);
			}
		}
		
		System.out.println("\n-----Employees who has same joining date-------");
		for(int j = 0; j < e.length; j++)
		{
			for(int k = j+1; k < e.length; k++)
			{
			if(e[j].getDate().getDay() == e[k].getDate().getDay() && e[j].getDate().getMonth() == e[k].getDate().getMonth() && e[j].getDate().getYear() == e[k].getDate().getYear())
			{
				System.out.println(e[k].toString() + "\n" + e[j].toString());
			}
			}
			
		}
	}

}
