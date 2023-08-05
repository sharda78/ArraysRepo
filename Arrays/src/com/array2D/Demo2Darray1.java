package com.array2D;

import java.util.Scanner;

public class Demo2Darray1 {

	public static void main(String[] args) {
		int tab[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		
		System.out.println("ENter no of columns");
		int cols = sc.nextInt();
		
		System.out.println("Enter elements in 2Darray");
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.println("Enter element for tab [" + i +"][" +j + "]");
				tab[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("\n----2D Array--------");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
