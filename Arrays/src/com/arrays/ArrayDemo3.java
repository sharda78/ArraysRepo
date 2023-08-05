package com.arrays;

import java.util.Scanner;

public class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		double marks[] = new double[10];
		int len = marks.length;
		
		int i ,n;
		 @SuppressWarnings("resource") // close sc by using annotation
		 
		Scanner sc = new Scanner(System.in);
		 System.out.println("how many marks you want to add in array: ");
		 n = sc.nextInt();
		 
		 for(i=0 ; i < n; i++)
		 {
			 System.out.println("Enter marks: ");
			 marks[i] = sc.nextDouble();
			 
		 }
		 System.out.println("-----Array(take from user)-----");
		 for(i = 0; i < n; i++)
		 {
			 System.out.println("marks[" + i + "]: " + marks[i]);
		 }
		 System.out.println("\n-----Array With Length-----");
		 for(i = 0; i < len; i++)
		 {
			 System.out.println("marks[" + i + "]: " + marks[i]);
		 }
		

	}

}
