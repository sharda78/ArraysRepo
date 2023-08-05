package com.arrayAssignments;
/*
 WAP to check if an array of integers contains two specified elements 65 and 77. 
 */
import java.util.Scanner;

public class ToCheckArrContain65And77 
{
	public static void toCheck(int newArr[])
	{
		int i,len = newArr.length;
		for(i = 0; i < len; i++)
		{
			if(newArr[i] == 65 || newArr[i] == 77)
			{
				System.out.println( newArr[i] + " is Present In Given Array");
			}
			
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		int num[] = new int[10];
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		n  = sc.nextInt();
		
		//Step 1 - insert element in array
		for(i = 0; i < n; i++)
		{
			System.out.println("Enter elements");
			num[i] = sc.nextInt();
		}
		toCheck(num);
	}
}
