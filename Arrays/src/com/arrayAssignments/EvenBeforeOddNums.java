package com.arrayAssignments;
/*
 33.	WAP to arrange the elements of an given array of integers where all Even integers appear before all the Odd integers.


 */
public class EvenBeforeOddNums 
{
	public static void print(int num[])
	{
		int len = num.length;
		
		System.out.println("To Print All Even integers appear before all the Odd integers");
		for(int i = 0; i < len; i++)
		{
			if(num[i] % 2 == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
		
		for(int i = 0; i < len; i++)
		{
			if(num[i] % 2 != 0)
			{
				System.out.print(" " + num[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		print(arr);

	}

}
