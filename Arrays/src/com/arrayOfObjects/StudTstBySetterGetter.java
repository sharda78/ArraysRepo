package com.arrayOfObjects;

import java.util.Scanner;

public class StudTstBySetterGetter {

	public static void main(String[] args) {
		StudentB str[]= new StudentB[3];
		
		int i,len=str.length;
		System.out.println("Enter data for student");
		Scanner sc = new Scanner(System.in);
		for(i = 0;i<len;i++)
		{
			
			str[i] = new StudentB();
			
			System.out.println("Enter roll no");
			str[i] . setRollno(sc.nextInt());
			
			System.out.println("Enter name no");
			str[i] . setName(sc.next());
			
			System.out.println("Enter marks no");
			str[i] .setMarks(sc.nextDouble());
			
		}
		System.out.println("----------Display-----------");

		
		for(StudentB s: str)
		{
			System.out.println(s);
		}
	}

	

}
