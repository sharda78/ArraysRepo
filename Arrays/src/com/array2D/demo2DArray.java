package com.array2D;

public class demo2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][];
		mat = new int[3][3];
		
		int arr2[][] = {{23,45},{67,78}};
		//or
		
		int arr[][] = new int[2][2];
		//or
		
		int rows = 4;
		int cols = 3;
		
		int arr1[][] = new int[rows][cols];
		
		//accessing 2d array
		
		System.out.println("Elements in 2d array");
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
		
		//after inserting value
		arr1[0][0] = 50;
		arr1[1][0] = 400;
		arr1[0][1] = 20;
		arr1[1][1] = 39;
		
		
		System.out.println("\nAfter inserting  element");
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
		
		
		System.out.println("\n----By using for loop in matrix form ---");
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print( arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n----By using for loop---");
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.println("Elements at arr[" + i + "] [" + j + "]=" + arr1[i][j]);
			}
		
		}
		
		System.out.println("-----2D------");
		for(int k = 0; k < 2; k++)
		{
			for(int l =0; l < 2; l++)
			{
				System.out.print(arr2[k][l] +"\t");
			}
			System.out.println();
		}
		
		
	}

}
