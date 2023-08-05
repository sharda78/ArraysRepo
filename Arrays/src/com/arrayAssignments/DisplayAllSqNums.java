package com.arrayAssignments;
/*
 WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.
 */
public class DisplayAllSqNums
{
	public static void printSquarenumber(int[] sq)
	{
		int len = sq.length;
		int square = 0;
		System.out.println("All Square Number Present In Array: ");
		for(int i = 1; i < len; i++)
		{
			 square = i * i;
			 //System.out.println(square);
		
		for(int j = 0; j < len; j++)
		{
			if(sq[j] == square)
			{
				System.out.println(sq[j]);
			
			}
		}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		DisplayAllSqNums.printSquarenumber(arr);
	}

}
