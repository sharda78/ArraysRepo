package com.arrayAssignments;
/*
 30.WAP to replace all negative value with its immediate left elements square. 
 square Means arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
 	Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 
 */
public class LeftElementSq 
{
	public static void findleftelementsquare(int a[])
	{
		int newArr[] = new int[a.length];
		
		System.out.println("Given Array is [12, 3, -19, 29, 5, -61, 44, 7, -9]");
		System.out.println("\nTo replace all negative value with its immediate left elements square.");
		for(int i = 0; i < a.length; i++)
		{
			newArr[i] = a[i];
			if(a[i] < 0)
			{
				
				newArr[i] = (a[i-1] * a[i-1]);
			}
		}
		
		for(int b : newArr)
		{
			System.out.print(b + ", ");
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		int arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};
		
		findleftelementsquare(arr);
	}

}
