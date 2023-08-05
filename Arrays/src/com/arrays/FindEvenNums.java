package com.arrays;
/*
 1)
 2)
 */
import java.util.Scanner;

public class FindEvenNums 
{

	public static void findevennums(int arr[])
	{
		int i ,len = arr.length;
		
		System.out.println("------By using for loop--------");
		for(i=0; i<len; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("\n-----By Using For-Each Loop-------");
		for(int b:arr)
		{
			if(b % 2 == 0)
			{
				System.out.println(b);
			}
		}
	}
	public static void main(String[] args)  
	{
		int num[] = {12,45,6,90,43,67,65,88};
		
		System.out.println("Even number from array");
		findevennums(num);

	}

}
