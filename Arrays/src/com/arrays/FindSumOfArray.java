package com.arrays;

import java.util.Scanner;

public class FindSumOfArray 
{
	//passing array as arguments
	public static int findSumOfArray(int a[])  //int a[] = num
	{
		int sum = 0;
		int len = a.length;
		for(int i=0; i<len; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int []num = new int[10];
		int len = num.length,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		n  = sc.nextInt();
		
		//Step 1 - insert element in array
		for(i = 0; i < n; i++)
		{
			System.out.println("Enter elements");
			num[i] = sc.nextInt();
		}
		
		int res = findSumOfArray(num);
		System.out.println(res);
	}

}
