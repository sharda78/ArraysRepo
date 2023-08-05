package com.arrayAssignments;

import java.util.Arrays;

/*
 
 10.WAP to insert an element in a specific position into an array.
11.	WAP to put even and odd elements of array in two separate arrays.
12.	WAP to find the maximum and minimum value in an array.
13.	WAP to find and count total number of duplicate elements in an array.

15.	WAP to find the second smallest element in an array.

18.WAP sort array elements in ascending order.

 */
public class ArrayAssign10to16 {

	public static void evennums(int arr[])
	{
		int newEven[],newOdd[];
		int i ,len = arr.length;
		int ieven = 0,iodd = 0;
		
		newEven = new int[len];
		newOdd = new int[len];
		
		for(i = 0; i < len; i++)
		{
			if(arr[i] % 2 == 0)
			{
				newEven[ieven] = arr[i];
				ieven++;
			}
			else
			{
				newOdd[iodd] = arr[i];
				iodd++;
			}
		}
		System.out.println("\nPriting Arry of Even Num");
		for(i = 0; i < ieven; i++)
		{
			System.out.println(newEven[i]);
		}
		System.out.println("\nPrinting Arry of Odd Num");
		for(i = 0; i < iodd; i++)
		{
			System.out.println(newOdd[i]);
		}
	}
	public static void maxminnums(int[] maxmin)
	{
		int len = maxmin.length,min,max;
		System.out.println("\n------To find Max Num And Min Num In Array-------");
		 Arrays.sort(maxmin);
		 System.out.println("Array Sort in Ascending Order: ");
		 System.out.println(maxmin[0] + "\n" + maxmin[1] + "\n" + maxmin[2] + "\n" + maxmin[3] + "\n" + maxmin[4] + "\n" + maxmin[5]);
		 System.out.println("Minimum Number: " + maxmin[0]);
		 System.out.println("Maximun Number: " + maxmin[len-1]);
		 System.out.println("\nsecond smallest element in an array: " + maxmin[len-2]);
	}
	public static void duplicateelements(int dup[])
	{
		System.out.println("\n------To find and count total num of duplicate element -------");
		int len = dup.length,cnt = 0;
		System.out.println("Duplicate Elements Are: ");
		for(int i=0; i < len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(dup[i] == dup[j])
				{
					cnt++;
					System.out.println(dup[i] );
				}
			
			}
		}
		System.out.println("\nCount is: " + cnt);
		
		
	}
	
	
	public static void main(String[] args) 
	{
	int num[] = new int[6];
	
	num[0] = 22;
	num[1] = 953;
	num[2] = 22;
	num[3] = 75;
	num[4] = 84;
	num[5] = 75;
	//accessing array element by index
	System.out.println("--------After inserting array element-------");
	System.out.println("Element at index 0: " + num[0]);
	System.out.println("Element at index 1: " + num[1]);
	System.out.println("Element at index 2: " + num[2]);
	System.out.println("Element at index 3: " + num[3]);
	System.out.println("Element at index 4: " + num[4]);
	System.out.println("Element at index 5: " + num[5]);
	

	 evennums(num);

	 maxminnums(num);
	 duplicateelements(num);
	
	}

}
