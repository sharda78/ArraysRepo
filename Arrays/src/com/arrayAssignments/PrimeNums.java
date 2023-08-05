package com.arrayAssignments;
/*
 6.	WAP to take array and print prime numbers
 */
public class PrimeNums {

	public static void main(String[] args) {
		
		
		
		int arr[] = {34,78,43,17,68,44,36,89,37,35,67,5};
		int i ,len = arr.length;
		System.out.println("\n--------Prime Number In Array---------");
		for( i = 0; i < len; i++)
		{
			boolean isPrime = true;
			for(int b = 2; b < arr[i]; b++)
			{
			if(arr[i] % b == 0)
			{
				isPrime = false;
				break;
			}
			}
			
		
		if(isPrime)
		{
			System.out.println(arr[i]);
		}
		}

	}

}
