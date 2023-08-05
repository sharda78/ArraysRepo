package com.array2D;

public class Transpose {

	public static void main(String[] args) {
		int mat[][] = { {34,56},{67,89}};
		
		int i ,j;
		
		int transpose[][] = new int[2][2];
		
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				transpose[j][i] = mat[i][j];
			}
		}
		
		System.out.println("-----MAT------");
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("--------Transpose-----------");
		
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				System.out.print(transpose[i][j] + "\t");
				
			}
			System.out.println();
		}
	}

}
