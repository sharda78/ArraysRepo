package com.Array2DAssignments;

public class Find2DArrayMin
{
	public static void find2dmin(int [][]arr1)
	{
		int min=arr1[0][0];
		int len = arr1.length;
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len+1; j++)
			{
				if(arr1[i][j] < min)
					min = arr1[i][j];
					
			}

		}
		System.out.print("Minimum Number in 1st Row : " + min);
	}
	
	public static void find2dmin2(int [][] arr2)
	{
		int len  = arr2.length;
		for(int i = 0; i < len; i++)
		{
			int min2 = arr2[i][0];
			for(int j = 0; j < len; j++)
			{
				if(arr2[i][j] < min2)
				{
					 min2 = arr2[i][j];
				}
			}
		
		System.out.println("Minimum Number in 2nd Row : " + min2);
		}
	
	}
	

	public static void main(String[] args) 
	{
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		
		
		find2dmin2(arr);
		find2dmin(arr);	

	}

}
