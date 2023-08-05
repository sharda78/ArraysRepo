package com.array2D;

import java.util.Scanner;

public class AdditionOf2Matrices {

	public static void main(String[] args) {
		int mat1[][] = {{10,20},{30,40}};
		int mat2[][] =  { { 1,2} , {3,4}};
		
		int sum[][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		
		System.out.println("ENter no of columns");
		int cols = sc.nextInt();
		
		System.out.println("Sum of two materices");
		for(int i = 0 ; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
