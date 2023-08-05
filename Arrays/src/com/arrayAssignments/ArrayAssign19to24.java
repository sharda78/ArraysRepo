package com.arrayAssignments;

import java.util.Arrays;

/*
 19.WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
20.	. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 

21.	. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your output must be 78, 37, 29, 45, 90, 3 

22.	. WAP to reverse the array itself, don’t print array in reverse – I want current array reverse. Means 
		e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 37, 29, 45, 90, 3] by using temporary array. 
		
23.	.// WAP to reverse the array itself, don’t print array in reverse – I want current array reverse. Means 
	e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 37, 29, 45, 90, 3] without using temporary array.
	 
24.	 Write a Java program to find the duplicate values of an array of integer values. Means 
	e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 

 */
public class ArrayAssign19to24
{
		public static void findmax(int []max)
		{
			Arrays.sort(max);
			System.out.println("Minimum Number in Array: " + max[0]);
			
		}
		public static void findmin(int []min)
		{
			Arrays.sort(min);
			System.out.println("\nMaximum Number in Array: " + min[min.length-1]);
		}
		//by using temp array
		public static void findrev(int rev[])
		{
			System.out.println("\nReverse Number in Array By using temporary variable: ");
			System.out.print("[");
			for(int i = rev.length-1;  i >= 0; i--)
			{
				System.out.print(rev[i]);
				System.out.print(" ");
			}
			System.out.print("]");
		}
		public static void duplicateval(int val[])
		{
			System.out.println("\nDuplicate Values: ");
			for(int i = 0; i < val.length; i++)
			{
				for(int j = i+1; j < val.length; j++)
				{
					if(val[i] == val[j])
					{
						System.out.println(val[i]);
					}
				}
			}
		}
	public static void main(String[] args) 
	{
		int []maxnum = { 20, 0, 31, 45, 100, 1, 105, 90};
		int []minnum = {-20, 0, -25, 15, 19, 37, 23} ;
		int revnum[] = {3, 90, 45, 29, 37, 78};
		int dupval[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61};
		
		System.out.println("To print the array in reverse order without temp vari");
		for(int i = 0; i < revnum.length; i++)
		{
			for(int j = i+1; j < revnum.length; j++)
			{
				if(revnum[i] == revnum[j]) 
				{
					System.out.println(revnum[i]);
				}
			}
		}
		
		
		findmax(maxnum);
		findmin(minnum);
		findrev(revnum);
		duplicateval(dupval);
		
	}
}
