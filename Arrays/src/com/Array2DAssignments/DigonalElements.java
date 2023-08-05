package com.Array2DAssignments;

public class DigonalElements {

	public static void main(String[] args) {
		int arr[][] = { {12,56,87 },
						{32,78,45 },
						{79,33,67}};
		
		for(int  i = 0; i <= arr.length; i++)
		{
			for(int j = 0; j <= arr.length; j++)
			{
				if(i == j)
				{
					System.out.println(arr[i][j]);
				}
			}
		}

	}

}
