package com.arrayAssignments;
/*
 Write a Java program to test the equality of two arrays. Means 
 e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal 
 */

class Equality
{
	public static void checkequality(int[] a1,int a2[])
	{
		for(int i = 0; i < a1.length; i++)
		{
			for(int j = 0; j < a2.length; j++)
			{
				if(a1[i] == a2[j])
				{
					//System.out.print( a1[i] + " ");
				}
			}
		}
		System.out.println("\nGiven Both Arrays Are Equal");
	}
}
public class TestEquality {

	public static void main(String[] args) {
		
		int arr1[] = {12, 22, 32, 42, 52, 62};
		int arr2[] = {52, 22, 62, 12, 42, 32 };
		
		Equality.checkequality(arr1,arr2);
	}

}
