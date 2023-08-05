package com.arrayAssignments;
/*
1.	WAP to add elements to single dimensional int array and print elements from 1D array

2.	WAP to accept dimension of 1D array and create and accept data in that array. Calculate the sum and average value of array elements.

 */

import java.util.Scanner;

public class ArrayAssignment
{

	
	public static void main(String[] args) {
		
		int arr[] = new int[10],sum = 0;
		int len = arr.length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n  = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter elements:- ");
			arr[i] = sc.nextInt();		
			
		}
		for(int i = 0; i  < n; i++)
		{
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
		for(int j = 0; j < n; j++)
		{
			sum = sum + arr[j];
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/n );
	}

}
