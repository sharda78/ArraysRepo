package com.arrays;
//WAP to print array in reverse

public class ArrayDemo6 
{
	public static void main(String[] args) {
		
		 
		
		int arr[] = { 32,45,85,31,89,90};
		int i , len = arr.length;
		
		// print array in reverse order
		System.out.println("--------Array in Reverse Order--------");
		for(i = len-1; i >= 0; i--)
		{
			System.out.println("Array of index " + i + ": " + arr[i]);
		
		}
		//limitations of for-each
		//for-each iterates in forward direction
	}

}
