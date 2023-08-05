package com.arrays;

import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		String []names = new String[10];
		
		int len = names.length;
		System.out.println("Length: " + len);
		Scanner sc = new Scanner(System.in);
		 System.out.println("how many names you want to print");
		 int n  = sc.nextInt();
		 
		 System.out.println("-----------Array(take input from user)--------");
		 for(int i = 0; i < n ; i++)
		 {
			 System.out.println("Enter names: ");
			 names[i] = sc.next();
		 }
		 System.out.println("-----------Array--------");
		 for(int i = 0; i < n;i++)
		 {
			 System.out.println("Names at index " +i+" :" + names[i]);
		 }
		 sc.close();

	}

}
