package com.Array2DAssignments;
//. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
// output is: 31 and 25
public class FindMaxIn2DArray {

	public static void find2dmax(int [][]arr1)
	{
		int max=arr1[0][0];
		int len = arr1.length;
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len+1; j++)
			{
				if(arr1[i][j] > max)
					max = arr1[i][j];
					
			}

		}
		System.out.print("Maximum Number in 1st Row : " + max);
	}
	
	public static void find2dmax2(int [][] arr2)
	{
		int max2 = arr2[0][0];
		int len  = arr2.length;
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len+1; j++)
			{
				if(arr2[i][j] > max2)
				{
					 max2 = arr2[i + 1][j];
				}
			}
		}
		System.out.println("Maximum Number in 2nd Row : " + max2);
	}
	
	public static void main(String[] args) {
	int arr[][] = {{22, 31, 9}, {12, 25, 16}};
	
	
	find2dmax2(arr);
	find2dmax(arr);
	

	}

}
