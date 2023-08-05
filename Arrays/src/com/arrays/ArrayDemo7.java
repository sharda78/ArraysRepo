package com.arrays;

import java.util.Scanner;

// WAP to find sum of element present in array
public class ArrayDemo7 
{

	public static void main(String[] args)
	{
	int num[] = new int[10]; // (line 11 to 16)Time-Complexity is O(1)..bcoz it excute once.
	int i,len = num.length,n,sum = 0;
	
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter no of elements");
	 n  = sc.nextInt();
	 
	 //step1 - insert element in array
	 // Time-Complexity for this is O(n) because this for loop excute n times
	 for(i=0; i < n; i++)
	 {
		 System.out.println("Enter elements:");
		 num[i] = sc.nextInt();
	 }
	 
	 
	 //step 2 - find sum
	 for(i=0; i<n; i++)
	 {
		 sum = sum + num[i];
	 }
	 System.out.println("Sum: " + sum);
	}

}
