package com.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int num[];
		//byte []arr;
		//String []name;
		//Student []stu;
		
		//instantiating an array
		//allocation memory
		num = new int[5];
		
		System.out.println("--------Before inserting array element-------");
		System.out.println("Element at index 0: " + num[0]);
		System.out.println("Element at index 1: " + num[1]);
		System.out.println("Element at index 2: " + num[2]);
		System.out.println("Element at index 3: " + num[3]);
		System.out.println("Element at index 4: " + num[4]);
		
		//assigning/initializing value to array
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		//accessing array element by index
		System.out.println("--------After inserting array element-------");
		System.out.println("Element at index 0: " + num[0]);
		System.out.println("Element at index 1: " + num[1]);
		System.out.println("Element at index 2: " + num[2]);
		System.out.println("Element at index 3: " + num[3]);
		System.out.println("Element at index 4: " + num[4]);
		
		
	}

}
