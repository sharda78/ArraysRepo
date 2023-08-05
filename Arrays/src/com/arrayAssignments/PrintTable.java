package com.arrayAssignments;

import java.util.Scanner;

/*
 Accept number from user and add table of number in array and display 
 */
public class PrintTable {
	public static void display()
	{
		int newarr[] =  new int[11];
		int len = newarr.length;
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int i = 1;
		
		for(;i < len;)
		{
			newarr[i] = num * i;
		
			System.out.println(num + " * " + i + "  = " + newarr[i]);
			i++;
		}
	}
	

	public static void main(String[] args) {
		
		PrintTable p = new PrintTable();
		p.display();
		
		
	}

}
