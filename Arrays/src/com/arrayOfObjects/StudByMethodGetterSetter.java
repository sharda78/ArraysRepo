package com.arrayOfObjects;

import java.util.Scanner;

public class StudByMethodGetterSetter {


		static Scanner sc = new Scanner(System.in);
		public static void addstudents(StudentB s)
		{
			System.out.println("Enter rollno:");
			s.setRollno(sc.nextInt());
			
			System.out.println("Enter Name: ");
			s.setName(sc.next());
			
			System.out.println("ENter Marks:");
			s.setMarks(sc.nextDouble());
		}
	
	public static void showStudent(StudentB sarr[])
	{
		for(StudentB s:sarr)
		{
			
			System.out.println(s);
		}
	}
	public static void main(String[] args)
	{
		StudentB str[] = new StudentB[3];
		int i,len = str.length;
		
		for(i = 0; i < len; i++)
		{
			str[i] = new StudentB();
			addstudents(str[i]);
		}
		showStudent(str);
	}

}
